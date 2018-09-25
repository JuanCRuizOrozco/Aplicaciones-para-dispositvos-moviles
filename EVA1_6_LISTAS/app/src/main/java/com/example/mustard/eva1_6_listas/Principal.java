package com.example.mustard.eva1_6_listas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Principal extends AppCompatActivity implements ListView.OnItemClickListener {
    TextView  txtVwMostrar;
    ListView listVwDatos;
    final String[] sResta = {"Hakuna",
            "Las bolas del chino",
            "Mcdonalds",
            "Charli's",
            "Jack in the box",
            "What a burger",
            "Tacos doña pancha",
            "Taco peton",
            "Tacon Madre",
            "El turris",
            "Ninigi",
            "China city",
            "Lirul cisar"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMostrar = findViewById(R.id.txtVwMostrar);
        listVwDatos = findViewById(R.id.listVwDatos);
        //Necesitamos Asignar un Adaptador
        // ES un intermediaron para el origen de datos
        listVwDatos.setAdapter(
                new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,sResta)
        );
        listVwDatos.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        txtVwMostrar.setText(sResta[position]);
    }
}
