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
fun SecondScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar() {
            Icon(imageVector = Icons.Default.ArrowBack,
            contentDescription = "Arrow back",
            modifier = Modifier.clickable {
                navController.popBackStack()
            })
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "SecondScreen")
        }
    }) {
        SecondBodyContent(navController);
    }
}

@Composable
fun SecondBodyContent(navController: NavController) {
    // Los modificadores me permiten cambiar los estilos por default que tienen los componentes
    Column(
        // El componente ocupa toda la pantalla
        modifier = Modifier.fillMaxSize(),
        // Me permite centrar verticalmente
        verticalArrangement = Arrangement.Center,
        // Me permite centrar horizontalmente
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("He navegado")
        Button(onClick = {
            // Me permite navegar hacia atras
            navController.popBackStack()
        }) {
            Text(text = "Volver atras")
        }
    }
}















