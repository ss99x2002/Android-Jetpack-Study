package com.example.mvvmprac2.repository

import android.util.Log
import com.example.mvvmprac2.data.Lotto

object LottoRepository {
    private val remoteDataSource = LottoRemoteDataSource

    fun getLottoInfo(drwNo:Int, callback:GetDataCallback<Lotto>){
        Log.e("summer","repository")
        return remoteDataSource.getLottoInfo(drwNo,callback)
    }

    interface GetDataCallback<T>{
        fun onSuccess(data:T?)
        fun onFailure(throwable:Throwable)
    }
}