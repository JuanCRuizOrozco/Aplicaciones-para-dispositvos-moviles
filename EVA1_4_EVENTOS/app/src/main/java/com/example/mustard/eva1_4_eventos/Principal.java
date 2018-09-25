package com.example.mustard.eva1_4_eventos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Principal extends AppCompatActivity implements View.OnClickListener  {
    //cremos un objeto que escucha eventos
    TextView txtVwMensa; // este objeto se vinvula al widget
    Button btnInterfaz;
    Button btnClasAnonima;
    Button btnClase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwMensa = findViewById(R.id.txtVwMensa);
        btnInterfaz =findViewById(R.id.btnInterfaz);
        btnClase = findViewById(R.id.btnClase);

        btnInterfaz.setOnClickListener(this);//
        btnClasAnonima = findViewById(R.id.btnClaseAnonima);
        //vinculado, se puede utilizar este objeto :D
        txtVwMensa.setText("Detras de ti... wey");
        final Context cntApp = getApplicationContext();

        btnClasAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(cntApp,"Holi",Toast.LENGTH_SHORT).show();
            }
        });
        ClickListener miClickLis = new ClickListener();
        btnClase.setOnClickListener(miClickLis);


    }
    //para vincular por xml
    public void MiClick (View v){
        Toast.makeText(this,"Hay chintrolas",Toast.LENGTH_LONG).show();

    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this,"Hay chintrolas, por interfaz chida",Toast.LENGTH_SHORT).show();

    }
}
