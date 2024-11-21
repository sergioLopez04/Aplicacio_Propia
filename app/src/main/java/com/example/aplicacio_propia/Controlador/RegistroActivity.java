package com.example.aplicacio_propia.Controlador;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aplicacio_propia.R;

public class RegistroActivity extends AppCompatActivity {

    private TextView nombre;
    private TextView email;
    private TextView edad;
    private Button btn_registrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        Intent i = getIntent();


        this.nombre = (TextView) findViewById(R.id.txt_nombre);
        this.email = (TextView) findViewById(R.id.txt_email);
        this.edad = (TextView) findViewById(R.id.txt_edad);
        this.btn_registrar = (Button) findViewById(R.id.btnr_registrar);


        this.btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent();

                if (nombre.getText().toString().isEmpty() || email.getText().toString().isEmpty() || edad.getText().toString().isEmpty()) {

                    Toast.makeText(RegistroActivity.this, "Tienes que rellenar todos los datos", Toast.LENGTH_LONG).show();

                } else {

                    int campoEdad = Integer.valueOf(edad.getText().toString());

                    if (campoEdad < 18) {
                        Toast.makeText(RegistroActivity.this, "Debes de ser mayor de edad", Toast.LENGTH_LONG).show();
                    } else {

                        if (!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()) {
                            Toast.makeText(RegistroActivity.this, "Debes poner un correo adecuado", Toast.LENGTH_LONG).show();
                        } else {

                            AlertDialog alertDialog = createAlertDialog("Registrado Correctamente",i);
                            alertDialog.show();

                        }

                    }


                }


            }
        });


    }


    public AlertDialog createAlertDialog(String mensaje, Intent intent) {

        AlertDialog.Builder alert = new AlertDialog.Builder(RegistroActivity.this);

        alert.setMessage(mensaje);

        alert.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });

        return alert.create();

    }


}
