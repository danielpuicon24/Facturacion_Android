package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.proyecto.logica.Cliente;
import com.example.proyecto.logica.Comprobante;
import com.example.proyecto.logica.Producto;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.Funciones;
import com.example.proyecto.util.ServiciosWeb;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class RegistrarComprobante extends AppCompatActivity implements View.OnClickListener {

    public ProgressDialog dialog;
    public RecyclerView detalleRecyclerView;
    public ListadoDetalleComprobanteAdaptador adaptador;
    EditText txtFechaEmision,txtNumeroSerie,txtTotal,txtOpGravada,txtIgv;
    Spinner spnCliente;
    RadioButton rbBoleta,rbFactura;
    Button btnRegistrarComprobante;
    public static ArrayList<Producto> listaProductosDetalle = new ArrayList<Producto>();

    private float opGravada;
    private float igv;
    private float total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_comprobante);

        //iniciar los totales
        opGravada = 0;
        igv = 0;
        total = 0;

        new ListadoClienteTask().execute();

        //setear titulo
        setTitle("Emisión de comprobante");

        /*llenando el detalle de comprobante*/
        detalleRecyclerView = findViewById(R.id.detalleRecyclerView);
        detalleRecyclerView.setHasFixedSize(true);
        detalleRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        //leer del arreglo del fragment, cuales tienen cantidad mayor a 0 y pasarlos al array de detalle producto
        this.leerDatosProductosConCantidad();

        //Instanciar al adaptado. Se envía this.getContext() para relacionar el adaptador con el fragment
        adaptador = new ListadoDetalleComprobanteAdaptador(this);

        //Enviar el adaptador al RecyclerView
        detalleRecyclerView.setAdapter(adaptador);

        /*Fin llenado el detalle de comprobante*/

        //enlazar controles
        btnRegistrarComprobante = findViewById(R.id.btnRegistrarComprobante);
        txtTotal = findViewById(R.id.txtTotalComprobante);
        txtOpGravada = findViewById(R.id.txtOpGravadaComprobante);
        txtIgv = findViewById(R.id.txtIgvComprobante);
        txtNumeroSerie = findViewById(R.id.txtNumeroSerieComprobante);
        rbBoleta = findViewById(R.id.rbBoleta);
        txtFechaEmision = findViewById(R.id.txtFechaEmision);
        rbFactura = findViewById(R.id.rbFactura);
        spnCliente = findViewById(R.id.spnClienteComprobante);

        btnRegistrarComprobante.setOnClickListener(this);

        //check a boleta por defecto
        rbBoleta.setChecked(true);

        //llenar spinner
        // this.llenarSpinnerCliente();

        //setear totales
        txtIgv.setText(String.valueOf(igv));
        txtTotal.setText(String.valueOf(total));
        txtOpGravada.setText(String.valueOf(opGravada));
        txtIgv.setEnabled(false);
        txtTotal.setEnabled(false);
        txtOpGravada.setEnabled(false);
    }


    private void leerDatosProductosConCantidad(){
        listaProductosDetalle.clear();
        for ( Producto producto : ListadoProductosAdaptador.listaProductos ) {
            if (producto.getCantidad()>0){
                listaProductosDetalle.add(producto);
                opGravada = opGravada + producto.getTotal_base();
                total = total + producto.getTotal_item();
            }
        }
        igv = total - opGravada;
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnRegistrarComprobante:

                final String tipoComprobante;
                final String serie = txtNumeroSerie.getText().toString();
                final String fechaEmision = txtFechaEmision.getText().toString();
                final int codigoCliente = Cliente.listaCliente.get(spnCliente.getSelectedItemPosition()).getId();
                final double total = Double.parseDouble(txtTotal.getText().toString());
                final double totalIgv = Double.parseDouble(txtIgv.getText().toString());
                final double totalOpGravada = Double.parseDouble(txtOpGravada.getText().toString());
                final JSONObject detalleCliente;
                final JSONArray detalleItem;
                final JSONObject detalleTotales;

                if (rbBoleta.isChecked()){
                    tipoComprobante = "03"; //Boleta
                }else{
                    tipoComprobante = "01"; //Factura
                }

                Funciones.localizacion(this);

                //Construir el detalle del cliente en formato JSON
                JSONObject jsonObjectCliente = new JSONObject();


                //Crear el JSON para el cliente, busca el cliente seleccionado en el spinner y lo convierte.
                for (Cliente cliente : Cliente.listaCliente) {
                    if (cliente.getId()==codigoCliente) {
                        jsonObjectCliente = cliente.generarJSONDatosCliente();
                        break;
                    }
                }
                //Convertir la variable JSONArray a Cadena
                detalleCliente = jsonObjectCliente;
                //Construir el detalle del item en formato JSON
                JSONArray jsonArrayItem = new JSONArray();

                //Crear el JSON para cada producto cuya cantidad sea mayor a cero
                for (Producto producto : listaProductosDetalle) {
                    jsonArrayItem.put(producto.generarJSONItems());
                }
                //Convertir la variable JSONArray a Cadena
                detalleItem = jsonArrayItem;

                //construir detalle totales
                //Crear el JSON para el total del comprobante
                JSONObject jsonObjectTotales = new JSONObject();
                Comprobante objComprobante = new Comprobante();
                jsonObjectTotales = objComprobante.generarJSONTotales(totalOpGravada,totalIgv,total);

                //Convertir la variable JSONArray a Cadena
                detalleTotales = jsonObjectTotales;


                //Crear un cuadro de dialogo para que el usuario confirme si desea grabar la venta
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("Confirme");
                dialog.setIcon(R.drawable.ic_question);
                dialog.setMessage("Desea grabar los datos de la venta");

                //Configurar el boton "SI"
                dialog.setPositiveButton("SI GRABAR", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        //LLamar aqui a la clase VentaTask
                        new AgregarComprobante(tipoComprobante, serie, fechaEmision, detalleCliente,detalleTotales,detalleItem).execute();
                    }
                });

                dialog.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                //Mostrar el cuadro de dialogo
                AlertDialog alertDialog = dialog.create();
                alertDialog.show();
                break;

        }


    }

    //llenado del spinner

    private void llenarSpinnerCliente(){

        String listaClientes[] = new String[Cliente.listaCliente.size()];
        for(int i = 0; i<Cliente.listaCliente.size();i++){
            Cliente data = Cliente.listaCliente.get(i);
            listaClientes[i] = data.getNombre();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_dropdown_item,listaClientes);
        spnCliente.setAdapter(adapter);
    }

    //tarea asincrona de registro
    private class AgregarComprobante extends AsyncTask<Void, Void, String>
    {
        // Atributos
        ProgressDialog pDialog;
        private String tipoComprobante;
        private String serie;
        private String fechaEmision;
        private JSONObject detalleCliente;
        private JSONObject detalleTotales;
        private JSONArray detalleItem;

        public AgregarComprobante(String tipoComprobante,String serie,String fechaEmision,JSONObject detalleCliente,JSONObject detalleTotales,JSONArray detalleItem) {
            this.tipoComprobante = tipoComprobante;
            this.serie = serie;
            this.fechaEmision = fechaEmision;
            this.detalleCliente = detalleCliente;
            this.detalleTotales = detalleTotales;
            this.detalleItem = detalleItem;
        }

        // Antes de realizar la peticion a WS
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
            //Configurar el mensaje de espera...
            pDialog = new ProgressDialog(RegistrarComprobante.this);
            pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pDialog.setMessage("Procesando datos...");
            pDialog.setCancelable(false);
            pDialog.show();
        }

        // La peticion a la WS
        @Override
        protected String doInBackground(Void... voids)
        {
            String resultado = "";
            // Definir la URL a la cual voy a requerir
            try
            {

                String url = ServiciosWeb.URL_WS + "documents";
                JSONObject datosPeticion = new JSONObject();
                datosPeticion.put("serie_documento", this.serie);
                datosPeticion.put("numero_documento", "#");
                datosPeticion.put("fecha_de_emision", this.fechaEmision);
                datosPeticion.put("hora_de_emision", "10:11:11");                 ///agregar hora correcta
                datosPeticion.put("codigo_tipo_operacion", "0101");
                datosPeticion.put("codigo_tipo_documento", this.tipoComprobante);
                datosPeticion.put("codigo_tipo_moneda", "PEN");
                datosPeticion.put("fecha_de_vencimiento", this.fechaEmision);
                datosPeticion.put("datos_del_cliente_o_receptor", this.detalleCliente);
                datosPeticion.put("items", this.detalleItem);
                datosPeticion.put("totales", this.detalleTotales);
                datosPeticion.put("informacion_adicional", "latitud: "+Funciones.latitud+"| longitud: "+Funciones.longitud);

                System.out.println(datosPeticion);

                resultado = new ServiciosWeb().openWebServiceBearer(url, Sesion.TOKEN, datosPeticion);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            return resultado;
        }

        // Despues de realizar la peticion a WS
        @Override
        protected void onPostExecute(String resultado)
        {
            super.onPostExecute(resultado);
            if(!resultado.isEmpty())
            {
                try
                {
                    JSONObject json = new JSONObject(resultado);
                    boolean success = json.getBoolean("success");

                    if (success)
                    {
                        Toast.makeText(RegistrarComprobante.this,
                                "Comprobante registrado con éxito", Toast.LENGTH_SHORT).show();

                        setResult(Activity.RESULT_OK);
                        RegistrarComprobante.this.finish();

                    }
                    else
                    {
                        Toast.makeText(RegistrarComprobante.this,
                                "Ha ocurrido un error al intentar registrar el comprobante" + resultado, Toast.LENGTH_LONG).show();
                    }
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    pDialog.dismiss();
                }
            }
        }
    }

    private class ListadoClienteTask extends AsyncTask<Void, Void, Boolean> {
        @Override
        protected Boolean doInBackground(Void... voids) {
            boolean respuesta = false;
            try {
                String URLServicioWeb = ServiciosWeb.URL_WS + "persons";
                JSONObject datosPeticion = new JSONObject();
                datosPeticion.put("id", null);
                //llamar servicio web
                String clientesServicioWeb = new ServiciosWeb().openWebServiceBearer(URLServicioWeb, Sesion.TOKEN, datosPeticion);

                JSONObject jsonObject = new JSONObject(clientesServicioWeb);

                JSONArray jsonArray = jsonObject.getJSONArray("data");
                //limpiar lista clientes
                Cliente.listaCliente.clear();

                //extraer la data de clientes
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject datosCliente = jsonArray.getJSONObject(i);
                    Cliente objCliente = new Cliente();
                    objCliente.setId(datosCliente.getInt("id"));
                    objCliente.setNumero_documento(datosCliente.getString("number"));
                    objCliente.setNombre(datosCliente.getString("name"));
                    objCliente.setTipo_documento_identidad(datosCliente.getString("identity_document_type_id"));
                    objCliente.setPais(datosCliente.getString("country_id"));
                    objCliente.setUbigeo(datosCliente.getString("ubigeo"));
                    objCliente.setDireccion(datosCliente.getString("address"));
                    objCliente.setTelefono(datosCliente.getString("telephone"));
                    objCliente.setEmail(datosCliente.getString("email"));
                    Cliente.listaCliente.add(objCliente);
                }
                respuesta = true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return respuesta;
        }

        @Override
        protected void onPostExecute(Boolean respuesta) {
            super.onPostExecute(respuesta);
            if(respuesta){
                llenarSpinnerCliente();
            }
            else{
                Toast.makeText(getParent(), "ERROR AL OBTENER CLIENTES", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }
    }


}

