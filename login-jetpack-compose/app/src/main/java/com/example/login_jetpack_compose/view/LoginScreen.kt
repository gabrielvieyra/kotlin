package com.example.login_jetpack_compose.view

import android.content.ContentValues.TAG
import android.nfc.Tag
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun LoginScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Login Screen")
                }
            )
        }
    ) {
        val padding = 24.dp
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(padding),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido",
                style = MaterialTheme.typography.h6
                )
            Spacer(Modifier.height(32.dp))
            TextField(
                value = "",
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Usuario")
                },
                onValueChange = {}
            )
            Spacer(Modifier.height(24.dp))
            TextField(
                value = "",
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Clave de identificacion")
                },
                onValueChange = {}
            )

            Spacer(Modifier.height(24.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    Log.d(TAG, "El boton fue apretado")
                }
            ) {
                Text(text = "Ingresar")
            }

            Spacer(Modifier.height(24.dp))
            Text(
                text = "Recuperar usuario"
            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = "Recuperar clave de identificacion"
            )

            Spacer(Modifier.height(24.dp))
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Cras luctus pharetra " +
                        "ante, eu bibendum eros. Nullam lorem massa, ullamcorper sit amet lorem id, " +
                        "iaculis semper eros. Mauris fermentum elementum lectus quis laoreet. Praesent " +
                        "sodales maximus massa et sodales. Suspendisse potenti.",
                color = Color.Gray,
                textAlign = TextAlign.Center
            )
        }
    }
}

@Preview
@Composable
fun Preview() {
    LoginScreen()
}














































