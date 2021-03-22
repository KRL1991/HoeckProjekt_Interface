package com.example.hoeckprojekt_interface;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate (android.view.View view) {

        EditText omsaetning = (EditText)findViewById(R.id.Omsaetning);
        EditText vareforbrug = (EditText)findViewById(R.id.Vareforbrug);

        EditText bruttoFortjeneste = (EditText)findViewById(R.id.Bruttofortjeneste);

        Log.d("BruttoFortjeneste","Bruttofortjeneste er: " + bruttoFortjeneste);

        int udregnetBruttoFortjeneste;
        udregnetBruttoFortjeneste = Integer.valueOf(omsaetning.getText().toString()) + Integer.valueOf(vareforbrug.getText().toString());

        bruttoFortjeneste.setText(String.valueOf(udregnetBruttoFortjeneste));






    }
}