package com.example.mvvmlistdemo.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmlistdemo.data.QuoteRepsository

class QuotesViewModelFactory(private val quoteRepository: QuoteRepsository) : ViewModelProvider.NewInstanceFactory(){

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return QuotesViewModel(quoteRepository) as T
    }






}