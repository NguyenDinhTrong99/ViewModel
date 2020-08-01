package com.example.learnviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class FactoryCustomVM(val count: Int) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return  modelClass.getConstructor(Int::class.java).newInstance(count)
    }

}