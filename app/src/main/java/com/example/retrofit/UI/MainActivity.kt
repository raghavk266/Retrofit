package com.example.retrofit.UI

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.example.retrofit.R
import com.example.retrofit.databinding.ActivityMainBinding


private const val TAG = "MainActivity"
class MainActivity : AppCompatActivity() {
    lateinit private var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG,"onCreate")
        mBinding = DataBindingUtil.setContentView(this, com.example.retrofit.R.layout.activity_main)

        if (Build.VERSION.SDK_INT >= 21) {
            val window: Window = this.window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
            window.setStatusBarColor(this.resources.getColor(android.R.color.transparent))
        }
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