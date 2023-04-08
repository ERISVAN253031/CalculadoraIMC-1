package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    TextView resultado;
    String stNome;
    Float flAltura, flPeso,flResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
      resultado = (TextView) findViewById((R.id.textViewResultado));

        Intent intent = getIntent();
        stNome = intent.getStringExtra("nome");
        flAltura = Float.parseFloat(intent.getStringExtra("altura"));
        flPeso = Float.parseFloat(intent.getStringExtra("peso"));
        flResultado = flPeso/ (flAltura * flAltura);

        resultado.setText("IMC = " + flResultado.toString());

    }
}