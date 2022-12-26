package com.example.login_jetpack_compose.view

import android.content.ContentValues.TAG
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class LoginViewModel: ViewModel() {
    var state by mutableStateOf(LoginState())
        // Lo usamos para que la vista no pueda modificar el estado, si no que solo la pueda acceder
        private set

    fun handleUserFieldValue(value: String) {
        state = state.copy(
            userField = value
        )
    }

    fun handlePasswordFieldValue(value: String) {
        state = state.copy(
            passwordField = value
        )
    }
}