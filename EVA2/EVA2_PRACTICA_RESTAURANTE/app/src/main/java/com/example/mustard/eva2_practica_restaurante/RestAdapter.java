package com.example.mustard.eva2_practica_restaurante;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.widget.ArrayAdapter;

import java.util.List;

public class RestAdapter extends ArrayAdapter<Restaurante>{
    Context cntApp;
    int Layout;
    Restaurante[] aRes;


    public RestAdapter(@NonNull Context context, int resource, @NonNull Restaurante[] objects) {
        super(context, resource, objects);
        cntApp = context;
        Layout = resource;
        aRes = objects;
    }
}
