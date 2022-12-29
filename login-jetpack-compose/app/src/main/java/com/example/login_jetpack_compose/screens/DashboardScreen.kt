package com.example.login_jetpack_compose.screens

import androidx.compose.animation.*
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar() {
                Icon(imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Arrow back",
                    modifier = Modifier.clickable {
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(8.dp))
                Text(text = "DashboardScreen")
            }
        }
    ) {
        Text(text = "Bienvenido Gabriel Vieyra")
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun Animations() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        var isVisible by remember {
            mutableStateOf(value = false)
        }
        var isRound by remember {
            mutableStateOf(value = false)
        }

        Button(
            onClick = {
                isVisible = !isVisible;
                isRound = !isRound;
            }
        ) {
            Text(text = "Toggle")
        }
        /*val transition = updateTransition(
            targetState = isRound,
            label = null
        )*/
        /*val borderRadius by transition.animateInt(
            transitionSpec = { tween(2000) },
            label = "borderRadius",
            targetValueByState = { isRound ->
                if(isRound) 100 else 0
            }
            /*animationSpec = spring(
                dampingRatio = Spring.DampingRatioHighBouncy,
                stiffness = Spring.StiffnessVeryLow
            )*/
            /*animationSpec = tween(
                durationMillis = 3000,
                delayMillis = 500,
            )*/
        )*/
        /*val color by transition.animateColor(
            transitionSpec = { tween(1000) },
            label = "color",
            targetValueByState = { isRound ->
                if(isRound) Color.Green else Color.Red
            }
        )*/
        // Infinite animation
        /*val transition = rememberInfiniteTransition()
        val color by transition.animateColor(
            initialValue = Color.Red,
            targetValue = Color.Green,
            animationSpec = infiniteRepeatable(
                animation = tween(2000),
                repeatMode = RepeatMode.Reverse
            )
        )
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(color)
        )*/
        // Animate visibility
        /*AnimatedVisibility(
            visible = isVisible,
            enter = slideInHorizontally() + fadeIn(),
            modifier = Modifier.fillMaxWidth().weight(1f)
        ) {
            Box(modifier = Modifier.background(Color.Red))
            //Text(text = "Probando")
        }*/
        // Animating content change
        AnimatedContent(
            targetState = isVisible,
            modifier = Modifier.fillMaxWidth().weight(1f),
            content = { isVisible ->
                if(isVisible) {
                    Box(modifier = Modifier.background(Color.Green))
                } else {
                    Box(modifier = Modifier.background(Color.Red))
                }
            },
            transitionSpec = {
                slideInHorizontally(
                    initialOffsetX = {
                        if(isVisible) it else -it
                    }
                ) with slideOutHorizontally(
                    targetOffsetX = {
                        if(isVisible) -it else it
                    }
                )
            }
        )
    }
}

// showSystemUi con un valor true te muestra como si estuvieses en un celu sin la nesecidad del emulador
@Preview(showSystemUi = true)
@Composable
fun Preview() {
    //DashboardScreen(navController)
    Animations()
}



















