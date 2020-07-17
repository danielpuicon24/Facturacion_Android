package com.example.proyecto;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.proyecto.logica.Cliente;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.ServiciosWeb;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoClienteFragment extends Fragment implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener{

    public ArrayList<Cliente> listaCliente;
    public ListadoClienteAdaptador adaptador;
    public ProgressDialog dialog;
    public RecyclerView clienteRecyclerView;

    //Boton para agregar nuevo
    FloatingActionButton fab;


    //Declarar el control SwipeRefreshLayout
    SwipeRefreshLayout swipeRefreshLayout;

    public ListadoClienteFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listado_cliente, container, false);

        //Titulo
        this.getActivity().setTitle("Listado de clientes");

        //enlazar los controles xml con los java
        clienteRecyclerView = view.findViewById(R.id.clienteRecyclerView);
        clienteRecyclerView.setHasFixedSize(true);
        clienteRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        fab = (FloatingActionButton) view.findViewById(R.id.fabAgregarCliente);
        fab.setOnClickListener(this);
        //Enlazar el control swipeRefreshLayout
        swipeRefreshLayout = view.findViewById(R.id.srlCliente);
        swipeRefreshLayout.setOnRefreshListener(this);

        //Configurar los colores del swipeRefreshLayout
        swipeRefreshLayout.setColorScheme(
                android.R.color.holo_red_light,
                android.R.color.holo_green_light,
                android.R.color.holo_orange_light,
                android.R.color.holo_blue_light
        );

        this.listar();
        return view;
    }

    private void listar(){
        //mostrar dialogo de espera mientras se descargan los datos
        dialog = new ProgressDialog(this.getContext());
        dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        dialog.setTitle("Descargando lista de clientes");
        dialog.setCancelable(false);
        dialog.show();

        //Instanciar la lista cliente
        listaCliente = new ArrayList<Cliente>();

        //Instanciar al adaptado. Se envía this.getContext() para relacionar el adaptador con el fragment
        adaptador = new ListadoClienteAdaptador(this.getContext());

        //Enviar el adaptador al RecyclerView
        clienteRecyclerView.setAdapter(adaptador);

        //Llamar a la clase ListarClienteTask para ejecutar la descarga de datos desde el servicio web
        new ListadoClienteTask().execute();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.fabAgregarCliente:
                Intent intent = new Intent(this.getActivity(), RegistrarClienteActivity.class);
                startActivity(intent);
        }
    }

    @Override
    public void onRefresh() {
        //Llamar al método listar()
        this.listar();

        //Cerrar la animación del swipeRefreshLayout
        swipeRefreshLayout.setRefreshing(false);
    }

    //tarea asincrona de obtención de data.
    private class ListadoClienteTask extends AsyncTask<Void, Void, Boolean>{
        @Override
        protected Boolean doInBackground(Void... voids) {
            boolean respuesta = false;
            try {
                String URLServicioWeb = ServiciosWeb.URL_WS+"persons";
                JSONObject datosPeticion = new JSONObject();
                datosPeticion.put("id",null);
                //llamar servicio web
                String clientesServicioWeb = new ServiciosWeb().openWebServiceBearer(URLServicioWeb,Sesion.TOKEN ,datosPeticion);

                JSONObject jsonObject = new JSONObject(clientesServicioWeb);

                JSONArray jsonArray = jsonObject.getJSONArray("data");
                //limpiar lista clientes
                listaCliente.clear();

                //extraer la data de clientes
                for(int i = 0; i<jsonArray.length();i++){
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
                    listaCliente.add(objCliente);
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
                adaptador.cargarDatosArrayList(listaCliente);
                dialog.dismiss();
            }
            else{
                Toast.makeText(getContext(), "ERROR AL OBTENER CLIENTES", Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        }
    }

}
