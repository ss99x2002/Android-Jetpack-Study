package com.example.mvvmprac2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mvvmprac2.databinding.ActivityMainBinding
import com.example.mvvmprac2.viewmodel.LottoViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding:ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.run{
            viewmodel= LottoViewModel()
            drwNo=900
        }
    }
}