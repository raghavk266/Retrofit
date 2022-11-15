package com.example.retrofit.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.commit
import com.example.retrofit.R
import com.example.retrofit.databinding.FragmentHomeScreenBinding

class HomeScreen : Fragment() {
    lateinit private var mBinding: FragmentHomeScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_home_screen,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.makeRequestButton.setOnClickListener {
            parentFragmentManager.commit {
                replace(R.id.container,QuoteScreen())
            }
        }
    }
}