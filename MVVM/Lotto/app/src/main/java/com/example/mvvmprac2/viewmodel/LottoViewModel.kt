package com.example.mvvmprac2.viewmodel

import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import com.example.mvvmprac2.data.Lotto
import com.example.mvvmprac2.repository.LottoRepository

class LottoViewModel : BaseObservable() {
    val lottoInfo = ObservableField<String>()

    fun getLottoInfo(drwNo:Int){
        Log.e("summer","viewmodel 함수")
        LottoRepository.getLottoInfo(drwNo,object : LottoRepository.GetDataCallback<Lotto>{
            override fun onSuccess(data: Lotto?) {
                data?.let{
                    val result = "${it.drwNoDate} 회차 당첨번호 : " + "${it.drwtNo1}  "+ "${it.drwtNo2}  "+
                            "${it.drwtNo3}  " + "${it.drwtNo4}  "+ "${it.drwtNo5}  "+ "${it.drwtNo6}  "
                    lottoInfo.set(result)
                    Log.e("summer","result : $result")
                }
            }

            override fun onFailure(throwable: Throwable) {
              throwable.printStackTrace()
            }
        })
    }
}