package com.example.kotlin_para_principiantes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Leccion 1
        // variablesYConstantes();

        // Leccion 2
        // tiposDeDatos();
    }

    // Aca vamos a hablar de variables y constantes
    private fun variablesYConstantes() {
        // Variables
        // Para crear una variable vamos a usar la palabra reservada var
        var myFirstVariable = "Hello Hackermen";
        println(myFirstVariable);

        myFirstVariable = "Bienvenido Gabriel";
        println(myFirstVariable);

        // Constantes
        // Para crear una constante vamos a usar la palabra reservada val
        val myFirstConstant = "Te ha servido el tutorial?"
        println(myFirstConstant);
    }

    // Aca vamos a hablar de tipos de datos (data types)
    private fun tiposDeDatos() {
        // String
        val myString: String = "Hola Hackerman!";
        val myString2 = "Bienvenidos a MoureDev";
        val myString3 = myString + " " + myString2;
        println(myString3);

        // Enteros (Byte, Short, Int, Long)
        val myInt: Int = 1;
        val myInt2 = 2;
        val myInt3 = myInt + myInt2;
        println(myInt3);

        // Decimales (Float, Double)
        val myFloat: Float = 1.5f;
        val myDouble = 1.5;
        val myDouble2 = 2.6;
        val myDouble3: Int = 1; // En realidad este es Int
        val myDouble4: Double = myDouble + myDouble2 + myDouble3;
        println(myDouble4);
    }




























}