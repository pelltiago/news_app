package com.example.hackernews.domain

import NewsResponse
import com.example.hackernews.data.network.news.NewsRepository

class GetNewsUseCase() {
    private val repository = NewsRepository()

    suspend operator fun invoke(): NewsResponse {
        return repository.getNews()
    }
}
