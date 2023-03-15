package com.example.parcial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText primero;

    private EditText segundo;

    private TextView resultadoOperacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primero = findViewById(R.id.numeroP);
        segundo = findViewById(R.id.numeroS);
        resultadoOperacion = findViewById(R.id.resultado);


        }

    public void Multiplicar(View view){
        Calculadora llamarMetodo = new Calculadora();
        llamarMetodo.multiplicacion(findViewById(R.id.resultado));
    }

    public void Potencia(View view){
        Calculadora llamarMetodo = new Calculadora();
        llamarMetodo.potencia(findViewById(R.id.resultado));
    }

    public void FibonaccI(View view){
        Calculadora llamarMetodo = new Calculadora();
        llamarMetodo.fibonacci(findViewById(R.id.resultado));
    }

    public void Limpiar(View view){
        Calculadora llamarMetodo = new Calculadora();
        llamarMetodo.borrar(findViewById(R.id.resultado));
        llamarMetodo.borrar(findViewById(R.id.numeroP));
        llamarMetodo.borrar(findViewById(R.id.numeroS));

    }
}