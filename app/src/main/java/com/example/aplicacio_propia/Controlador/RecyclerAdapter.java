package com.example.aplicacio_propia.Controlador;

import static com.example.aplicacio_propia.Utilidades.Util.DESCRI_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.IMAGEN_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.INGRED_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.NOMBRE_RECE;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplicacio_propia.Utilidades.Util;

import com.example.aplicacio_propia.Modelos.Recetas;
import com.example.aplicacio_propia.R;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerHolder> {

    private List<Recetas> listaRecetas;
    private ActionMode mActionMode;
    private AppCompatActivity actividad;
    private int posicionSeleccionada = -1;


    public RecyclerAdapter(AppCompatActivity actividad, List<Recetas> listaRecetas) {
        this.actividad = actividad;
        this.listaRecetas = listaRecetas;
    }

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.items_lista, parent, false);
        RecyclerHolder recyclerHolder = new RecyclerHolder(v);

        return recyclerHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

        Recetas receta = listaRecetas.get(position);
        holder.imgReceta.setImageResource(receta.getIdImagen());
        holder.txt_titulo.setText(receta.getNomReceta());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(holder.itemView.getContext(), DetalleActivity.class);

                i.putExtra(NOMBRE_RECE, receta.getNomReceta());
                i.putExtra(IMAGEN_RECE, receta.getIdImagen());
                i.putExtra(INGRED_RECE, receta.getIngredientes());
                i.putExtra(DESCRI_RECE, receta.getDescripcion());

                holder.itemView.getContext().startActivity(i);
            }
        });


        holder.itemView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                posicionSeleccionada = holder.getAdapterPosition();

                if (mActionMode == null) {
                    mActionMode = actividad.startSupportActionMode(mActionCallback);
                }
                return true;


            }
        });


    }

    @Override
    public int getItemCount() {
        return listaRecetas.size();
    }


    public class RecyclerHolder extends RecyclerView.ViewHolder {

        private TextView txt_titulo;
        private ImageView imgReceta;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);

            imgReceta = (ImageView) itemView.findViewById(R.id.img1_item);
            txt_titulo = (TextView) itemView.findViewById(R.id.titulo1);


        }

    }


    private ActionMode.Callback mActionCallback = new ActionMode.Callback() {
        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.action_menu, menu);
            mode.setTitle("Menu");
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            int itemID = item.getItemId();

            if (itemID == R.id.item_borrar) {
                AlertDialog alertDialog = createAlertDialog("¿Estás seguro de querer borrarlo?", listaRecetas.get(posicionSeleccionada).getIdImagen());
                alertDialog.show();
            }

            mode.finish();
            return true;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
            mActionMode = null;
        }
    };

    public AlertDialog createAlertDialog(String mensaje, int itemID) {

        AlertDialog.Builder alert = new AlertDialog.Builder(actividad);
        alert.setMessage(mensaje);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Util.borrarReceta(itemID);
                listaRecetas = Util.getListaRecetas();
                notifyDataSetChanged();

                Toast.makeText(actividad, "Receta borrada correctamente", Toast.LENGTH_SHORT).show();
            }
        });

        alert.setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(actividad, "Acción cancelada", Toast.LENGTH_LONG).show();
            }
        });

        return alert.create();

    }


}
