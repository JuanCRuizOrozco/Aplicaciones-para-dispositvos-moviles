package com.example.mustard.eva2_5_activity__for_result;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    private final int MIS_DATOS = 1000;
    private final int MIS_CONTACTOS = 2000;
    TextView txtVwTexto;
    Intent inRegresarDatos, inRegresarContacto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwTexto = findViewById(R.id.txtVwTexto);
        inRegresarDatos = new Intent(this, Secundaria.class);
        Uri uriContac = ContactsContract.Contacts.CONTENT_URI;
        inRegresarDatos = new Intent(Intent.ACTION_PICK, uriContac);
    }
    public void onClick (View v){
        startActivityForResult(inRegresarContacto, MIS_DATOS);


    }
    public void onClicContactos(View v){
        startActivityForResult(inRegresarContacto, MIS_CONTACTOS);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == MIS_DATOS){
            if (resultCode == Activity.RESULT_OK){
                txtVwTexto.setText(data.getStringExtra("MIS_DATOS"));
            }
        }else if(requestCode == MIS_CONTACTOS) {
            if (resultCode == Activity.RESULT_OK) {
                String scont = data.getDataString();
                // txtvTexto.setText(this, data.getDataString(), Toast.LENGTH_LONG).show;
                Intent inEditar = new Intent(Intent.ACTION_EDIT, Uri.parse(scont));
                startActivity(inEditar);
            }
        }
    }
}
