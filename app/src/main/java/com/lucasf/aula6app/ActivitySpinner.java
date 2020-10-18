package com.lucasf.aula6app;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Spinner;

public class ActivitySpinner extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        String[] colors = {"Preto","Gris","Cinza","Ambar","Marrom","Carmimim","Cobalto","Ciano",
                "Esmeralda","Verde","Indigo","Magenta","Malva","Oliva","Laranja","Rosa"};
        Spinner spinner = (Spinner)findViewById( R.id.spinner );
        spinner.setAdapter( new MySpinnerAdapter( ActivitySpinner.this, android.R.layout.simple_spinner_item, colors));
    }

}