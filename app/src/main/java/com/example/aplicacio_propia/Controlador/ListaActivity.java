package com.example.aplicacio_propia.Controlador;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.aplicacio_propia.R;
import com.example.aplicacio_propia.Utilidades.Util;

public class ListaActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);


        Intent i = getIntent();

        recyclerView = (RecyclerView) findViewById(R.id.view);

        recyclerAdapter = new RecyclerAdapter(this, Util.getListaRecetas());


        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }



}
