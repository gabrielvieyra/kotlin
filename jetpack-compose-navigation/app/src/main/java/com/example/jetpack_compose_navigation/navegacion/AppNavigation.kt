package com.example.jetpack_compose_navigation.navegacion

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.jetpack_compose_navigation.screens.FirstScreen
import com.example.jetpack_compose_navigation.screens.SecondScreen

@Composable
fun AppNavigation() {
    /* Esta constante navController la tenemos que propagar en todas las pantallas, esta constante conoce el estado de navegacion actual */
    val navController = rememberNavController()
    // El navHost va a conocer las pantallas y como navegar entre ellas
    // A startDestination le pasamos la ruta de inicio
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        // Aca vamos a definir las rutas
        composable(route = AppScreens.FirstScreen.route) {
               FirstScreen(navController)
           }
        composable(route = AppScreens.SecondScreen.route) {
            SecondScreen(navController)
        }
    }
}




























