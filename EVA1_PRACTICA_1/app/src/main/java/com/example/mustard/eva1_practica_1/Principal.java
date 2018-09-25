package com.example.mustard.eva1_practica_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.time.Instant;

public class Principal extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdGrpCafe, rdGrpExtra;
    RadioButton rdBtnAzucar, rdBtnCrema, rdBtnAme, rdBtnCapu, rdBtnExp;
    EditText edtTxtCant;
    TextView txtVwDesc;
    Button btnTotal;
    int intTotal, intcant, intsub;
    String strDesc, strDescExt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdGrpCafe = findViewById(R.id.rdGrpCafe);
        rdGrpExtra = findViewById(R.id.rdGrpExtra);
        rdBtnAme = findViewById(R.id.rdBtnAme);
        rdBtnCapu = findViewById(R.id.rdBtnCapu);
        rdBtnExp = findViewById(R.id.rdBtnExp);
        rdBtnAzucar = findViewById(R.id.rdBtnAzucar);
        rdBtnCrema = findViewById(R.id.rdBtnCrema);
        edtTxtCant = findViewById(R.id.edTxtcant);
        txtVwDesc = findViewById(R.id.txtVwDesc);
        rdGrpExtra.setOnCheckedChangeListener(this);
        rdGrpCafe.setOnCheckedChangeListener(this);
        Toast.makeText(this, "Ingrese Cantidad primero :D", Toast.LENGTH_SHORT).show();


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        intcant=0;
        intTotal=0;
        intcant = Integer.parseInt(edtTxtCant.getText().toString());

        if (rdBtnAme.isChecked()){
            strDesc = "Americano"; intTotal = 20;
        }
        if (rdBtnExp.isChecked()){
            strDesc = "Expresso";
         intTotal = 30;
        }
        if (rdBtnCapu.isChecked()) {
            strDesc = "Capuccino";
            intTotal = 48;
        }
        if (rdBtnCrema.isChecked()) {
            strDescExt = "Cremita";
            intTotal = intTotal + 1;
        }
        if(rdBtnAzucar.isChecked()) {
            strDescExt = "Azucar";
            intTotal = intTotal + 1;
        }

        intcant = Integer.parseInt(edtTxtCant.getText().toString());

        intsub = intTotal*intcant;

        //Toast.makeText(this,"total"+intTotal,Toast.LENGTH_SHORT).show();


    }

    public void MiClick (View v) {
        txtVwDesc.setText("Ha comprado: "+strDesc+" Con: "+strDescExt+ "y el total de su compra es: "+intsub);




    }
}
