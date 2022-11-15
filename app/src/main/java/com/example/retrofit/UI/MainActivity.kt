package com.example.retrofit.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.R
import com.example.retrofit.data.Retrofits
import com.example.retrofit.data.datasource.JokesApi
import com.example.retrofit.data.repo.JokesRepository

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val api = Retrofits.apiInstance
        val repo = JokesRepository(api)
        val viewModel = ViewModelProvider(this,MyViewModelFactory(repo)).get(JokesViewModel::class.java)
        viewModel.getRandomJoke()
        viewModel._joke.observe(this){
            Log.e(TAG,it.toString())
        }
    }
}