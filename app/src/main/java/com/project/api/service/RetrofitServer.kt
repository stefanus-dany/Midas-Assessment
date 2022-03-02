package com.project.api.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitServer {

    fun getInstance(): ApiService{
        val retrofit = Retrofit.Builder()
            .baseUrl("http://midas-be-task.herokuapp.com/midas/config/v1/foodDelivery/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(ApiService::class.java)
    }
}