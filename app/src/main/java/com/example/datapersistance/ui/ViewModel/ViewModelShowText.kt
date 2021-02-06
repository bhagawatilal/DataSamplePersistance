package com.example.datapersistance.ui.ViewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelShowText: ViewModel() {


    var text=MutableLiveData<String>()



    fun viewModelOnclick(textInput:String) {
        text.value=textInput
    }
}