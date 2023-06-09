package com.example.calculadoraimc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText nome,altura,peso;
    Button botao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nome = (EditText) findViewById(R.id.editTextNome);
        altura = (EditText) findViewById(R.id.editTextAltura);
        peso = (EditText) findViewById(R.id.editTextPeso);
        botao = (Button) findViewById(R.id.btCalcular);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarTelaResultado();

            }
        });
    }
    public void mostrarTelaResultado(){
        Intent intent = new Intent(this,Resultado.class);
        intent.putExtra("nome",nome.getText().toString());
        intent.putExtra("altura",altura.getText().toString());
        intent.putExtra("peso", peso.getText().toString());
        startActivity(intent);



    }
}