package com.example.mvvmprac2.repository

import android.util.Log
import com.example.mvvmprac2.data.Lotto
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object LottoRemoteDataSource {
    fun getLottoInfo(drwNo:Int, callback:LottoRepository.GetDataCallback<Lotto>){
        Log.e("summer","dataSource1")
        RetrofitService.retrofit.create(LottoAPI::class.java).getLottoInfo(drwNo).enqueue(object: Callback<Lotto>{
            override fun onResponse(call: Call<Lotto>, response: Response<Lotto>) {
                if (response.isSuccessful){
                    callback.onSuccess(response.body())
                    Log.e("summer","dataSource2")
                }
            }
            override fun onFailure(call: Call<Lotto>, t: Throwable) {
                callback.onFailure(t)
            }
        })
    }
}