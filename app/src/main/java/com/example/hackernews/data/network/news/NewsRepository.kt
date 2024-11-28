package com.example.hackernews.data.network.news

import NewsResponse
import com.example.hackernews.data.network.RetrofitHelper

class NewsRepository {
    private val api = RetrofitHelper.getRetrofit().create(NewsApiService::class.java)

    suspend fun getNews(): NewsResponse {
        return api.getNews()
    }
}
