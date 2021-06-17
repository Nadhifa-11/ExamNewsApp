package com.nadhifa.newsapp10.network

import com.nadhifa.newsapp10.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("top-headlines")
    fun getNewsData(
        @Query("country") country : String?,
        @Query("apiKey") apiKey : String?,
    ):retrofit2.Call<NewsResponse>
}