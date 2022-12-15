package com.example.hello_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /* setContent, este bloque de codigo es nuestra activity, todo lo que coloquemos aca adentro se va a pintar en la pantalla de nuestra app */
        setContent {
            PersonalData(name = "Gabriel");
        }
    }

    /* Creamos una funcion privada que va a renderizar un texto */
    @Composable
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
    }

    /* Me permite visualizar como se ve la ui en tiempo real */
    @Preview
    @Composable
    fun PreviewPersonalData() {
        PersonalData(name = "Gabriel");
    }
}

























