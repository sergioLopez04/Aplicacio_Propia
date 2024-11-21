package com.example.aplicacio_propia.Controlador;

import static com.example.aplicacio_propia.Utilidades.Util.DESCRI_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.IMAGEN_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.INGRED_RECE;
import static com.example.aplicacio_propia.Utilidades.Util.NOMBRE_RECE;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacio_propia.R;

public class DetalleActivity extends AppCompatActivity {

    private TextView txt_titulo;
    private ImageView imgagen;
    private TextView txt_ingredientes;
    private TextView txt_descripcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


        this.txt_titulo = (TextView) findViewById(R.id.txt_titulo);
        this.imgagen = (ImageView) findViewById(R.id.img_rece);
        this.txt_ingredientes = (TextView) findViewById(R.id.txt_ingredientes);
        this.txt_descripcion = (TextView) findViewById(R.id.txt_descripcion);

        Intent i = getIntent();

        txt_titulo.setText(i.getStringExtra(NOMBRE_RECE));
        imgagen.setImageResource(i.getIntExtra(IMAGEN_RECE, -1));
        txt_ingredientes.setText(i.getStringExtra(INGRED_RECE));
        txt_descripcion.setText(i.getStringExtra(DESCRI_RECE));






    }


}
