package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.example.proyecto.logica.SerieComprobante;

public class ModuloConfiguracion extends AppCompatActivity implements View.OnClickListener {
    Spinner spSerieConfiguracion;
    EditText txtNumeroConfiguracion;
    RadioButton rbBoletaConfiguracion, rbFacturaConfiguracion;
    Button btnActualizarSerieConfiguracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modulo_configuracion);

        spSerieConfiguracion=findViewById(R.id.spSerieConfiguracion);
        txtNumeroConfiguracion=findViewById(R.id.txtNumeroConfiguracion);
        rbBoletaConfiguracion=findViewById(R.id.rbBoleta);
        rbFacturaConfiguracion=findViewById(R.id.rbFactura);
        btnActualizarSerieConfiguracion=findViewById(R.id.btnActualizarSerieConfiguracion);

        btnActualizarSerieConfiguracion.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.rbBoleta:
                this.cargarSpinnerSerie();
                break;
            case R.id.rbFactura:
                this.cargarSpinnerSerie();
                break;
        }
    }

    private void cargarSpinnerSerie() {

        String tipoComprobante = "";
        if (rbBoletaConfiguracion.isChecked()){
            tipoComprobante = "03"; //Boleta
        }else{
            tipoComprobante = "01"; //Factura
        }

        String listaSerie[] = new SerieComprobante().obtenerListaSerieComprobante(tipoComprobante);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_dropdown_item,
                listaSerie
        );

        spSerieConfiguracion.setAdapter(adapter);
    }

}