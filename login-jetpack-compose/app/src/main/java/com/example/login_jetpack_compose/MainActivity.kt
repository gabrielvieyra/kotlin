package com.example.login_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.login_jetpack_compose.screens.DashboardScreen
import com.example.login_jetpack_compose.screens.LoginScreen
import com.example.login_jetpack_compose.screens.LoginViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // No podemos hacer una instancia dentro de un Composable, se tiene que hacer adentro de un MainActivity
        val loginViewModel by viewModels<LoginViewModel>()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "login") {
                composable(route = "login") {
                    LoginScreen(loginViewModel, navController);
                }
                composable(route = "dashboard") {
                    DashboardScreen(navController);
                }
            }
        }
    }
}





















