package com.example.mvvmlistdemo.data

class QuoteRepsository private constructor(private val quoteDao: FakeQuoteDao){

    fun addQuote(quote: Quote){
        quoteDao.addQuote(quote)
    }
    fun getQuotes() = quoteDao.getQuotes()

    companion object{
        @Volatile private var instance: QuoteRepsository? = null

        fun getInstance(quoteDao: FakeQuoteDao) = instance ?: synchronized(this){
            instance ?: QuoteRepsository(quoteDao).also { instance =it}
        }
    }
}