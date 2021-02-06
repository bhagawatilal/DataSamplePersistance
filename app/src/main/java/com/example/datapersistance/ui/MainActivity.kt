package com.example.datapersistance.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.datapersistance.R
import com.example.datapersistance.ui.ViewModel.ViewModelShowText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewModel= ViewModelProviders.of(this).get(ViewModelShowText::class.java)

        btnShow.setOnClickListener {
            viewModel.viewModelOnclick(textInput.text.toString())
        }

        viewModel.text.observe(this, Observer {
            tvShow.visibility=View.VISIBLE
            tvShow.setText(it)
        })


    }
}