package com.example.mustard.eva2_8_listas_personalisadas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    Clima[] aCiudades= {
            new Clima("Chihuahua", 10,R.drawable.cloudy,"nublado"),
            new Clima("Mordor", 50,R.drawable.sunny,"Calorazo"),
            new Clima("Kamino ", 20,R.drawable.rainy,"Chingo de lluvia"),
            new Clima("Alepo", 30,R.drawable.sunny,"Solaso"),
            new Clima("Mosul", 40,R.drawable.sunny,"La calor infernal"),
            new Clima("Kato nemovia", 26,R.drawable.light_rain,"Señor Terreno alto borracho"),
            new Clima("Ghotam", 20,R.drawable.cloudy,"BATMAN!!")
    };
    ListView listVwClima;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        listVwClima= findViewById(R.id.listVwClima);
        listVwClima.setAdapter(new WeatherAdapter(this,R.layout.layout_clima,aCiudades));

    }
}
