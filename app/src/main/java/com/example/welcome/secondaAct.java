package com.example.welcome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class secondaAct extends AppCompatActivity {
    TextView messaggio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seconda);
        messaggio=(TextView) findViewById(R.id.messaggioPassato);
        Intent i = getIntent();
        String valore = i.getStringExtra("etichetta");
        messaggio.setText(valore);
    }
}




