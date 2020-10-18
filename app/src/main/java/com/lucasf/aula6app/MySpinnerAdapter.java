package com.lucasf.aula6app;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MySpinnerAdapter extends ArrayAdapter {

    Context ctx;
    int resources;
    String[] colors = {"Preto","Gris","Cinza","Ambar","Marrom","Carmimim","Cobalto","Ciano",
    "Esmeralda","Verde","Indigo","Magenta","Malva","Oliva","Laranja","Rosa"};

    int[] colorCodes = {0xFF000000,0xFF696969,0xFFD6D1CD,0xFFF6B822,0xFF987B53,0xFFB00B1E, 0xFF3661AC,0xFF2bcee5,
    0xFF52e716,0xFF60ae41,0xFF6d25e1,0xFFe62272,0xFF000080,0xFF377369,0xFFff7400,0xFFE62272 };
    public MySpinnerAdapter(@NonNull Context context, int resource, @NonNull Object[] objects) {
        super(context, resource, objects);
        ctx = context;
        resources = resource;
    }

    public View getCustomView( int position, View convertView, ViewGroup parent )
    {
        LayoutInflater inflater = ((Activity)ctx).getLayoutInflater();
        View layout = inflater.inflate( resources , parent, false );
        TextView tvColor = (TextView)layout.findViewById( android.R.id.text1 );

        tvColor.setText( colors[position] );
        layout.setBackgroundColor( colorCodes[position] );

        return layout;

    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView( position, convertView, parent );
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }
}