package com.example.mvvmprac2.data

import com.google.gson.annotations.SerializedName

data class Lotto (
    @field:SerializedName("totSellamnt")
    val totSellamnt: Long? = null,

    @field:SerializedName("returnValue")
    val returnValue: String? = null,

    @field:SerializedName("drwNoDate")
    val drwNoDate: String? = null,

    @field:SerializedName("firstWinamnt")
    val firstWinamnt: Long? = null,

    @field:SerializedName("drwtNo6")
    val drwtNo6: Int? = null,

    @field:SerializedName("drwtNo4")
    val drwtNo4: Int? = null,

    @field:SerializedName("firstPrzwnerCo")
    val firstPrzwnerCo: Int? = null,

    @field:SerializedName("drwtNo5")
    val drwtNo5: Int? = null,

    @field:SerializedName("bnusNo")
    val bnusNo: Int? = null,

    @field:SerializedName("firstAccumamnt")
    val firstAccumamnt: Long? = null,

    @field:SerializedName("drwNo")
    val drwNo: Int? = null,

    @field:SerializedName("drwtNo2")
    val drwtNo2: Int? = null,

    @field:SerializedName("drwtNo3")
    val drwtNo3: Int? = null,

    @field:SerializedName("drwtNo1")
    val drwtNo1: Int? = null
)
