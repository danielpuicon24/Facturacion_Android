package com.example.proyecto.logica;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;

public class SerieComprobante extends Conexion {

private String tipoComprobante;
private String serie;
private String numero;

    public static ArrayList<SerieComprobante> listaSerie = new ArrayList<>();

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void cargarListaSC(String tipoComprobante){
        SQLiteDatabase bd = this.getReadableDatabase(); //traer la conexion de la bd para lectura de datos
        Cursor resultado = bd.rawQuery("select * from serie_comprobante where codigo_tipo_comprobante="+"'"+tipoComprobante+"' order by codigo_tipo_comprobante",null);
        listaSerie.clear();
        while(resultado.moveToNext()){
            SerieComprobante objTD = new SerieComprobante();
            objTD.setTipoComprobante(resultado.getString(0));
            objTD.setSerie(resultado.getString(1));
            objTD.setNumero(resultado.getString(2));
            listaSerie.add(objTD);
        }
    }
    public String[] obtenerListaSerieComprobante(String tipoComprobante){
        this.cargarListaSC(tipoComprobante);
        String[] lista = new String[listaSerie.size()];
        for (int i = 0; i < listaSerie.size();i++){
            lista[i] = listaSerie.get(i).getSerie();
        }
        return lista;
    }

}
