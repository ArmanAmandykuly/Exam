package com.example.forexam.Common

import com.example.forexam.api.ApiService
import com.example.forexam.api.RetrofitClient

object Common {
    private val BASE_URL = "https://api.covid19api.com"
    val retrofitService: ApiService
        get() = RetrofitClient.getClient(BASE_URL).create(ApiService::class.java)
}