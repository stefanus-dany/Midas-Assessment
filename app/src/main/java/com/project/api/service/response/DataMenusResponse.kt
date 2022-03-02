package com.project.api.service.response

import com.google.gson.annotations.SerializedName

data class DataMenusResponse(
    @field:SerializedName("code")
    val code: Int,

    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("ind")
    val ind: String,

    @field:SerializedName("eng")
    val eng: String,

    @field:SerializedName("price")
    val price: Int,

    @field:SerializedName("discPrice")
    val discPrice: Int,

    @field:SerializedName("image")
    val image: String,
)