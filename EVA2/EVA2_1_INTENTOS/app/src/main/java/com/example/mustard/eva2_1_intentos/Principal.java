package com.example.mustard.eva2_1_intentos;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText edtxtNumero;
    Intent inLlmar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edtxtNumero = findViewById(R.id.edtxtNumero);

    }
    public void onClick (View v){
        String sCade = "Tel: " + edtxtNumero.getText().toString();
        inLlmar = new Intent(Intent.ACTION_CALL, Uri.parse(sCade));
        startActivity(inLlmar);

    }
}
