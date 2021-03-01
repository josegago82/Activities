package com.josp.activities;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView rellenado_nombre;
    TextView rellenado_telefono;
    TextView rellenado_email;
    TextView rellenado_descripcion;
    TextView rellenado_nacimiento;
    Button boton_volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        boton_volver = (Button) findViewById(R.id.boton_volver);
        rellenado_nombre = (TextView) findViewById(R.id.rellenado_nombre);
        rellenado_telefono = (TextView) findViewById(R.id.rellenado_telefono);
        rellenado_email = (TextView) findViewById(R.id.rellenado_email);
        rellenado_descripcion = (TextView) findViewById(R.id.rellenado_descripcion);
        rellenado_nacimiento = (TextView) findViewById(R.id.rellenado_nacimiento);

        boton_volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        rellenarDatos();
    }
    private void rellenarDatos(){
        Bundle extras = getIntent().getExtras();

        String nombre = extras.getString("nombre");
        rellenado_nombre.setText("Nombre: " + nombre);

        String telefono = extras.getString("telefono");
        rellenado_telefono.setText("Telefono: " + telefono);

        String email = extras.getString("email");
        rellenado_email.setText("Email: " + email);

        String descripcion = extras.getString("descripcion");
        rellenado_descripcion.setText("Descripcion: " + descripcion);

        String nacimiento = extras.getString("nacimiento");
        rellenado_nacimiento.setText("Fecha de Nacimiento: " + nacimiento);
    }
}