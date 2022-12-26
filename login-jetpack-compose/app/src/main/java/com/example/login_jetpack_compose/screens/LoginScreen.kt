package com.example.login_jetpack_compose.screens

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(loginViewModel: LoginViewModel, navController: NavController) {
    val state = loginViewModel.state
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
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
                // value es el valor que se va a mostrar en el texField
                // onValueChange, cada vez que tipeo una tecla se va a ejecutar este metodo
                value = state.userField,
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Usuario")
                },
                onValueChange = {
                    loginViewModel.handleUserFieldValue(it);
                },
                singleLine = true
            )
            Spacer(Modifier.height(24.dp))
            TextField(
                value = state.passwordField,
                modifier = Modifier.fillMaxWidth(),
                label = {
                    Text(text = "Clave de identificacion")
                },
                onValueChange = {
                    loginViewModel.handlePasswordFieldValue(it)
                },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(Modifier.height(24.dp))
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = {
                    if (state.userField.isNotBlank() && state.passwordField.isNotBlank()) {
                        Log.d(TAG, "Formulario valido")
                        scope.launch {
                            val result = scaffoldState.snackbarHostState.showSnackbar(
                                message = "Formulario valido"
                            )
                            when(result) {
                                SnackbarResult.ActionPerformed -> {
                                    Log.d(TAG, "Snackbar Accionado")
                                }
                                SnackbarResult.Dismissed -> {
                                    Log.d(TAG, "Snackbar Ignorado")
                                    navController.navigate(route = "dashboard")
                                }
                            }
                        }
                    } else {
                        Log.d(TAG, "Formulario invalido")
                        scope.launch {
                            scaffoldState.snackbarHostState.showSnackbar("Formulario invalido")
                        }
                    }
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

/*@Preview
@Composable
fun Preview() {
    LoginScreen()
}*/














































