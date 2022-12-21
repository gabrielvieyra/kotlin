package com.example.hello_jetpack_compose.main

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class BookViewModel: ViewModel() {
    var state by mutableStateOf(BookState())
        private set

    init {
        viewModelScope.launch {
            state = state.copy(
                isLoading = true
            )
            delay(timeMillis = 5000)
            state = state.copy(
                books = listOf(
                    Book(title = "Clean Code", author = "Robert C Martin"),
                    Book(title = "Refactoring", author = "Martin Fowler"),
                    Book(title = "Effective Java", author = "Joshua Bloch")
                ),
                isLoading = false
            )
        }
    }

    fun onBookClicked(book: Book) {
        val index = state.books.indexOf(book)
        val updatedBooks = state.books.toMutableList()
        updatedBooks.removeAt(index)

        state = state.copy(
            books = updatedBooks
        )
    }
}