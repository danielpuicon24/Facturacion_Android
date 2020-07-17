package com.example.proyecto.datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexion extends SQLiteOpenHelper {


    public static Context context;
    public static String nombreBD = "bdp3";
    public static int versionBD = 1;

    public Conexion(){
        super(context,nombreBD,null,versionBD);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        //Crear la tabla departamento cuando se cree la bd
        bd.execSQL(TablaDatos.tablaDepartamento);
        //insertar los datos de departamento a la tabla.

        for (int i = 0; i<TablaDatos.tablaDepartamentoDatos.length;i++){
            bd.execSQL(TablaDatos.tablaDepartamentoDatos[i]);
        }
        //crear provincia e inserta datos
        bd.execSQL(TablaDatos.tablaProvincia);
        for (int i = 0; i<TablaDatos.tablaProvinciaDatos.length;i++){
            bd.execSQL(TablaDatos.tablaProvinciaDatos[i]);
        }

        //crear distrito e insertar distritos
        bd.execSQL(TablaDatos.tablaDistrito);
        for (int i = 0; i<TablaDatos.tablaDistritoDatos.length;i++){
            bd.execSQL(TablaDatos.tablaDistritoDatos[i]);
        }

        //insertar más distritos

        for (int i = 0; i<TablaDatos.tablaDistritoDatos1.length;i++){
            bd.execSQL(TablaDatos.tablaDistritoDatos1[i]);
        }

        //Clientes
        bd.execSQL(TablaDatos.tablaCliente);
        for (int i = 0; i<TablaDatos.tablaClienteDatos.length;i++){
            bd.execSQL(TablaDatos.tablaClienteDatos[i]);
        }
        //Paises
        bd.execSQL(TablaDatos.tablaPais);

        //cargar com.example.iniciosesiones.datos a la tabla cliente
        for (int i = 0; i < TablaDatos.tablaPaisDatos.length; i++) {
            bd.execSQL(TablaDatos.tablaPaisDatos[i]);

        }

        //Tipo de documento
        bd.execSQL(TablaDatos.tablaTipoDocumentoId);

        //cargar com.example.iniciosesiones.datos a la tabla cliente
        for (int i = 0; i < TablaDatos.tablaTipoDocumentoDatos.length; i++) {
            bd.execSQL(TablaDatos.tablaTipoDocumentoDatos[i]);

        }




    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
