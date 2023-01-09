package com.example.login_jetpack_compose.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.*
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun SvgAnimationsScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "SVG Animations")
                }
            )
        }
    ) {
        Column {
            HorizontalPager(count = listData.size) { page ->
                val composition by rememberLottieComposition(LottieCompositionSpec.RawRes(listData[page].resId))

                Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp)
        ) {
            LottieAnimation(
                composition,
                iterations = LottieConstants.IterateForever,
                //speed = 5.0f,
                modifier = Modifier.height(300.dp).background(Color.Red)
            )
                    Spacer(modifier = Modifier.height(24.dp))
                    Text(
                        listData[page].title,
                        style = MaterialTheme.typography.h5
                    )
        }
            }
        }
    }
}

/*@Preview(showSystemUi = true)
@Composable
fun Preview() {
    SvgAnimationsScreen()
}*/





























