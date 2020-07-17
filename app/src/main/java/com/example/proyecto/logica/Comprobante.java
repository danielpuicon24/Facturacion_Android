package com.example.proyecto.logica;

import org.json.JSONObject;

import java.util.ArrayList;

public class Comprobante {
    private int idComprobante;
    private String numero_serie;
    private String numero_documento;
    private String fechaEmision;
    private String tipoComprobante;
    private String nombreCliente;
    private String estado;


    private double totalOgGravada;
    private double totalIgv;
    private double total;


    //datos de inserción

    public static ArrayList<Cliente> listaComprobante= new ArrayList<>();

    public int getIdComprobante() {
        return idComprobante;
    }

    public void setIdComprobante(int idComprobante) {
        this.idComprobante = idComprobante;
    }

    public double getTotalOgGravada() {
        return totalOgGravada;
    }

    public void setTotalOgGravada(double totalOgGravada) {
        this.totalOgGravada = totalOgGravada;
    }

    public double getTotalIgv() {
        return totalIgv;
    }

    public void setTotalIgv(double totalIgv) {
        this.totalIgv = totalIgv;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(String tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public JSONObject generarJSONTotales(Double totalOgGravada, Double totalIgv,Double total){
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("total_exportacion", 0);
            jsonObject.put("total_operaciones_gravadas", this.getTotalOgGravada());
            jsonObject.put("total_operaciones_inafectas", 0);
            jsonObject.put("total_operaciones_exoneradas", 0);
            jsonObject.put("total_operaciones_gratuitas", 0);
            jsonObject.put("total_igv", 18);
            jsonObject.put("total_impuestos", totalIgv);
            jsonObject.put("total_valor", totalOgGravada);
            jsonObject.put("total_venta", total);


        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonObject;
    }

}