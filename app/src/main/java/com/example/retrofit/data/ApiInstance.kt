package com.example.retrofit.data

import com.example.retrofit.BASE_URL
import com.example.retrofit.data.datasource.JokesApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

val apiInstance: JokesApi by lazy{
    Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build().create(JokesApi::class.java)
}