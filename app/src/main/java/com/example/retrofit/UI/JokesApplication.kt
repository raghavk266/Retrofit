package com.example.retrofit.UI

import android.app.Application
import android.util.Log
import com.example.retrofit.data.Retrofits
import com.example.retrofit.data.repo.JokesRepository

private const val TAG = "JokesApplication"
class JokesApplication : Application() {
    lateinit var repo : JokesRepository
    override fun onCreate() {
        super.onCreate()
        Log.e(TAG,"inAppOnCreate")
         repo = JokesRepository(Retrofits.apiInstance)
    }
}