package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto.logica.Producto;

import java.util.ArrayList;

public class ListadoDetalleComprobanteAdaptador extends RecyclerView.Adapter<ListadoDetalleComprobanteAdaptador.ViewHolder> {

    private Context context;
    public static ArrayList<Producto> listaProductosDetalle;
    //private LayoutInflater mInflater;
    int posicionItem;


    public ListadoDetalleComprobanteAdaptador(Context context){
        this.context = context;
        listaProductosDetalle = RegistrarComprobante.listaProductosDetalle;

    }

    @NonNull
    @Override
    public ListadoDetalleComprobanteAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.detalle_comprobante_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListadoDetalleComprobanteAdaptador.ViewHolder holder, int position) {
        //ARREGLAR
        Producto producto = listaProductosDetalle.get(position);
        holder.txtNombreProductoDetalle.setText(producto.getNombre());
        holder.txtCantidadDetalle.setText("Cantidad:" + producto.getCantidad());
        holder.txtPrecioDetalle.setText("S/"+ String.valueOf(producto.getTotal_item()));
    }

    @Override ///ARREGLAR
    public int getItemCount() {
        return listaProductosDetalle.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Declarar los controles del card view
        //ImageView imgCliente;
        TextView txtNombreProductoDetalle, txtCantidadDetalle, txtPrecioDetalle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Enlazar los controles
            txtNombreProductoDetalle = itemView.findViewById(R.id.txtNombreProductoDetalle);
            txtCantidadDetalle = itemView.findViewById(R.id.txtCantidadDetalle);
            txtPrecioDetalle = itemView.findViewById(R.id.txtPrecioDetalle);
        }
    }
}
