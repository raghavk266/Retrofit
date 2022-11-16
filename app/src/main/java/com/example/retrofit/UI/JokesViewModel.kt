package com.example.retrofit.UI

import android.util.Log
import androidx.lifecycle.*
import com.example.retrofit.data.model.CNJokes
import com.example.retrofit.data.repo.JokesRepository
import kotlinx.coroutines.launch

private const val TAG = "JokesViewModel"
class JokesViewModel(
    private val repo: JokesRepository
) : ViewModel() {

    private val joke:MutableLiveData<CNJokes> = MutableLiveData<CNJokes>()
    val _joke: LiveData<CNJokes> = joke

    fun getRandomJoke(){
        try{
            viewModelScope.launch {
                joke.value = repo.getRandomJoke()
            }
        }catch(e:Exception){
            Log.e(TAG,"exception caught ${e.message}")
        }

    }
}

class MyViewModelFactory(private val repo : JokesRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(JokesViewModel::class.java))
                return JokesViewModel(repo) as T
        throw IllegalArgumentException()
    }
}