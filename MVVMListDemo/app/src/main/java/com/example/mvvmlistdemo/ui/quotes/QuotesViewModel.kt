package com.example.mvvmlistdemo.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.mvvmlistdemo.data.Quote
import com.example.mvvmlistdemo.data.QuoteRepsository

class QuotesViewModel(private val quoteRepsository: QuoteRepsository) : ViewModel(){

    fun getQuotes() = quoteRepsository.getQuotes()

    fun addQuote(quote:Quote)= quoteRepsository.addQuote(quote)
}