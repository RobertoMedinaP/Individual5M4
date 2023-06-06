package com.example.individual5m4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //crear variables para campos y boton

    private EditText nombreedt, apellidoedt, emailedt, passwordedt;
    private Button crearcuentaboton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        captura();

        Button crearcuentaboton = findViewById(R.id.crearcuentaboton);
        crearcuentaboton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // creo un objeto de tipo intent y muy originalmente le pongo intento
                //saca las cosas de acá y las une con la actividad Resultados
                Intent intento = new Intent (v.getContext(), Resultados.class);

                //acá obtengo los strings de los distintos edittext y les pongo un nombre
                intento.putExtra("Nombre", nombreedt.getText().toString());
                intento.putExtra("Apellido", apellidoedt.getText().toString());
                intento.putExtra("Email", emailedt.getText().toString());
                intento.putExtra("Password", passwordedt.getText().toString());
                startActivity(intento);
            }
        });
    }

    //metodo de captura

    public void captura() {
       nombreedt= (EditText) findViewById(R.id.nombreedt);
       apellidoedt= (EditText) findViewById(R.id.apellidoedt);
       emailedt= (EditText) findViewById(R.id.emailedt);
       passwordedt= (EditText) findViewById(R.id.passwordedt);
       crearcuentaboton=(Button) findViewById(R.id.crearcuentaboton);
    }

    //TODO: metodo de validacion de campos vacíos

}