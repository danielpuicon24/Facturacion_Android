package com.example.proyecto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto.logica.Cliente;

import java.util.ArrayList;

public class ListadoClienteAdaptador extends RecyclerView.Adapter<ListadoClienteAdaptador.ViewHolder> {

    private Context context;
    public static ArrayList<Cliente> listaCliente;
    int posicionItem;

    public ListadoClienteAdaptador(Context context){
        this.context = context;
        listaCliente = new ArrayList<Cliente>();
    }

    @NonNull
    @Override
    public ListadoClienteAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //enlaza el adaptador y el xml del cardview.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cliente_cardview,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListadoClienteAdaptador.ViewHolder holder, int position) {
        //pasar los datos de la bd a los controles del cardview.
        Cliente cliente = listaCliente.get(position);
        holder.txtPaisCliente.setText(cliente.getPais());
        holder.txtDireccionCliente.setText(cliente.getDireccion());
        holder.txtCorreoCliente.setText(cliente.getEmail());
        holder.txtNombreCliente.setText(cliente.getNombre());
        holder.txtTelefonoCliente.setText(cliente.getTelefono());
    }

    @Override
    public int getItemCount() {
        return listaCliente.size();
    }

    public void cargarDatosArrayList(ArrayList<Cliente> lista){
        listaCliente = lista;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        //Declarar los controles del card view
        //ImageView imgCliente;
        TextView txtNombreCliente, txtTelefonoCliente, txtCorreoCliente, txtDireccionCliente, txtPaisCliente;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Enlazar los controles
            txtNombreCliente = itemView.findViewById(R.id.txtNombreCliente);
            txtCorreoCliente = itemView.findViewById(R.id.txtCorreoCliente);
            txtTelefonoCliente = itemView.findViewById(R.id.txtTelefonoCliente);
            txtDireccionCliente = itemView.findViewById(R.id.txtDireccionCliente);
            txtPaisCliente = itemView.findViewById(R.id.txtPaisCliente);
        }
    }
}
