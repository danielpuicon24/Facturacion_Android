package com.example.proyecto;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.Funciones;
import com.example.proyecto.util.ServiciosWeb;

import org.json.JSONObject;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtEmailLogin, txtClaveLogin;
    Button btnIniciarSesion;

    private LocationManager ubicacion;
    //
    TextView mensaje1;
    TextView mensaje2;

    protected static final int REQUEST_CHECK_SETTINGS = 0x1;

    //
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmailLogin = findViewById(R.id.txtEmailLogin);
        txtClaveLogin = findViewById(R.id.txtClaveLogin);
        btnIniciarSesion = findViewById(R.id.btnIniciarSesion);
        btnIniciarSesion.setOnClickListener(this);

        //data de preuba
        this.txtEmailLogin.setText("grupo03@gmail.com");
        this.txtClaveLogin.setText("123456");

       Funciones.localizacion(this);

        /*if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION,}, 1000);
        } else {

        }*/
    }





//star


    //fin






    @Override
    public void onClick(View view) {
        new SessionTask(this.txtEmailLogin.getText().toString(),this.txtClaveLogin.getText().toString()).execute();
    }

    private class SessionTask extends AsyncTask<Void,Void, String>{

        ProgressDialog pDialog;
        private String email;
        private String clave;

        public SessionTask(String email, String clave) {
            this.email = email;
            this.clave = clave;
        }

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pDialog = new ProgressDialog(MainActivity.this);
            pDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            pDialog.setMessage("Procesando datos...");
            pDialog.setCancelable(false);
            pDialog.show();
        }

        @Override
        protected String doInBackground(Void... voids) {
            String resultado = "";
            try {
                String URLServicioWeb = ServiciosWeb.URL_WS+"login";
                HashMap parametros = new HashMap<String,String>();
                parametros.put("email", this.email);
                parametros.put("clave", Funciones.base64Encode(this.clave));
                resultado = new ServiciosWeb().openWebServiceFormData(URLServicioWeb,parametros);
            }
            catch (Exception e){
                    e.printStackTrace();
            }
            return resultado;
        }

        @Override
        protected void onPostExecute(String resultado) {
            super.onPostExecute(resultado);
            //Imprimir el resultado de la web service
            System.out.println(resultado);

            if(!resultado.isEmpty()){
                //Procesar el resultado
                try {
                    JSONObject json = new JSONObject(resultado);
                    boolean success = json.getBoolean("success");
                    String message = json.getString("message");

                    if (success==false){
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                    }
                    else{
                        //OBtener los datos del usuario
                        JSONObject jsonDatos = json.getJSONObject("data");
                        Sesion.NOMBRE = jsonDatos.getString("name");
                        Sesion.EMAIL = jsonDatos.getString("email");
                        Sesion.TOKEN = jsonDatos.getString("api_token");
                        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                        //Cerrar el activity actual
                        MainActivity.this.finish();
                        //Llamar al nuevo activity
                        //temporal, para testear se ha cambiado a listacliente
                        Intent intent = new Intent(MainActivity.this,MenuPrincipal.class);
                        startActivity(intent);
                    }
                }catch(Exception e){
                    e.printStackTrace();

                }finally{
                    //Cerrar el dialogo
                    pDialog.dismiss();
                }
            }
            else{
                Toast.makeText(MainActivity.this, "El servicio no ha devuelto un resultado", Toast.LENGTH_SHORT).show();
                pDialog.dismiss();
            }

        }
    }

}
