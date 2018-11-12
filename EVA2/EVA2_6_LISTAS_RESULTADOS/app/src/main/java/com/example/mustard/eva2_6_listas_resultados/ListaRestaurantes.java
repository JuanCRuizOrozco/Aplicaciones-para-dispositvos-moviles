package com.example.mustard.eva2_6_listas_resultados;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListaRestaurantes extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lsResta;
    Intent iLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_restaurantes);
        lsResta = findViewById(R.id.lsResta);
        //iLista = getIntet();

        //Crear el adaptador
        //asignar listener.
        lsResta.setOnItemClickListener(this);
        iLista = getIntent();
        //asignar adaptador
        lsResta.setAdapter(
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Datos.sResta));

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        iLista.putExtra("RESTAURANTE",position);
        setResult(Activity.RESULT_OK,iLista);
        finish();
    }
}
