package com.nonmagis.demoday.ui.fragment.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nonmagis.demoday.data.model.AnswerModel
import com.nonmagis.demoday.data.model.RegisterModel
import com.nonmagis.demoday.data.remote.MainRepository

class MainViewModel: ViewModel() {

    private val repo = MainRepository()

    var liveData: LiveData<List<AnswerModel>> = MutableLiveData()

    fun getUser(model: RegisterModel) {
        liveData = repo.getUser(model)
    }
}