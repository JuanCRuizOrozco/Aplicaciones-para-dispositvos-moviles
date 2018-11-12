package com.example.mustard.eva2_3_sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText edTxtNum, edTxtMensa;
    Button btnEnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edTxtMensa = findViewById(R.id.edTxtMensa);
        edTxtNum = findViewById(R.id.edTxtNum);
        btnEnv = findViewById(R.id.btnEnv);

    }
    public void MiClick (View v){
        String sTel=  "smsto"+ edTxtNum.getText().toString();
        String sMensa =  edTxtMensa.getText().toString();

        Intent inEnviar = new Intent(Intent.ACTION_SENDTO, Uri.parse(sTel));

        inEnviar.putExtra("sms_body",sMensa);
        startActivity(inEnviar);
        

    }
}
