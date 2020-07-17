package com.example.proyecto.logica;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;

public class Pais extends Conexion {

    private String codigoPais;
    private String descripcion;

    public static ArrayList<Pais> listaPaises = new ArrayList<Pais>();

    public String getcodigoPais() {
        return codigoPais;
    }

    public void setcodigoPais(String codigoPais) {
        this.codigoPais = codigoPais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void cargarListaPaises(){
        SQLiteDatabase bd = this.getReadableDatabase(); //traer la conexion de la bd para lectura de datos
        Cursor resultado = bd.rawQuery("select * from pais ",null);
        listaPaises.clear();
        while(resultado.moveToNext()){
            Pais objPais = new Pais();
            objPais.setcodigoPais(resultado.getString(0));
            objPais.setDescripcion(resultado.getString(1));
            listaPaises.add(objPais);
        }
    }
    public String[] obtenerListaPaises(){
        this.cargarListaPaises();
        String[] lista = new String[listaPaises.size()];
        for (int i = 0; i < listaPaises.size();i++){
            lista[i] = listaPaises.get(i).getDescripcion();
        }
        return lista;

    }
}
