package com.example.individual5m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView nombre, apellido, mail, password;
    private Button btsalir;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);


        // llamo a mi intento
        //creo variables string desde los strings obtenidos en main

        Intent intento = getIntent();
        String firstname = intento.getStringExtra("Nombre");
        String lastname = intento.getStringExtra("Apellido");
        String correo = intento.getStringExtra("Email");
        String clave = intento.getStringExtra("Password");

        //Asigno a cada textview de esta actividad el string puesto en cada edittext en main
        TextView nombre = findViewById(R.id.nombretextview);
        nombre.setText(firstname);
        TextView apellido = findViewById(R.id.apellidotextview);
        apellido.setText(lastname);
        TextView mail = findViewById(R.id.correotextview);
        mail.setText(correo);
        TextView password = findViewById(R.id.clavetextview);
        password.setText(clave);

    // Me falta boton de salida
            //Asigno al boton salir su id y le doy su accion
            Button btsalir =(Button) findViewById(R.id.btsalir);
            btsalir.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                    onDestroy();
                }
            });



    }
}