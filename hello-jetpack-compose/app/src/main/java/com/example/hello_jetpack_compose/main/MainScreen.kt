package com.example.hello_jetpack_compose.main

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun MainScreen(bookViewModel: BookViewModel) {
    val state = bookViewModel.state
    if (state.isLoading) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            CircularProgressIndicator()
        }
    }
    LazyColumn(modifier = Modifier.fillMaxWidth()) {
        items(state.books) {
            Column(modifier = Modifier.fillMaxWidth().clickable {
                bookViewModel.onBookClicked(it)
            }) {
                Text(text = it.title)
                Text(text = it.author)
                Divider()
            }
        }
    }
}