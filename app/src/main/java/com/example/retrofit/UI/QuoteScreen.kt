package com.example.retrofit.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.retrofit.R
import com.example.retrofit.databinding.FragmentQuoteScreenBinding

class QuoteScreen : Fragment() {
    lateinit private var mBinding:FragmentQuoteScreenBinding
    private val mViewModel: JokesViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val repo = (requireActivity().application as JokesApplication).repo
        val viewModel = ViewModelProvider(this,MyViewModelFactory(repo)).get(JokesViewModel::class.java)
        mBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_quote_screen,container,false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.makeRequestButton.setOnClickListener {
            setUIChanges(true)
            mViewModel.getRandomJoke()
        }
        mViewModel._joke.observe(viewLifecycleOwner){
            setUIChanges(false)
            var text = it.value
            text = "'"+text+"'"
            mBinding.welcomeText.setText(text)
        }
    }
    fun setUIChanges(enable:Boolean= true){
        if(enable){
            mBinding.progressCircular.visibility = View.VISIBLE
        }else{
            mBinding.progressCircular.visibility = View.GONE
        }
    }
}