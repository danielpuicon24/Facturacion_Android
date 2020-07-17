package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.proyecto.datos.Conexion;
import com.example.proyecto.logica.Departamento;
import com.example.proyecto.logica.Distrito;
import com.example.proyecto.logica.Pais;
import com.example.proyecto.logica.Provincia;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.logica.TipoDocumento;
import com.example.proyecto.util.ServiciosWeb;

import org.json.JSONObject;

public class RegistrarClienteActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, View.OnTouchListener {
    // 1. Definir variables de la vista
    EditText    txtNumeroCliente, txtNombreCliente, txtDireccionCliente,
            txtTelefonoCliente, txtEmailCliente, txtNombreComercialCliente;
    Button      btnRegistrarCliente;
    Spinner spTipoDocIDCliente, spPaisCliente, spDepartamentoCliente, spProvinciaCliente, spDistritoCliente;

    public String nombreComercialP;

    boolean usuarioTocaPantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_cliente);

        // 2. Enlazar / vincular con las variables de la vista
        txtNumeroCliente       = findViewById(R.id.txtNumeroCliente);
        txtNombreComercialCliente       = findViewById(R.id.txtNombreComercialCliente);
        txtNombreCliente    = findViewById(R.id.txtNombreCliente);
        txtDireccionCliente = findViewById(R.id.txtDireccionCliente);
        txtTelefonoCliente  = findViewById(R.id.txtTelefonoCliente);
        txtEmailCliente     = findViewById(R.id.txtEmailCliente);

        spTipoDocIDCliente = (Spinner) findViewById(R.id.spTipoDocIDCliente);
        spPaisCliente = (Spinner) findViewById(R.id.spPaisCliente);
        spDepartamentoCliente= (Spinner) findViewById(R.id.spDepartamentoCliente);
        spProvinciaCliente= (Spinner) findViewById(R.id.spProvinciaCliente);
        spDistritoCliente= (Spinner) findViewById(R.id.spDistritoCliente);

        spTipoDocIDCliente.setOnItemSelectedListener(this);
        spPaisCliente.setOnItemSelectedListener(this);
        spDepartamentoCliente.setOnItemSelectedListener(this);
        spProvinciaCliente.setOnItemSelectedListener(this);
        spDistritoCliente.setOnItemSelectedListener(this);



        btnRegistrarCliente = findViewById(R.id.btnRegistrarCliente);

        //Referenciar la variable context que esta en la clase Conexion
        Conexion.context = this;

        // 3. Se escuche el click sobre el botón btnRegistrar
        btnRegistrarCliente.setOnClickListener(this);

        //Llamar al método cargarSpinnerTipoDocID()
        this.cargarSpinnerTipoDocID();

        //Llamar al método cargarSpinnerPais()
        this.cargarSpinnerPais();

        //Llamar al método cargarSpinnerDepartamento()
        this.cargarSpinnerDepartamento();

        //poner no editable el txtComercial
        txtNombreComercialCliente.setEnabled(false);


        //indicar a los sp que reconozcan el evento ontouch
        spDepartamentoCliente.setOnTouchListener(this);
        spProvinciaCliente.setOnTouchListener(this);
        spDistritoCliente.setOnTouchListener(this);
        spTipoDocIDCliente.setOnTouchListener(this);
    }

    @Override
    public void onClick(View view)
    {
        new AgregarCliente(
                txtNumeroCliente.getText().toString(),
                txtNombreCliente.getText().toString(),
                nombreComercialP,
                txtDireccionCliente.getText().toString(),
                txtTelefonoCliente.getText().toString(),
                txtEmailCliente.getText().toString(),
                Departamento.listaDepartamentos.get(spDepartamentoCliente.getSelectedItemPosition()).getCodigoDepartamento().toString(),
                Provincia.listaProvincias.get(spProvinciaCliente.getSelectedItemPosition()).getCodigoProvincia().toString(),
                Distrito.listaDistritos.get(spDistritoCliente.getSelectedItemPosition()).getCodigoDistrito().toString(),
                Pais.listaPaises.get(spPaisCliente.getSelectedItemPosition()).getcodigoPais().toString(),
                TipoDocumento.listaTipoDocumento.get(spTipoDocIDCliente.getSelectedItemPosition()).getCodigoTipoDocumento().toString()

        ).execute();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        usuarioTocaPantalla=true; //significa que el usuario a tocado algunos de los sp
        //Si el usu ha tocado algunos de los sp debe cargar prov y el distrito automaticamente en cascada
        return false;
    }



    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        //Solo se hace en cascada si toca alguno de los sp
        if (usuarioTocaPantalla){ //significa que el usuario toco alguno de sus spiners
            switch (adapterView.getId())
            {
                case R.id.spDepartamentoCliente:
                {
                    String codigoDepartamento = Departamento.listaDepartamentos
                            .get(spDepartamentoCliente.getSelectedItemPosition()).getCodigoDepartamento();
                    cargarSpinnerProvincia(codigoDepartamento);
                } break;
                case R.id.spProvinciaCliente:
                {
                    String codigoDepartamento = Departamento.listaDepartamentos
                            .get(spDepartamentoCliente.getSelectedItemPosition()).getCodigoDepartamento();
                    String codigoProvincia = Provincia.listaProvincias
                            .get(spProvinciaCliente.getSelectedItemPosition()).getCodigoProvincia();
                    cargarSpinnerDistrito( codigoProvincia);
                } break;
                case R.id.spTipoDocIDCliente:
                    if(spTipoDocIDCliente.getSelectedItem().toString().equalsIgnoreCase("RUC") || spTipoDocIDCliente.getSelectedItem().toString().equalsIgnoreCase("Doc.trib.no.dom.sin.ruc")){
                        txtNombreComercialCliente.setEnabled(true);
                        nombreComercialP=txtNombreComercialCliente.getText().toString();
                    }else{
                        nombreComercialP=null;
                    }

                    break;
                //agregarle más sw de los otros sp JHEINER
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    // 4. Crear tarea asíncrona para registrar cliente
    private class AgregarCliente extends AsyncTask<Void, Void, String>
    {
        // Atributos
        ProgressDialog pDialog;
        private String numero;
        private String nombre;
        private String nombreComercial;
        private String direccion;
        private String telefono;
        private String email;
        private String codigoDepartamento;
        private String codigoProvincia;
        private String codigoDistrito;
        private String codigoPais;
        private String codigoTipoDocId;

        public AgregarCliente(String numero, String nombre, String nombreComercial, String direccion, String telefono, String email, String codigoDepartamento, String codigoProvincia, String codigoDistrito, String codigoPais, String codigoTipoDocId) {
            this.numero = numero;
            this.nombre = nombre;
            this.nombreComercial = nombreComercial;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
            this.codigoDepartamento = codigoDepartamento;
            this.codigoProvincia = codigoProvincia;
            this.codigoDistrito = codigoDistrito;
            this.codigoPais = codigoPais;
            this.codigoTipoDocId = codigoTipoDocId;
        }

//Generar con IDE: Método constructor
       /* public AgregarCliente(String dni, String nombre, String nombreComercial,String direccion, String telefono, String email ,String codigoDepartamento, String codigoProvincia, String codigoDistrito)
        {
            this.dni = dni;
            this.nombre = nombre;
            this.nombreComercial = nombreComercial;
            this.direccion = direccion;
            this.telefono = telefono;
            this.email = email;
            this.codigoDepartamento = codigoDepartamento;
            this.codigoProvincia = codigoProvincia;
            this.codigoDistrito = codigoDistrito;
        }*/

        // Antes de realizar la peticion a WS
        @Override
        protected void onPreExecute()
        {
            super.onPreExecute();
            //Configurar el mensaje de espera...
            pDialog = new ProgressDialog(RegistrarClienteActivity.this);
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
                String url = ServiciosWeb.URL_WS + "persons/store";
                JSONObject datosPeticion = new JSONObject();
                datosPeticion.put("id", null);
                datosPeticion.put("type", "customers");
                datosPeticion.put("identity_document_type_id", this.codigoTipoDocId);
                datosPeticion.put("number", this.numero);
                datosPeticion.put("name", this.nombre);
                datosPeticion.put("trade_name", this.nombreComercial);
                datosPeticion.put("country_id", this.codigoPais);
                datosPeticion.put("department_id", this.codigoDepartamento);
                datosPeticion.put("province_id", this.codigoProvincia);
                datosPeticion.put("district_id", this.codigoDistrito);
                datosPeticion.put("address", this.direccion);
                datosPeticion.put("telephone", this.telefono);
                datosPeticion.put("email", this.email);

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
                    String message = json.getString("message");

                    if (success)
                    {

                        Toast.makeText(RegistrarClienteActivity.this,
                                message, Toast.LENGTH_SHORT).show();
                        RegistrarClienteActivity.this.finish();
                    }
                    else
                    {
                        Toast.makeText(RegistrarClienteActivity.this,
                                "No es posible registrar al cliente." + resultado, Toast.LENGTH_LONG).show();
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



    private void cargarSpinnerDepartamento() {
        String listaDepartamentos[] = new Departamento().obtenerListaDepartamentos();
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        listaDepartamentos
                );

        spDepartamentoCliente.setAdapter(adapter);
    }

    private void cargarSpinnerPais() {

        String listaPaises[] = new Pais().obtenerListaPaises();
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        listaPaises
                );

        spPaisCliente.setAdapter(adapter);
    }
    private void cargarSpinnerTipoDocID() {

        String listaTipoDocId[] = new TipoDocumento().obtenerListaTipoDocId();
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        listaTipoDocId
                );

        spTipoDocIDCliente.setAdapter(adapter);
    }

    private void cargarSpinnerProvincia(String codigoDepartamento)
    {
        String listaProvincias[] = new Provincia().obtenerListaProvincias(codigoDepartamento);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        listaProvincias
                );

        spProvinciaCliente.setAdapter(adapter);
    }

    private void cargarSpinnerDistrito( String codigoProvincia)
    {
        String listaDistritos[] =
                new Distrito().obtenerListaDistritos( codigoProvincia);
        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        listaDistritos
                );

        spDistritoCliente.setAdapter(adapter);
    }
}
