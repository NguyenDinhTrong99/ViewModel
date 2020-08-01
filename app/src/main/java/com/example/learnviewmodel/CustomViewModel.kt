package com.example.learnviewmodel

import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {
    var cout: Int = 0


    override fun onCleared() {
        super.onCleared()
        // restart if clear
        cout = 0
    }
}