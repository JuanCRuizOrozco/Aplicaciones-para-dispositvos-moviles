package com.example.mustard.eva2_6_listas_resultados;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Pincipal extends AppCompatActivity {
    TextView txtVwResta;
    Intent inLista;
    final int LISTA_RESTA = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pincipal);
        txtVwResta = findViewById(R.id.txtVwResta);
        inLista = new Intent(this,ListaRestaurantes.class);
    }
    public void MiClick (View v){
        //startActivity(inLista LISTA_RESTA);


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode== LISTA_RESTA){
            if (resultCode == Activity.RESULT_OK){
                int iResta = data.getIntExtra("RESTAURANTE",0);
                //txtVwResta.setText();
            }

        }
    }
}
