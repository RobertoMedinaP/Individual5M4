package com.example.individual5m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    private TextView nombre, apellido, mail, password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);

        //TextView nombretextview=getIntent().getStringExtra("Nombre");

        Intent intento = getIntent();
        String firstname = intento.getStringExtra("Nombre");
        String lastname = intento.getStringExtra("Apellido");
        String correo = intento.getStringExtra("Email");
        String clave = intento.getStringExtra("Password");


        TextView nombre = findViewById(R.id.nombretextview);
        nombre.setText(firstname);
        TextView apellido = findViewById(R.id.apellidotextview);
        apellido.setText(lastname);
        TextView mail = findViewById(R.id.correotextview);
        mail.setText(correo);
        TextView password = findViewById(R.id.clavetextview);
        password.setText(clave);

    // Me falta boton de salida

    }
}