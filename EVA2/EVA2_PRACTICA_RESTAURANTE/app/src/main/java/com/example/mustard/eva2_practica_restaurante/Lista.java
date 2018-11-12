package com.example.mustard.eva2_practica_restaurante;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Lista extends AppCompatActivity {
    TextView txtVwNombre,txtVwDesc,txtVwDir,txtVwTel,txtVwEmail;
    ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
    }
}
