package com.project.api.service.response

import com.google.gson.annotations.SerializedName

data class DataResponse(
    @field:SerializedName("payload")
    val payload: List<ShopResponse>
)