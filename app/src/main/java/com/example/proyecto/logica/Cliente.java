package com.example.proyecto.logica;

import org.json.JSONObject;

import java.util.ArrayList;

public class Cliente {
    private int id;
    private String numero_documento;
    private String nombre;
    private String tipo_documento_identidad;
    private String pais;
    private String ubigeo;
    private String direccion;
    private String telefono;
    private String email;

    public static ArrayList<Cliente> listaCliente= new ArrayList<>();

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getTipo_documento_identidad() {
        return tipo_documento_identidad;
    }

    public void setTipo_documento_identidad(String tipo_documento_identidad) {
        this.tipo_documento_identidad = tipo_documento_identidad;
    }

    public String getUbigeo() {
        return ubigeo;
    }

    public void setUbigeo(String ubigeo) {
        this.ubigeo = ubigeo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public JSONObject generarJSONDatosCliente(){
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("codigo_tipo_documento_identidad", this.getTipo_documento_identidad());
            jsonObject.put("numero_documento", this.getNumero_documento());
            jsonObject.put("apellidos_y_nombres_o_razon_social", this.getNombre());
            jsonObject.put("codigo_pais", this.getPais());
            jsonObject.put("ubigeo", this.getUbigeo());
            jsonObject.put("direccion",this.getDireccion());
            jsonObject.put("correo_electronico", this.getEmail());
            jsonObject.put("telefono", this.getTelefono());

        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonObject;
    }

    public void llenarSpinnerCliente(){

    }



}
