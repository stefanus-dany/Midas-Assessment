package com.project.api.service

import com.project.api.service.response.DataResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("dataContent")
    fun getData(
        @Query("version") version: Int
    ): Call<DataResponse>
}