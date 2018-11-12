package com.example.mustard.eva2_5_activity__for_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {
    EditText edTxtEnv;
    Intent inResu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        edTxtEnv = findViewById(R.id.edTxtEnv);
        inResu = getIntent();

    }
    public void onClick (View v){
        String sCade = edTxtEnv.getText().toString();
        inResu.putExtra("MIS_DATOS",sCade);
        setResult(Activity.RESULT_OK, inResu);
        finish();
    }
}
