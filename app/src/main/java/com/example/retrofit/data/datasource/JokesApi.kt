package com.example.retrofit.data.datasource

import com.example.retrofit.data.model.CNJokes
import com.example.retrofit.headerAccept
import com.example.retrofit.headerXRapidMap
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers

interface JokesApi {

    @Headers("X-RapidAPI-Key: b75736a949msh2cbebe099219278p19dc4ejsn7596875ceae1","X-RapidAPI-Host: matchilling-chuck-norris-jokes-v1.p.rapidapi.com","accept: application/json","useQueryString: true")
    @GET("random")
    suspend fun getRandomJoke():CNJokes

}