package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText testo;
    Button reset;
    Button test;
    Button lancia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testo =(EditText)findViewById(R.id.casellaTesto);

        reset=(Button)findViewById(R.id.reset);
        test=(Button)findViewById(R.id.test);
        lancia=(Button)findViewById(R.id.lancia);
    }

    public void lanciaSecAct(View v) {
        String frase = testo.getText().toString();
        Intent i = new Intent(getApplicationContext(),secondaAct.class);
        i.putExtra("etichetta",frase);
        startActivity(i);
    }

    public void testa(View v) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, testo.getText(), duration);
        toast.show();
    }

    public void resetta(View v) {
        testo.setText("");
    }

}







