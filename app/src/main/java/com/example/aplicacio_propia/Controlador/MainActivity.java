package com.example.aplicacio_propia.Controlador;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.aplicacio_propia.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private Button btnRegistro;
    private Button btnLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        this.btnRegistro = (Button) findViewById(R.id.btn_registrar);
        this.btnLista = (Button) findViewById(R.id.btn_lista);

        this.btnRegistro.setOnClickListener(this);
        this.btnLista.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {

        Button btn = (Button) view;

        switch (btn.getId()) {
            case R.id.btn_registrar:

                Intent i1 = new Intent(MainActivity.this, RegistroActivity.class);

                startActivity(i1);
                break;

            case R.id.btn_lista:

                Intent i2 = new Intent(MainActivity.this, ListaActivity.class);

                startActivity(i2);
                break;

        }
    }
}