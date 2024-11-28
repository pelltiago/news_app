package com.example.hackernews.ui.viewModel

import Hit

data class NewsListState(
    val allItems: MutableList<Hit> = mutableListOf(),
    val isLoading: Boolean = false,
    val errorMessage: String? = null
)
