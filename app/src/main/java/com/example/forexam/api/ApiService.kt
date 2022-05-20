package com.example.forexam.api

import com.example.forexam.model.Country
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("countries/")
    fun getCountries(): Call<List<Country>>

    @GET("country/{slug}/")
    fun getCountry(name: String): Call<Country>
}