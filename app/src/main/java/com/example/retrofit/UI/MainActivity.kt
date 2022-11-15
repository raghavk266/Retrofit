package com.example.retrofit.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.R
import com.example.retrofit.data.Retrofits
import com.example.retrofit.data.datasource.JokesApi
import com.example.retrofit.data.repo.JokesRepository
import com.example.retrofit.databinding.ActivityMainBinding

private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    lateinit private var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate")
        mBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
//        val api = Retrofits.apiInstance
//        val repo = JokesRepository(api)
        supportFragmentManager.commit {
            replace(R.id.container,HomeScreen())
        }
//        mBinding.makeRequestButton.setOnClickListener{
//            viewModel.getRandomJoke()
//        }
//        viewModel._joke.observe(this){
//            Log.e(TAG,it.toString())
//        }

    }
}