package com.example.login_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.example.login_jetpack_compose.view.LoginScreen
import com.example.login_jetpack_compose.view.LoginViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // No podemos hacer una instancia dentro de un Composable, se tiene que hacer adentro de un MainActivity
        val loginViewModel by viewModels<LoginViewModel>()
        setContent {
            LoginScreen(loginViewModel);
        }
    }
}