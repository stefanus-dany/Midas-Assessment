package com.project.api.service.response

import com.google.gson.annotations.SerializedName

data class MenusResponse(
    @field:SerializedName("code")
    val code: Int,

    @field:SerializedName("shopName")
    val shopName: String,

    @field:SerializedName("address")
    val address: String,

    @field:SerializedName("image")
    val image: String,

    @field:SerializedName("Menus")
    val menus: List<DataMenusResponse>
)