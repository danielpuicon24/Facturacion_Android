package com.example.proyecto.logica;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.proyecto.datos.Conexion;

import java.util.ArrayList;

public class TipoDocumento extends Conexion {
    private String codigoTipoDocumento;
    private String descripcion;

    public static ArrayList<TipoDocumento> listaTipoDocumento = new ArrayList<TipoDocumento>();

    public String getCodigoTipoDocumento() {
        return codigoTipoDocumento;
    }

    public void setCodigoTipoDocumento(String codigoTipoDocumento) {
        this.codigoTipoDocumento = codigoTipoDocumento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void cargarListaTD(){
        SQLiteDatabase bd = this.getReadableDatabase(); //traer la conexion de la bd para lectura de datos
        Cursor resultado = bd.rawQuery("select * from tipoDocumentoId order by codigo_td  ",null);
        listaTipoDocumento.clear();
        while(resultado.moveToNext()){
            TipoDocumento objTD = new TipoDocumento();
            objTD.setCodigoTipoDocumento(resultado.getString(0));
            objTD.setDescripcion(resultado.getString(1));
            listaTipoDocumento.add(objTD);
        }
    }
    public String[] obtenerListaTipoDocId(){
        this.cargarListaTD();
        String[] lista = new String[listaTipoDocumento.size()];
        for (int i = 0; i < listaTipoDocumento.size();i++){
            lista[i] = listaTipoDocumento.get(i).getDescripcion();
        }
        return lista;

    }

}
