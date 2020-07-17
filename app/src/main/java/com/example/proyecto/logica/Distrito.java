package com.example.proyecto.logica;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;

public class Distrito extends Conexion {

    private String codigoProvincia;
    private String codigoDistrito;
    private String nombreDistrito;
    public static ArrayList<Distrito> listaDistritos = new ArrayList<Distrito>();

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getCodigoDistrito() {
        return codigoDistrito;
    }

    public void setCodigoDistrito(String codigoDistrito) {
        this.codigoDistrito = codigoDistrito;
    }

    public String getNombreDistrito() {
        return nombreDistrito;
    }

    public void setNombreDistrito(String nombreDistrito) {
        this.nombreDistrito = nombreDistrito;
    }

    public void cargarListaDistritos( String codigoProvincia){
        SQLiteDatabase bd = this.getReadableDatabase(); //traer la conexion de la bd para lectura de datos
        Cursor resultado = bd.rawQuery("select * from distrito where codigo_provincia = '"+codigoProvincia+"' order by nombre",null);
        listaDistritos.clear();
        while(resultado.moveToNext()){
            Distrito objDistrito = new Distrito();

            objDistrito.setCodigoDistrito(resultado.getString(0));
            objDistrito.setCodigoProvincia(resultado.getString(1));
            objDistrito.setNombreDistrito(resultado.getString(2));
            listaDistritos.add(objDistrito);
        }
    }

    public String[] obtenerListaDistritos( String codigoProvincia){
        this.cargarListaDistritos(codigoProvincia);
        String[] lista = new String[listaDistritos.size()];
        for (int i = 0; i < listaDistritos.size();i++){
            lista[i] = listaDistritos.get(i).getNombreDistrito();
        }
        return lista;
    }
}
