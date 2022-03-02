package com.project.api.service.response

import com.google.gson.annotations.SerializedName

data class ShopResponse(
    @field:SerializedName("shop")
    val shop: List<MenusResponse>
)