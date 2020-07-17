package com.example.proyecto;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.example.proyecto.logica.Producto;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.ServiciosWeb;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;


public class ListadoProductosFragment extends Fragment implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener{
    public ArrayList<Producto> listaProducto;
    public ListadoProductosAdaptador adaptador;
    public ProgressDialog dialog;
    public RecyclerView productoRecyclerView;

    Button btnVentaConfirmar;

    //Declarar el control SwipeRefreshLayout
    SwipeRefreshLayout swipeRefreshLayout;

    public ListadoProductosFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listado_productos, container, false);

        this.getActivity().setTitle("Listado de productos");

        /*Configurar el control RecyclerView*/
        productoRecyclerView = view.findViewById(R.id.productoRecyclerView);
        productoRecyclerView.setHasFixedSize(true);
        productoRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        //Enlazar el botón btnVentaConfirmar
        btnVentaConfirmar = view.findViewById(R.id.btnVentaConfirmar);
        btnVentaConfirmar.setOnClickListener(this);

        //Enlazar el control swipeRefreshLayout
        swipeRefreshLayout = view.findViewById(R.id.swipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(this);

        //Configurar los colores del swipeRefreshLayout
        swipeRefreshLayout.setColorScheme(
                android.R.color.holo_red_light,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_blue_light
        );

        //Llamar al método listar
        this.listar();

        return view;

    }

    private void listar(){
        //Mostrar una dialogo de espera mientras se descargan los datos
        dialog = new ProgressDialog(this.getContext());
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Descargando lista de productos");
        dialog.setCancelable(false);
        dialog.show();

        //Instanciar la lista listaProducto (Inicializar la lista)
        listaProducto = new ArrayList<Producto>();

        //Instanciar al adaptador.
        //Se envía this.getContext() para relacionar el adaptador con el fragment
        adaptador = new ListadoProductosAdaptador(this.getContext());

        //Enviar el adaptador al RecyclerView
        productoRecyclerView.setAdapter(adaptador);

        //Llamar a la clase ListarProductoTask para ejecutar la descarga de datos desde el servicio web
        new ListarProductoTask().execute();

    }

    //Declarar constante para verificar la respuesta que nos dará al cerrar el activity VentaRegistrarActivity
    private static final int VENTA_REGISTRADA = 1;

    @Override
    public void onClick(View view) {
        //Validar que exista productos con cantidad mayor que cero
        int cantidad=0;
        for (Producto producto: ListadoProductosAdaptador.listaProductos ) {
            if (producto.getCantidad()>0){
                cantidad++;
            }
        }

        if (cantidad==0){
            Toast.makeText(this.getContext(), "Debe indicar la cantidad de al menos un producto", Toast.LENGTH_SHORT).show();
            return;
        }
        Intent intent = new Intent(this.getContext(), RegistrarComprobante.class);
        startActivityForResult(intent, VENTA_REGISTRADA);
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //Este método se ejecuta cuando el activity que se acaba de cerrar nos ha enviado una respuesta

        if (requestCode == VENTA_REGISTRADA){
            if (resultCode == Activity.RESULT_OK){
                //Llamar al método que coloca las cantidad de los productos que estan en el catálogo a cero
                adaptador.limpiarCantidad();
            }
        }

    }

    @Override
    public void onRefresh() {
        //Llamar al método listar()
        this.listar();

        //Cerrar la animación del swipeRefreshLayout
        swipeRefreshLayout.setRefreshing(false);
    }

    private class ListarProductoTask extends AsyncTask<Void, Void, Boolean>{

        @Override
        protected Boolean doInBackground(Void... voids) {
            boolean respuesta=false;
            try {
                String URLServicioWeb = ServiciosWeb.URL_WS + "items";
                JSONObject datosPeticion = new JSONObject();
                datosPeticion.put("id",null);
                //llamar servicio web
                String productosServicioWeb = new ServiciosWeb().openWebServiceBearer(URLServicioWeb,Sesion.TOKEN ,datosPeticion);

                //Pasar los datos a formato JSON
                JSONObject jsonObject = new JSONObject(productosServicioWeb);

                //Acceder a los datos de los productos. Los productos estan contenidos dentro de un array
                JSONArray jsonArray = jsonObject.getJSONArray("data");

                //Limpiar la lista de productos
                listaProducto.clear();
                System.out.println("prueba"+jsonArray);
                //Recorrer el array y extraer los datos de los productos
                for (int i=0; i < jsonArray.length(); i++){
                    //Obtener los datos de cada producto que esta en cada elemento del array
                    JSONObject datosProducto = jsonArray.getJSONObject(i);

                    //Instanciar a la clase producto
                    Producto objProducto = new Producto();
                    objProducto.setId(datosProducto.getString("id"));
                    objProducto.setUnit_type_id(datosProducto.getString("unit_type_id"));
                    objProducto.setNombre(datosProducto.getString("description"));
                    objProducto.setInternal_id((datosProducto.getString("internal_id")));
                    //quitar el S/ del precio
                    String precioFormateado = datosProducto.getString("sale_unit_price");
                    precioFormateado = precioFormateado.replace("S/ ","");
                    objProducto.setPrecio(precioFormateado);
                    /*calcular precio sin igv*/
                    float precio = Float.parseFloat(precioFormateado);
                    float precioSinIgv = precio - (float) (precio*0.18);
                    /*Fin calculo precio sin igv*/
                    objProducto.setPrecioSinIgv(String.valueOf(precioSinIgv));

                    objProducto.setCantidad(0); //Se inicializa en CERO para cada producto
                    objProducto.setTotal_base(0);
                    objProducto.setTotal_impuestos(0);
                    objProducto.setTotal_item(0);
                    listaProducto.add(objProducto);
                }

                respuesta = true; //Significa que ha cargado los datos en el arrayList

            }catch (Exception e){
                e.printStackTrace();
            }
            return respuesta;
        }

        @Override
        protected void onPostExecute(Boolean respuesta) {
            super.onPostExecute(respuesta);

            if (respuesta){ //Si la respuesta es igual a "true" entonces envia el ArrayList al Adapter
                //Enviar el arrayList con datos al adaptador
                adaptador.cargarDatosArrayList(listaProducto);
                dialog.dismiss();
            }
        }
    }

}
