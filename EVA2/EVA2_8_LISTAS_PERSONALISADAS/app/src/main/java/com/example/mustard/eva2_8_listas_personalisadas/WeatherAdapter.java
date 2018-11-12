package com.example.mustard.eva2_8_listas_personalisadas;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherAdapter extends ArrayAdapter<Clima> {
    Context cContexto;
    int iLayout;
    Clima[] aCiudadesClima;

    public WeatherAdapter(@NonNull Context context, int resource, @NonNull Clima[] objects) {

        super(context, resource, objects);
        cContexto = context;
        iLayout = resource;
        aCiudadesClima = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //metodo para dibujar en layout
        ImageView imgVwClima;
        TextView txtVwCiudad, txtVwTemp, txtVwDesc;

        View vFila = convertView;

        if (vFila == null) {// si es nnulo no existe nuestra fila hay que crearla}
            LayoutInflater liVista = ((Activity)cContexto).getLayoutInflater();
            vFila = liVista.inflate(iLayout,parent,false);

        }
        // vincular loswidgets

        imgVwClima = vFila.findViewById(R.id.imgVwClima);
        txtVwCiudad = vFila.findViewById(R.id.txtVwCiudad);
        txtVwTemp = vFila.findViewById(R.id.txtVwTemp);
        txtVwDesc =vFila.findViewById(R.id.txtVwDesc);

        // llenar datos
        Clima cActual = aCiudadesClima[position];
        imgVwClima.setImageResource(cActual.imagen);
        txtVwCiudad.setText(cActual.nombreCiudad);
        txtVwTemp.setText(cActual.temperatura + "°");
        txtVwDesc.setText(cActual.descripcion);
        return  vFila;


    }
}
