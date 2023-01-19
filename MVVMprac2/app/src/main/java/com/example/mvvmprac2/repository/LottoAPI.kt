package com.example.mvvmprac2.repository

import com.example.mvvmprac2.data.Lotto
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface LottoService {
    @GET("/common.do?method=getLottoNumber")
    fun getLottoInfo(@Query("drwNo") drwNo:Int): Call<Lotto>
}