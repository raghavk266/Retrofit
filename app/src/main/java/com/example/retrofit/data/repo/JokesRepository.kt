package com.example.retrofit.data.repo

import com.example.retrofit.data.datasource.JokesApi
import com.example.retrofit.data.model.CNJokes

class JokesRepository(private val api:JokesApi){
    suspend fun getRandomJoke() = api.getRandomJoke()
}