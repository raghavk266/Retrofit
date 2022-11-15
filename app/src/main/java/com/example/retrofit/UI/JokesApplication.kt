package com.example.retrofit.UI

import android.app.Application
import com.example.retrofit.data.apiInstance
import com.example.retrofit.data.repo.JokesRepository

class JokesApplication : Application() {
    lateinit var repo: JokesRepository
    override fun onCreate() {
        super.onCreate()
        val retrofitApiInstance = apiInstance
        val repo = JokesRepository(retrofitApiInstance)
    }
}