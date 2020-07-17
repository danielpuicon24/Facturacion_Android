package com.example.proyecto.logica;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;

public class Provincia extends Conexion {
    private String codigoDepartamento;
    private String codigoProvincia;
    private String nombreProvincia;

    public static ArrayList<Provincia> listaProvincias = new ArrayList<Provincia>();

    public String getCodigoDepartamento() {
        return codigoDepartamento;
    }

    public void setCodigoDepartamento(String codigoDepartamento) {
        this.codigoDepartamento = codigoDepartamento;
    }

    public String getCodigoProvincia() {
        return codigoProvincia;
    }

    public void setCodigoProvincia(String codigoProvincia) {
        this.codigoProvincia = codigoProvincia;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }

    public void cargarListaProvincia(String codigoDepartamento){
        SQLiteDatabase bd = this.getReadableDatabase(); //traer la conexion de la bd para lectura de datos
        Cursor resultado = bd.rawQuery("select * from provincia where codigo_departamento = '"+codigoDepartamento+"' order by nombre",null);
        listaProvincias.clear();
        while(resultado.moveToNext()){
            Provincia objProvincias = new Provincia();
            objProvincias.setCodigoProvincia(resultado.getString(0));
            objProvincias.setCodigoDepartamento(resultado.getString(1));
            objProvincias.setNombreProvincia(resultado.getString(2));
            listaProvincias.add(objProvincias);
        }
    }

    public String[] obtenerListaProvincias(String codDep){
        this.cargarListaProvincia(codDep);
        String[] lista = new String[listaProvincias.size()];
        for (int i = 0; i < listaProvincias.size();i++){
            lista[i] = listaProvincias.get(i).getNombreProvincia();
        }
        return lista;
    }
}
