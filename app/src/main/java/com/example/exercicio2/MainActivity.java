package com.example.exercicio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoSoma = findViewById(R.id.botao_soma);
        Button botaoSub = findViewById(R.id.botao_subtracao);
        Button botaoMult = findViewById(R.id.botao_mutplicacao);
        Button botaoDiv = findViewById(R.id.botao_divisao);

        final EditText numero1 = findViewById(R.id.Numero1);
        final EditText numero2 = findViewById(R.id.Numero2);

        final TextView resultado = findViewById(R.id.Resultado);

        botaoSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Integer.parseInt(numero1.getText().toString()) + Integer.parseInt(numero2.getText().toString())));
            }
        });

        botaoSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Integer.parseInt(numero1.getText().toString()) - Integer.parseInt(numero2.getText().toString())));
            }
        });

        botaoMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Integer.parseInt(numero1.getText().toString()) * Integer.parseInt(numero2.getText().toString())));
            }
        });

        botaoDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText(String.valueOf(Integer.parseInt(numero1.getText().toString()) / Integer.parseInt(numero2.getText().toString())));
            }
        });
    }
}
