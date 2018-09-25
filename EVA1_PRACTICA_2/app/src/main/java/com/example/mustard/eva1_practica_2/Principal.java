package com.example.mustard.eva1_practica_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity  implements RadioGroup.OnCheckedChangeListener{
    RadioGroup rdGrpSex, rdGrpReg;
    RadioButton rdBtnDesa,rdBtnAmel, rdBtnAsia, rdBtnAfrica, rdBtnH, rdBtnM;
    EditText edTxtEdad;
    int inAño, inExp, inDes;
    TextView txtVwExp, txtVwDes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        rdBtnAfrica = findViewById(R.id.rdBtnAfrica);
        rdBtnAmel= findViewById(R.id.rdBtnAmeLa);
        rdBtnAsia= findViewById(R.id.rdBtnDesa);
        rdBtnDesa= findViewById(R.id.rdBtnDesa);
        rdBtnH= findViewById(R.id.rdBtnH);
        rdBtnM= findViewById(R.id.rdBtnM);
        rdGrpReg= findViewById(R.id.rdGrpReg);
        rdGrpSex= findViewById(R.id.rdGrpSex);
        edTxtEdad = findViewById(R.id.edTxtEdad);
        txtVwDes= findViewById(R.id.txtVwDes);
        txtVwExp= findViewById(R.id.txtVwExp);
        rdGrpSex.setOnCheckedChangeListener(this);
        rdGrpReg.setOnCheckedChangeListener(this);
        Toast.makeText(this, "Por Favor ingrese el año de nacimiennt,", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Solo Admite fechas de 1950 a 2010", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {


         inAño = Integer.parseInt(edTxtEdad.getText().toString());


        if (inAño >= 1950){
            if (inAño <1960){
                if (rdBtnDesa.isChecked()) inExp = 75;
                if (rdBtnAmel.isChecked()) inExp= 60;
                if (rdBtnAsia.isChecked()) inExp=45;
                if (rdBtnAfrica.isChecked()) inExp=35;
                if (rdBtnH.isChecked()) inExp= inExp -5;

            }else
                if (rdBtnM.isChecked()) inExp = inExp + 5;

        }
        if (inAño >= 1960){
            if (inAño <1970){
                if (rdBtnDesa.isChecked()) inExp = 75;
                if (rdBtnAmel.isChecked()) inExp= 65;
                if (rdBtnAsia.isChecked()) inExp=50;
                if (rdBtnAfrica.isChecked()) inExp=45;
                if (rdBtnH.isChecked()) inExp= inExp - (9 / 2);
                //Se pone 9/2 para no confundr al programa ya que usando entertos en lugar de flotantes

            }else
            if (rdBtnM.isChecked()) inExp = inExp + (9 / 2);

        }
        if (inAño >= 1970){
            if (inAño <1980){
                if (rdBtnDesa.isChecked()) inExp = 80;
                if (rdBtnAmel.isChecked()) inExp= 70;
                if (rdBtnAsia.isChecked()) inExp=65;
                if (rdBtnAfrica.isChecked()) inExp=55;
                if (rdBtnH.isChecked()) inExp= inExp - 4;

            }else
            if (rdBtnM.isChecked()) inExp = inExp + 4;

        }
        if (inAño >= 1980){
            if (inAño <1990){
                if (rdBtnDesa.isChecked()) inExp = 80;
                if (rdBtnAmel.isChecked()) inExp= 75;
                if (rdBtnAsia.isChecked()) inExp =60;
                if (rdBtnAfrica.isChecked()) inExp= 60;
                if (rdBtnH.isChecked()) inExp= inExp - (7 / 2);

            }else
            if (rdBtnM.isChecked()) inExp = inExp + ( 7 / 2);

        }
        if (inAño >= 1990){
            if (inAño <2000){
                if (rdBtnDesa.isChecked()) inExp = 85;
                if (rdBtnAmel.isChecked()) inExp= 75;
                if (rdBtnAsia.isChecked()) inExp=60;
                if (rdBtnAfrica.isChecked()) inExp=55;
                if (rdBtnH.isChecked()) inExp= inExp - 3;

            }else
            if (rdBtnM.isChecked()) inExp = inExp + 3;


        }
        if (inAño >= 2000){
            if (inAño <2010){
                if (rdBtnDesa.isChecked()) inExp = 90;
                if (rdBtnAmel.isChecked()) inExp= 70;
                if (rdBtnAsia.isChecked()) inExp=65;
                if (rdBtnAfrica.isChecked()) inExp=60;
                if (rdBtnH.isChecked()) inExp= inExp - 2;

            }else
            if (rdBtnM.isChecked()) inExp = inExp + 2;

        }
        inDes = inAño+inExp;
        txtVwExp.setText(inExp + " Años;");
        txtVwDes.setText(inDes + " Años");
    }
}
