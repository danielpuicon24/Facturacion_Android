package com.example.proyecto;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.text.format.Time;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyecto.datos.Conexion;
import com.example.proyecto.logica.Comprobante;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.ServiciosWeb;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListadoComprobanteFragment extends Fragment implements View.OnClickListener, SwipeRefreshLayout.OnRefreshListener, AdapterView.OnItemSelectedListener, View.OnTouchListener{

    public ArrayList<Comprobante> listaComprobante;
    public ArrayList<Comprobante> listaFiltrada = new ArrayList<Comprobante>();
    public ListadoComprobanteAdaptador adaptador;
    public ProgressDialog dialog;
    public RecyclerView comprobanteRecyclerView;
    public Button btnFiltrar, btnFechaBusqueda;
    public EditText txtFiltro, txtFechaBusqueda;
    public Spinner spCampoBusqueda;
    FloatingActionButton fab;
    public int dia, mes, ano;

    public static ArrayList<String> opcionesFiltro;

    boolean usuarioTocaPantalla;
    private Context context;

    //Declarar el control SwipeRefreshLayout
    SwipeRefreshLayout swipeRefreshLayout;

    public ListadoComprobanteFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        this.getActivity().setTitle("Listado de comprobantes");

        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_listado_comprobante, container, false);
        //enlazar los controles xml con los java
        comprobanteRecyclerView = view.findViewById(R.id.comprobanteRecyclerView);

        txtFiltro=view.findViewById(R.id.txtFiltro);
        txtFechaBusqueda=view.findViewById(R.id.txtFechaBusqueda);

        btnFiltrar=view.findViewById(R.id.btnFiltrar);
        btnFechaBusqueda=view.findViewById(R.id.btnFechaBusqueda);
        fab = view.findViewById(R.id.fabAgregarComprobante);
        spCampoBusqueda=view.findViewById(R.id.spCapoBusqueda);

        btnFechaBusqueda.setOnClickListener(this);
        btnFiltrar.setOnClickListener(this);
        fab.setOnClickListener(this);

        spCampoBusqueda.setOnItemSelectedListener(this);

        //indicar a los sp que reconozcan el evento ontouch
        spCampoBusqueda.setOnTouchListener(this);

        //Referenciar la variable context que esta en la clase Conexion
        Conexion.context= context;

        //AnularCampos
        this.anularCampos();

        //LlenarArregloBusqueda
        //this.llenarArregloBusqueda(context);

        //cargar datos al spCampoFiltro
        this.cargarSpinnerBusqueda();

        //obtener fecha actual
        //this.obtnerFechaActual();

        comprobanteRecyclerView.setHasFixedSize(true);
        comprobanteRecyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));

        //Enlazar el control swipeRefreshLayout
        swipeRefreshLayout = view.findViewById(R.id.srlComprobante);
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
        dialog.setTitle("Descargando lista de comprobantes");
        dialog.setCancelable(false);
        dialog.show();

        //Instanciar la lista cliente
        listaComprobante = new ArrayList<Comprobante>();

        //Instanciar al adaptado. Se envía this.getContext() para relacionar el adaptador con el fragment
        adaptador = new ListadoComprobanteAdaptador(this.getContext());

        //Enviar el adaptador al RecyclerView
        comprobanteRecyclerView.setAdapter(adaptador);

        //Llamar a la clase ListarClienteTask para ejecutar la descarga de datos desde el servicio web
        new ListadoComprobanteTask().execute();
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        usuarioTocaPantalla=true; //significa que el usuario a tocado algunos de los sp
        //Si el usu ha tocado algunos de los sp debe cargar prov y el distrito automaticamente en cascada
        return false;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if (usuarioTocaPantalla){ //significa que el usuario toco alguno de sus spiners
            switch (adapterView.getId())
            {
                case R.id.spCapoBusqueda:
                {

                        if(spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Número Doc ID")){
                            System.out.println(spCampoBusqueda.getSelectedItem());
                            anularCampos();
                            txtFiltro.setHint("Ingrese N° Doc ID");
                            txtFiltro.setEnabled(true);

                        }else {
                            if (spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Serie y Correlativo")){
                                anularCampos();
                                txtFiltro.setHint("Ingrese Serie-Correlativo");
                                txtFiltro.setEnabled(true);

                            }else{
                                if (spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Fecha de emisión")){
                                    anularCampos();
                                    //obtener fecha actual
                                    this.obtnerFechaActual();
                                    btnFechaBusqueda.setEnabled(true);
                                    txtFechaBusqueda.setEnabled(true);
                                }else{
                                    anularCampos();
                                    txtFiltro.setHint("Ingrese tipo de comprobante");
                                    txtFiltro.setEnabled(true);


                                }

                            }
                        }



                } break;

                //agregarle más sw de los otros sp JHEINER déjame todo lo del filtrar
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onRefresh() {
        //Llamar al método listar()
        this.listar();

        //Cerrar la animación del swipeRefreshLayout
        swipeRefreshLayout.setRefreshing(false);
    }

    //tarea asincrona de obtención de data.
    public class ListadoComprobanteTask extends AsyncTask<Void, Void, Boolean> { //lo convertí a static

        @Override
        protected Boolean doInBackground(Void... voids) {
            boolean respuesta = false;
            try {
                String URLServicioWeb = ServiciosWeb.URL_WS + "documents/records";
                JSONObject datosPeticion = new JSONObject();

                datosPeticion.put("id", null);
                System.out.println("Error");
                //llamar servicio web
                String comprobanteServicioWeb = new ServiciosWeb().openWebServiceBearer(URLServicioWeb, Sesion.TOKEN, datosPeticion);
                System.out.println("Error"+comprobanteServicioWeb);

                JSONObject jsonObject = new JSONObject(comprobanteServicioWeb);

                JSONArray jsonArray = jsonObject.getJSONArray("data");
                //limpiar lista clientes
                listaComprobante.clear();  //Hice listar Comprobante no static

                //extraer la data de clientes
                for (int i = 0; i < jsonArray.length(); i++) {
                    JSONObject datosComprobante = jsonArray.getJSONObject(i);

                    Comprobante objComprobante = new Comprobante();
                    objComprobante.setTipoComprobante(datosComprobante.getString("document_type_description"));
                    objComprobante.setNombreCliente(datosComprobante.getString("customer_name"));
                    objComprobante.setEstado(datosComprobante.getString("state_type_description"));
                   // objComprobante.setFechaEmision(datosComprobante.getString("created_at"));
                    objComprobante.setFechaEmision(datosComprobante.getString("date_of_issue"));
                    objComprobante.setTotal(Double.parseDouble(datosComprobante.getString("total")));
                    objComprobante.setNumero_documento(datosComprobante.getString("customer_number"));
                    objComprobante.setNumero_serie(datosComprobante.getString("number"));
                    objComprobante.setIdComprobante(datosComprobante.getInt("id"));


                    listaComprobante.add(objComprobante);
                }
                respuesta = true;
            } catch (JSONException e) {
                e.printStackTrace();
            }
            System.out.println("Error"+respuesta);
            return respuesta;
        }

        @Override
        protected void onPostExecute(Boolean respuesta) {
            super.onPostExecute(respuesta);

                if(respuesta){
                    adaptador.cargarDatosArrayList(listaComprobante);
                    dialog.dismiss();
                }
                else{
                    Toast.makeText(getContext(), "Error al listar", Toast.LENGTH_SHORT).show();
                    dialog.dismiss();
                }

        }


    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){
            case R.id.fabAgregarComprobante:
                ListadoProductosFragment fragment = new ListadoProductosFragment();
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contenedor,fragment);
                fragmentTransaction.commit();
                break;
            case R.id.btnFiltrar:
                Comprobante objComprobante = new Comprobante();
                FiltroComprobante obj = new FiltroComprobante();

                if(spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Número Doc ID")){
                    this.filtrarNumDocID(txtFiltro.getText().toString());

                }else {
                    if (spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Serie y Correlativo")){
                        this.filtrarSerieCorrelativo(txtFiltro.getText().toString());
                    }else{
                        if (spCampoBusqueda.getSelectedItem().toString().equalsIgnoreCase("Fecha de emisión")){
                            this.filtrarFechaEmision(txtFechaBusqueda.getText().toString());
                        }else{
                            this.filtrarTipoComprobante(txtFiltro.getText().toString());
                        }

                    }
                }


                //this.filtrarNumDocID("00000001");
                //this.filtrarFechaEmision("2018-10-09");

                //this.filtrarSerieCorrelativo("F001","30029");
                //listaFiltrada.clear();

                break;
            case R.id.btnFechaBusqueda:
                final Calendar c = Calendar.getInstance();
                dia=c.get(Calendar.DAY_OF_MONTH) ;
                mes=c.get(Calendar.MONTH);
                ano=c.get(Calendar.YEAR );

                DatePickerDialog dpd = new DatePickerDialog(this.getContext(), new DatePickerDialog.OnDateSetListener() { //frag this.getContext en acti poner this
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        txtFechaBusqueda.setText(i+"-"+(i1+1)+"-"+i2);

                    }
                }, dia, mes , ano) ;
                dpd.show();
                break;
            /*
            case R.id.btnMasOpciones:
                //Intent intent = new Intent(contenedor, FiltroComprobante.class);
                Intent intent = new Intent(this.getActivity(),FiltroComprobante.class);
                startActivity(intent);

                break; */
        }


    }
    // estaba
    public void filtrarNumDocID(String numDocId){

        Comprobante objComprobante = new Comprobante();
        System.out.println("AQUI: "+numDocId);
        listaFiltrada.clear();
        if(! numDocId.isEmpty()){ //si noe stá vacio
            for (int i = 0; i <listaComprobante.size() ; i++) {
                objComprobante = listaComprobante.get(i);
                if(objComprobante.getNumero_documento().equalsIgnoreCase(numDocId)){
                    listaFiltrada.add(objComprobante);
                }
            }
            adaptador.cargarDatosArrayList(listaFiltrada);
            return;
        }
        adaptador.cargarDatosArrayList(listaComprobante);
    }


    public void filtrarSerieCorrelativo(String serie){
        Comprobante objComprobante = new Comprobante();
        listaFiltrada.clear();
        if(!serie.isEmpty() ){ //si no están vacío
            for (int i = 0; i <listaComprobante.size() ; i++) {
                objComprobante = listaComprobante.get(i);
                if(objComprobante.getNumero_serie().equalsIgnoreCase(serie) ){ //&& objComprobante.geCorrelativo.equalsIgnoreCase(correlativo)
                    listaFiltrada.add(objComprobante);
                }
            }
            adaptador.cargarDatosArrayList(listaFiltrada);
            return;
        }
        adaptador.cargarDatosArrayList(listaComprobante);
    }
    public void filtrarFechaEmision(String fechaEmision){
        Comprobante objComprobante = new Comprobante();
        listaFiltrada.clear();
        if(!fechaEmision.isEmpty()){ //si noe stá vacio
            for (int i = 0; i <listaComprobante.size() ; i++) {
                objComprobante = listaComprobante.get(i);
                if(objComprobante.getFechaEmision().equalsIgnoreCase(fechaEmision)){
                    listaFiltrada.add(objComprobante);
                }
            }
            adaptador.cargarDatosArrayList(listaFiltrada);
            return;
        }
        adaptador.cargarDatosArrayList(listaComprobante);
    }
    public void filtrarTipoComprobante(String tipo){
        Comprobante objComprobante = new Comprobante();
        listaFiltrada.clear();
        if(!txtFiltro.getText().toString().isEmpty()){ //si noe stá vacio
            for (int i = 0; i <listaComprobante.size() ; i++) {
                objComprobante = listaComprobante.get(i);
                if(objComprobante.getTipoComprobante().equalsIgnoreCase(tipo)){
                    listaFiltrada.add(objComprobante);
                }
            }
            adaptador.cargarDatosArrayList(listaFiltrada);
            return;
        }
        adaptador.cargarDatosArrayList(listaComprobante);
    }
    public void obtnerFechaActual(){
        Time hoy= new Time(Time.getCurrentTimezone());
        hoy.setToNow();
        dia = hoy.monthDay;
        mes= hoy.month;
        ano=hoy.year;

        txtFechaBusqueda.setText(ano+"-"+(mes+1)+"-"+dia);

    }
    /*
    public void llenarArregloBusqueda(Context context){
        this.context = context;
        //this.mInflater = LayoutInflater.from(context);
        ArrayList<String> opcionesBusqueda = new ArrayList<>();
        opcionesBusqueda.add("Serie y Correlativo");
        opcionesBusqueda.add("Número Doc ID");
        opcionesBusqueda.add("Fecha de emisión");
        opcionesBusqueda.add("Tipo Comprobante");
        opcionesFiltro = opcionesBusqueda;


    }*/
    private void cargarSpinnerBusqueda() {

        String[] opcionesFiltro = {"Serie y Correlativo", "Número Doc ID","Fecha de emisión","Tipo Comprobante"};

        spCampoBusqueda.setAdapter(new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_dropdown_item, opcionesFiltro));

    }
    private void anularCampos(){
        txtFiltro.setHint("");
        txtFechaBusqueda.setText("");
        txtFiltro.setText("");
        txtFiltro.setEnabled(false);
        txtFechaBusqueda.setEnabled(false);
        btnFechaBusqueda.setEnabled(false);
    }
}