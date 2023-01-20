package com.example.mvvmprac2.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitService {
    private val baseUrl = "https://www.dhlottery.co.kr"
    val retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

   val retrofitApi :LottoAPI = RetrofitService.retrofit.create(LottoAPI::class.java)
}