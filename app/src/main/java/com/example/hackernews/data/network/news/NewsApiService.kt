package com.example.hackernews.data.network.news

import NewsResponse
import retrofit2.http.GET

interface NewsApiService {
    @GET("api/v1/search_by_date?query=android")
    suspend fun getNews(): NewsResponse
}
