package com.example.android_library

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.android_library.ui.theme.AndroidlibraryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidlibraryTheme {
                test()
            }
        }
    }
}

@Composable
fun test() {
    Text(text = "Hello world")
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    test()
}