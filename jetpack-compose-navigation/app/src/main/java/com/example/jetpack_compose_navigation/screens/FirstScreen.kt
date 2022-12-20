package com.example.jetpack_compose_navigation.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.jetpack_compose_navigation.navegacion.AppScreens

// Lo tenemos que usar cada vez que queramos usar algun componente de jetpack compose
@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(topBar ={
        TopAppBar() {
            Text(text = "FirstScreen")
        }
    }) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {
    // Los modificadores me permiten cambiar los estilos por default que tienen los componentes
    Column(
        // El componente ocupa toda la pantalla
        modifier = Modifier.fillMaxSize(),
        // Me permite centrar verticalmente
        verticalArrangement = Arrangement.Center,
        // Me permite centrar horizontalmente
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       Text("Hola navegacion")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route)
        }) {
            Text(text = "Navega")
        }
    }
}


















