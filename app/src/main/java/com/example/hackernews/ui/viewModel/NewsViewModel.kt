package com.example.hackernews.ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.hackernews.domain.GetNewsUseCase
import kotlinx.coroutines.launch

class NewsViewModel : ViewModel() {

    private val getNewsUseCase = GetNewsUseCase()

    var state by mutableStateOf(NewsListState())
        private set

    fun fetchNews() {
        viewModelScope.launch {
            state = state.copy(isLoading = true, errorMessage = null)
            try {
                val result = getNewsUseCase()
                state = state.copy(
                    allItems = result.hits,
                    isLoading = false,
                    errorMessage = null
                )
            } catch (e: Exception) {
                state = state.copy(
                    isLoading = false,
                    errorMessage = "Failed to load news: ${e.message}"
                )
            }
        }
    }

}
