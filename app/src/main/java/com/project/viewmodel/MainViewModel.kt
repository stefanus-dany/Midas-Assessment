package com.project.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.project.api.service.response.DataMenusResponse
import com.project.repository.Repository

class MainViewModel : ViewModel() {
    private val repository = Repository()
    fun getData(): LiveData<List<DataMenusResponse>> =
        repository.getData()
}