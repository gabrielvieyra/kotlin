package com.example.hello_jetpack_compose.main

data class BookState(
    val books: List<Book> = listOf(),
    val isLoading: Boolean = false
)
