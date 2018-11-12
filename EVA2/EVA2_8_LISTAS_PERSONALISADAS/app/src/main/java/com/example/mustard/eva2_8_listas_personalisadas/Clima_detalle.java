package com.example.mustard.eva2_8_listas_personalisadas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Clima_detalle extends AppCompatActivity {
    Intent iDatos;
    ImageView imgVwClima;
    TextView txtVwCiudad, txtVwTemp, txtVwDesc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clima_detalle);
        imgVwClima = findViewById(R.id.imgVwClima);
        txtVwCiudad = findViewById(R.id.txtVwCiudad);
        txtVwTemp = findViewById(R.id.txtVwTemp);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        iDatos = getIntent();





    }
}
