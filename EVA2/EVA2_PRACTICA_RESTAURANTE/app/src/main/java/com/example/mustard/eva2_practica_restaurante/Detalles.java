package com.example.mustard.eva2_practica_restaurante;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {
    ImageView imageView;
    TextView txtVwNombre,txtVwDesc,txtVwDir,txtVwTel,txtVwEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        txtVwNombre = findViewById(R.id.txtVwNombre);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        txtVwDir = findViewById(R.id.txtVwDir);
        txtVwTel = findViewById(R.id.txtVwTel);
        txtVwEmail = findViewById(R.id.txtVwEmail);
        imageView = findViewById(R.id.imageView);

        Intent inDatos = getIntent();


        String sNom = inDatos.getStringExtra("NOMBRE");
        String sDesc = inDatos.getStringExtra("DESCRIPCION");
        String sDire = inDatos.getStringExtra("DIRECCION");
        String sTel = inDatos.getStringExtra("TELEFONO");
        String sMail = inDatos.getStringExtra("EMAIL");
        int iImg = inDatos.getIntExtra("IMAGEN",R.drawable.barrafina);









    }
}
