package com.example.proyecto.logica;

import org.json.JSONObject;

public class Producto {


    //datos propios del producto
    private String id;
    private String unit_type_id;
    private String nombre;
    private String internal_id;
    private String precio;
    private String precioSinIgv;

    //data para el detalle
    private int cantidad; //Guardará la cantidad que se desea vender de cada producto
    private float total_base;  //precio sin impuesto
    private float total_impuestos; //precio con impuesto
    private float total_item; //precio  total neto de

    public String getPrecioSinIgv() {
        return precioSinIgv;
    }

    public void setPrecioSinIgv(String precioSinIgv) {
        this.precioSinIgv = precioSinIgv;
    }

    public String getUnit_type_id() {
        return unit_type_id;
    }

    public void setUnit_type_id(String unit_type_id) {
        this.unit_type_id = unit_type_id;
    }

    public float getTotal_base() {
        return total_base;
    }

    public void setTotal_base(float total_base) {
        this.total_base = total_base;
    }

    public float getTotal_impuestos() {
        return total_impuestos;
    }

    public void setTotal_impuestos(float total_impuestos) {
        this.total_impuestos = total_impuestos;
    }

    public float getTotal_item() {
        return total_item;
    }

    public void setTotal_item(float total_item) {
        this.total_item = total_item;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getInternal_id() {
        return internal_id;
    }

    public void setInternal_id(String internal_id) {
        this.internal_id = internal_id;
    }

    public JSONObject generarJSONItems(){
        JSONObject jsonObject = new JSONObject();

        try {
            jsonObject.put("codigo_interno", this.getInternal_id());
            jsonObject.put("descripcion", this.getNombre());
            jsonObject.put("unidad_de_medida", this.getUnit_type_id());
            jsonObject.put("cantidad", this.getCantidad());
            jsonObject.put("valor_unitario", Float.parseFloat(this.getPrecioSinIgv()));
            jsonObject.put("codigo_tipo_precio","01");
            jsonObject.put("precio_unitario", Float.parseFloat(this.getPrecio()));
            jsonObject.put("codigo_tipo_afectacion_igv", "10");
            jsonObject.put("total_base_igv", this.getTotal_base());
            jsonObject.put("porcentaje_igv", 18);
            jsonObject.put("total_igv", this.getTotal_impuestos());
            jsonObject.put("total_impuestos", this.getTotal_impuestos());
            jsonObject.put("total_valor_item", this.getTotal_base());
            jsonObject.put("total_item", this.getTotal_item());

        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonObject;
    }

}
