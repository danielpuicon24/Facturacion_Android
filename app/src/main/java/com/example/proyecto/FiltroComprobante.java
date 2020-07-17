package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.app.DatePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.text.format.Time;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;
import java.util.Calendar;

public class FiltroComprobante extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, View.OnTouchListener {
    EditText txtDocID, txtSerieFiltro, txtCorrelativoFiltro, txtFechaFiltro;
    Button btnBuscarPorCampos, btnFechaFiltro;

    Spinner spCampoFiltro;
    boolean usuarioTocaPantalla;
    private Context context;

    private int dia, mes, ano;

    public static ArrayList<String> opcionesFiltro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtro_comprobante);

        txtCorrelativoFiltro= findViewById(R.id.txtCorrelativoFiltro);
        txtDocID= findViewById(R.id.txtDocID);
        txtSerieFiltro= findViewById(R.id.txtSerieFiltro);
        txtFechaFiltro= findViewById(R.id.txtFechaFiltro);
        spCampoFiltro=findViewById(R.id.spCampoFiltro);
        btnBuscarPorCampos=findViewById(R.id.btnBuscarPorCampos);
        btnFechaFiltro=findViewById(R.id.btnFechaFiltro);


        btnBuscarPorCampos.setOnClickListener(this);
        btnFechaFiltro.setOnClickListener(this);

        spCampoFiltro.setOnItemSelectedListener(this);

        //indicar a los sp que reconozcan el evento ontouch
        spCampoFiltro.setOnTouchListener(this);

        //Referenciar la variable context que esta en la clase Conexion
        Conexion.context = this;

        //AnularCampos
        this.anularCampos();

        //LlenarArregloBusqueda
        this.llenarArregloBusqueda(context);

        //cargar datos al spCampoFiltro
        this.cargarSpinnerBusqueda();

        //obtener fecha actual
        this.obtnerFechaActual();


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
                case R.id.spCampoFiltro:
                {
                    if(spCampoFiltro.getSelectedItem().toString().equalsIgnoreCase("Número Doc ID")){
                        System.out.println(spCampoFiltro.getSelectedItem());
                        anularCampos();
                        txtDocID.setEnabled(true);
                    }else {
                        if (spCampoFiltro.getSelectedItem().toString().equalsIgnoreCase("Serie y Correlativo")){
                            anularCampos();
                            txtSerieFiltro.setEnabled(true);
                            txtCorrelativoFiltro.setEnabled(true);
                        }else{
                            anularCampos();
                            btnFechaFiltro.setEnabled(true);
                            txtFechaFiltro.setEnabled(true);
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
    public void llenarArregloBusqueda(Context context){
        this.context = context;
        //this.mInflater = LayoutInflater.from(context);
        ArrayList<String> opcionesBusqueda = new ArrayList<>();
        opcionesBusqueda.add("Serie y Correlativo");
        opcionesBusqueda.add("Número Doc ID");
        opcionesBusqueda.add("Fecha de emisión");
        opcionesFiltro = opcionesBusqueda;
    }
    private void cargarSpinnerBusqueda() {

        ArrayAdapter<String> adapter
                = new ArrayAdapter<>
                (
                        this,
                        android.R.layout.simple_spinner_dropdown_item,
                        opcionesFiltro
                );

        spCampoFiltro.setAdapter(adapter);
    }
    private void anularCampos(){
        txtDocID.setEnabled(false);
        txtCorrelativoFiltro.setEnabled(false);
        txtSerieFiltro.setEnabled(false);
        txtFechaFiltro.setEnabled(false);
        btnFechaFiltro.setEnabled(false);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnFechaFiltro:
                final Calendar c = Calendar.getInstance();
                dia=c.get(Calendar.DAY_OF_MONTH) ;
                mes=c.get(Calendar.MONTH);
                ano=c.get(Calendar.YEAR );

                DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                        txtFechaFiltro.setText(i+"-"+(i1+1)+"-"+i2);

                    }
                }, dia, mes , ano) ;
                dpd.show();
                break;
            case R.id.btnBuscarPorCampos:
                if(spCampoFiltro.getSelectedItem().toString().equalsIgnoreCase("Número Doc ID")){
                    if(!txtDocID.getText().toString().isEmpty()){
                        ListadoComprobanteFragment objlistadoComprobante = new ListadoComprobanteFragment();
                        //new ListadoComprobanteFragment.ListadoComprobanteTask().execute();
                       // new ListadoComprobanteFragment.ListadoComprobanteTask().execute();
                        objlistadoComprobante.filtrarNumDocID(txtDocID.getText().toString());

                        //Mostrar al fragment de Listado de comprobantes

                        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.contenedor,objlistadoComprobante);
                        fragmentTransaction.commit();
                        this.finish();


                    }else {
                        Toast.makeText(context, "Campo N° Doc. ID está VACÍO!", Toast.LENGTH_SHORT).show();
                        txtDocID.requestFocus();
                    }

                }else {
                    if (spCampoFiltro.getSelectedItem().toString().equalsIgnoreCase("Serie y Correlativo")){



                        anularCampos();
                        txtSerieFiltro.setEnabled(true);
                        txtCorrelativoFiltro.setEnabled(true);
                    }else{
                        anularCampos();
                        btnFechaFiltro.setEnabled(true);
                        txtFechaFiltro.setEnabled(true);
                    }
                }
                break;
        }

    }

    public void obtnerFechaActual(){
        Time hoy= new Time(Time.getCurrentTimezone());
        hoy.setToNow();
        dia = hoy.monthDay;
        mes= hoy.month;
        ano=hoy.year;
        txtFechaFiltro.setText(ano+"-"+(mes+1)+"-"+dia);

    }

}
