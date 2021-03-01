package com.josp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button boton_siguiente;
    EditText campo_nombre;
    EditText campo_telefono;
    EditText campo_email;
    EditText campo_descripcion;
    EditText campo_nacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campo_nombre = (EditText) findViewById(R.id.campo_nombre);
        campo_telefono = (EditText) findViewById(R.id.campo_telefono);
        campo_email = (EditText) findViewById(R.id.campo_email);
        campo_descripcion = (EditText) findViewById(R.id.campo_descripcion);
        campo_nacimiento = (EditText) findViewById(R.id.campo_nacimiento);
        boton_siguiente = (Button) findViewById(R.id.boton_siguiente);


    boton_siguiente.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(MainActivity.this, Resultado.class);

            i.putExtra("nombre",campo_nombre.getText().toString());
            i.putExtra("telefono",campo_telefono.getText().toString());
            i.putExtra("email",campo_email.getText().toString());
            i.putExtra("descripcion",campo_descripcion.getText().toString());
            i.putExtra("nacimiento",campo_nacimiento.getText().toString());
            i.putExtra("nombre",campo_nombre.getText().toString());

 
            startActivity(i);
        }
    });

    }
}