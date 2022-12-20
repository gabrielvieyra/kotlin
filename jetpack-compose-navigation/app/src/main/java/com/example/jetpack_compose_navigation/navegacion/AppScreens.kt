package com.example.jetpack_compose_navigation.navegacion

/* En este caso usamos una sealed class (clases selladas) para centralizar en una sola clase todas las pantallas, esto nos permite tener muy en claro
cuales son las pantallas que conforman nuestra app */
sealed class AppScreens(val route: String) {
    // Definimos las rutas de cada una de nuestras pantallas
    object FirstScreen: AppScreens(route = "first_screen");
    object SecondScreen: AppScreens(route = "second_screen");
}
