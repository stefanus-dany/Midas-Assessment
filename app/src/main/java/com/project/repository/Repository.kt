package com.project.repository

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.project.api.service.RetrofitServer
import com.project.api.service.response.DataMenusResponse
import com.project.api.service.response.DataResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {

    fun getData(): LiveData<List<DataMenusResponse>> {
        val mutableData = MutableLiveData<List<DataMenusResponse>>()
        val api = RetrofitServer().getInstance()
        api.getData(1).enqueue(object : Callback<DataResponse> {
            override fun onResponse(
                call: Call<DataResponse>,
                response: Response<DataResponse>
            ) {
                if (response.isSuccessful) {
                    mutableData.value = response.body()?.payload?.get(0)?.shop?.get(0)?.menus
                } else {
                    Log.e("getData", "onResponse: ${response.message()}")
                }
            }

            override fun onFailure(call: Call<DataResponse>, t: Throwable) {
                Log.e("getData", "onResponse: ${t.message}")
            }

        })
        return mutableData
    }
}