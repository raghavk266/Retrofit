package com.example.retrofit.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.retrofit.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val application = this.application as JokesApplication
        val repository = application.repo

    }
}