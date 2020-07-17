package com.example.proyecto;


import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto.logica.Cliente;
import com.example.proyecto.logica.Comprobante;
import com.example.proyecto.logica.Sesion;
import com.example.proyecto.util.ServiciosWeb;

import org.json.JSONObject;

import java.util.ArrayList;

public class ListadoComprobanteAdaptador extends RecyclerView.Adapter<ListadoComprobanteAdaptador.ViewHolder>{

    private Context context;
    public static ArrayList<Comprobante> listaComprobante;
    public ProgressDialog dialog;
    int posicionItem;
    private String correoEnviar;

    public ListadoComprobanteAdaptador(Context context){
        this.context = context;
        listaComprobante = new ArrayList<Comprobante>();
    }

    @NonNull
    @Override
    public ListadoComprobanteAdaptador.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //enlaza el adaptador y el xml del cardview.
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comprobante_cardview,parent,false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ListadoComprobanteAdaptador.ViewHolder holder, int position) {
        //pasar los datos de la bd a los controles del cardview.
        Comprobante comprobante = listaComprobante.get(position);
        holder.txtTipoComprobante.setText(comprobante.getTipoComprobante());
        holder.txtNombreClienteComprobante.setText(comprobante.getNombreCliente());
        holder.txtEstadoComprobante.setText(comprobante.getEstado());
        holder.txtFechaEmision.setText(comprobante.getFechaEmision());
        holder.txtEstadoComprobante.setText(comprobante.getEstado());
        holder.txtTotalComprobante.setText(String.valueOf(comprobante.getTotal()));
    }

    @Override
    public int getItemCount() {
        return listaComprobante.size();
    }
    public void cargarDatosArrayList (ArrayList<Comprobante> lista){
        listaComprobante = lista;
        notifyDataSetChanged();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        //Declarar los controles del card view
        //ImageView imgCliente;
        TextView txtNombreClienteComprobante, txtTipoComprobante, txtFechaEmision, txtEstadoComprobante, txtTotalComprobante;
        Button btnEnviarComprobante;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //Enlazar los controles
            txtNombreClienteComprobante = itemView.findViewById(R.id.txtNombreClienteComprobante);
            txtTipoComprobante = itemView.findViewById(R.id.txtTipoComprobanteLC);
            txtFechaEmision = itemView.findViewById(R.id.txtFechaEmision);
            txtEstadoComprobante = itemView.findViewById(R.id.txtEstadoComprobante);
            txtTotalComprobante = itemView.findViewById(R.id.txtTotalComprobante);
            btnEnviarComprobante = itemView.findViewById(R.id.btnEnviarComprobante);
            btnEnviarComprobante.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            final int idComprobante;

            posicionItem = this.getAdapterPosition();
            dialog = new ProgressDialog(context);
            dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            dialog.setTitle("Enviando correo");
            dialog.setCancelable(false);
            dialog.show();

            //buscar el correo del cliente
            //buscar el id

            Comprobante data = listaComprobante.get(posicionItem);
            idComprobante = data.getIdComprobante();
            //nombreCliente = data.getNombreCliente();

            /*abrir alert de data*/
            AlertDialog.Builder builder = new AlertDialog.Builder(context);
            builder.setTitle("Ingrese el correo:");

            // Set up the input
            final EditText input = new EditText(context);
            // Specify the type of input expected; this, for example, sets the input as a password, and will mask the text
            input.setInputType(InputType.TYPE_CLASS_TEXT);
            builder.setView(input);

            // Set up the buttons
            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    correoEnviar = input.getText().toString();
                    new EnviarCorreo(idComprobante,correoEnviar).execute();
                }
            });
            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    dialog.cancel();
                }
            });

            builder.show();

        }

        private class EnviarCorreo extends AsyncTask<Void,Void,String>{

            private String correo;
            private int idComprobante;
            public EnviarCorreo(int idComprobante,String correo){
                this.idComprobante = idComprobante;
                this.correo = correo;
            }

            @Override
            protected String doInBackground(Void... voids) {
                String resultado = "";

                // Definir la URL a la cual voy a requerir
                try
                {
                    String url = ServiciosWeb.URL_WS + "documents/email";
                    JSONObject datosPeticion = new JSONObject();
                    datosPeticion.put("id", this.idComprobante);
                    datosPeticion.put("customer_email", this.correo);

                    System.out.println(datosPeticion);

                    resultado = new ServiciosWeb().openWebServiceBearer(url, Sesion.TOKEN, datosPeticion);
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                return resultado;
            }

            @Override
            protected void onPostExecute(String resultado) {
                super.onPostExecute(resultado);
                if(!resultado.isEmpty())
                {
                    try
                    {
                        JSONObject json = new JSONObject(resultado);
                        boolean success = json.getBoolean("success");

                        if (success)
                        {
                            Toast.makeText(context,
                                    "Comprobante enviado", Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(context,
                                    "Ha ocurrido un error al intentar registrar el comprobante" + resultado, Toast.LENGTH_LONG).show();
                        }
                    }
                    catch (Exception e)
                    {
                        e.printStackTrace();
                    }
                    finally
                    {
                        dialog.dismiss();
                    }
                }
            }
        }
    }
}