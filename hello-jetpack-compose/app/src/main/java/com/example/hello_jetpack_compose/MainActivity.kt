package com.example.hello_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.hello_jetpack_compose.ui.theme.HellojetpackcomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* setContent, este bloque de codigo es nuestra activity, todo lo que coloquemos aca adentro se va a pintar en la pantalla de nuestra app */
        setContent {
            HellojetpackcomposeTheme() {
                MyComponent();
            }
        }
    }

    /* Me permite ver como van quedando los cambios en tiempo real */
    @Preview
    @Composable
    fun MyComponent() {
        // Los modificadores me permiten cambiar los estilos por default que tienen los componentes
        Row(modifier = Modifier.padding(8.dp).background(Color.LightGray)) {
            MyImage();
            MyTexts();
        }
    }

    @Composable
    fun MyImage() {
        Image(
            painter = painterResource(id = R.drawable.avatar_messi),
            contentDescription = "Messi avatar",
            modifier = Modifier.width(200.dp)
                )
    }

    @Composable
    fun MyTexts() {
        Column() {
            Text(text = "¡Hola Jetpack Compose!");
            Text(text = "¿Preparado?");
        }
    }

    // Primeras pruebas
    /* Creamos una funcion privada que va a renderizar un texto */
    /*@Composable
    private fun PersonalData(name: String) {
        // Los elementos que esten adentro de MaterialTheme se van a ver afectados
        MaterialTheme() {
            Column(
                modifier = Modifier.padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                /*Image(
                    // painterResourse me permite acceder a nuestra imagen de avatar
                    // contentDescription, me permite pasar una descripcion
                    painter = painterResource(id = R.drawable.avatar_messi),
                    contentDescription = "Messi avatar"
                ) */
                Text(text = "Nombre: $name", style = MaterialTheme.typography.h6);
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = "Soy programador");
                Text(text = "test@gmail.com");
            }
        }
    }*/
}

























