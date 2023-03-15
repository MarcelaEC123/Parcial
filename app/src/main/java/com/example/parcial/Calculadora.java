package com.example.parcial;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;


public class Calculadora {

    private EditText primero;
    private EditText segundo;
    private TextView resultadoOperacion;


        public void multiplicacion(TextView textview){

            double calculo = Double.parseDouble(primero.getText().toString())*Double.parseDouble(segundo.getText().toString());
            resultadoOperacion.setText(calculo+"");
        }

        public void potencia(TextView textview){

            int calculo = Integer.parseInt(primero.getText().toString())*Integer.parseInt(segundo.getText().toString());
            resultadoOperacion.setText(calculo+"");
        }

        public void fibonacci(TextView textview){

            double calculo = Double.parseDouble(primero.getText().toString())*Double.parseDouble(primero.getText().toString());
            resultadoOperacion.setText(calculo+"");
        }

         public void borrar (TextView textview){
            textview.setText("");
    }


    }

