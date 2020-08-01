package com.example.learnviewmodel

import androidx.lifecycle.ViewModel

class CustomViewModel(x: Int) : ViewModel() {
    var cout: Int = x


//    override fun onCleared() {
//        super.onCleared()
//        // restart if clear
//        cout = 0
//    }
}