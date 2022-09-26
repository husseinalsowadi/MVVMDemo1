package com.example.mvvmlistdemo.utilities

import com.example.mvvmlistdemo.data.FakeDatabase
import com.example.mvvmlistdemo.data.QuoteRepsository
import com.example.mvvmlistdemo.ui.quotes.QuotesViewModelFactory

object InjectorUtils {
    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quoteRepsository = QuoteRepsository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepsository)
    }

}