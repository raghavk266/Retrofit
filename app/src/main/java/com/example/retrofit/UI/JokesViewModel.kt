package com.example.retrofit.UI

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.data.repo.JokesRepository

class JokesViewModel(
    private val repo: JokesRepository
) : ViewModel() {
    fun getRandomJoke(){

    }
}

class MyViewModelFactory(private val repo : JokesRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(JokesViewModel::class.java)
                return JokesViewModel(repo) as T
        throw IllegalArgumentException()
    }
}