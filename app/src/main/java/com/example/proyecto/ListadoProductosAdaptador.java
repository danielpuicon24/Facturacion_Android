package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.proyecto.logica.Producto;

import java.util.ArrayList;

public class ListadoProductosAdaptador extends RecyclerView.Adapter<ListadoProductosAdaptador.ViewHolder> {
    private Context context; //Permite enlazar el adaptador con el Fragment
    public static ArrayList<Producto> listaProductos;

    int posicionItem;

    public ListadoProductosAdaptador(Context context) {
        this.context = context;
        listaProductos = new ArrayList<Producto>(); //Instanciar la lista
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Permite enlazar el adaptador con el archivo xml que contiene al cardview
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.producto_cardview, parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        //Mostrar los datos en los controles del cardview
        Producto producto = listaProductos.get(position);
        holder.txtNombreProducto.setText(producto.getNombre());
        holder.txtPrecioVenta.setText("Precio Venta s/: " + String.valueOf(producto.getPrecio()));
        holder.txtTotal.setText("Total: " + producto.getTotal_item());
        holder.txtSubtotal.setText("Subtotal: " + producto.getTotal_base());
        holder.txtIgvProducto.setText("IGV: " + producto.getTotal_impuestos());
        holder.txtProductoCantidadVenta.setText("Cantidad: " + String.valueOf(producto.getCantidad()));
    }

    @Override
    public int getItemCount() {
        return listaProductos.size();
    }

    public void cargarDatosArrayList(ArrayList<Producto> lista){
        //Recibe la lista de productos y lo asigna al ArrayList "listaProductos"
        listaProductos = lista;
        notifyDataSetChanged(); //Notifica que la lista de datos ha cambiado
    }


    public void limpiarCantidad(){
        //Este método permite colocar la cantidad de todos los productos en cero
        for (int i = 0; i < ListadoProductosAdaptador.listaProductos.size(); i++) {
            ListadoProductosAdaptador.listaProductos.get(i).setCantidad(0);
            ListadoProductosAdaptador.listaProductos.get(i).setTotal_base(0);
            ListadoProductosAdaptador.listaProductos.get(i).setTotal_item(0);
            ListadoProductosAdaptador.listaProductos.get(i).setTotal_impuestos(0);
        }
        notifyDataSetChanged(); //Notifica que la lista de datos ha cambiado
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        //Declarar los controles que tenemos en el CardView
        TextView txtNombreProducto, txtPrecioVenta,txtProductoCantidadVenta,txtTotal,txtSubtotal,txtIgvProducto;
        Button btnMenos, btnMas;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Enlazar los controles java con los controls XML del cardview
            txtNombreProducto = itemView.findViewById(R.id.txtNombreProducto);
            txtPrecioVenta = itemView.findViewById(R.id.txtPrecioVentaProducto);
            txtTotal = itemView.findViewById(R.id.txtTotalProducto);
            txtSubtotal = itemView.findViewById(R.id.txtSubtotalProducto);
            txtIgvProducto = itemView.findViewById(R.id.txtIgvProducto);
            txtProductoCantidadVenta = itemView.findViewById(R.id.txtCantidadProducto);
            btnMenos = itemView.findViewById(R.id.btnMenosCardview);
            btnMas = itemView.findViewById(R.id.btnMasCardview);
            btnMenos.setOnClickListener(this);
            btnMas.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            //Obtener la posición del item seleccionado
            posicionItem = this.getAdapterPosition();

            switch (view.getId()){
                case R.id.btnMasCardview:
                    //Incrementa la cantidad
                    actualizarCantidad(1);
                    break;
                case R.id.btnMenosCardview:
                    //Disminuye la cantidad
                    actualizarCantidad(-1);
                    break;
            }
        }

        private void actualizarCantidad(int cantidad){
            //Leer la cantidad actual que tiene el producto
            Producto data = ListadoProductosAdaptador.listaProductos.get(posicionItem);
            int cantidadVenta = data.getCantidad();
            float precio = Float.parseFloat(data.getPrecio());
            float precioSinIgv = Float.parseFloat(data.getPrecioSinIgv());
            float totalBase;
            float totalImpuestos;
            float total;

            //Suma o resta la cantidad
            cantidadVenta = cantidadVenta + cantidad;

            //Validar que la cantidad no sea menor a cero
            if (cantidadVenta < 0){
                cantidadVenta = 0;
            }

            totalBase = cantidadVenta * precioSinIgv;
            total = cantidadVenta*precio;
            totalImpuestos = total-totalBase;

            //Actualizar los valores en el listado de venta en el ArrayList
            ListadoProductosAdaptador.listaProductos.get(posicionItem).setCantidad(cantidadVenta);
            ListadoProductosAdaptador.listaProductos.get(posicionItem).setTotal_base(totalBase);
            ListadoProductosAdaptador.listaProductos.get(posicionItem).setTotal_impuestos(totalImpuestos);
            ListadoProductosAdaptador.listaProductos.get(posicionItem).setTotal_item(total);

            //Refrescar el adaptador, con la finalidad de que refresque el RecyclerView
            notifyDataSetChanged();

        }
    }

}
