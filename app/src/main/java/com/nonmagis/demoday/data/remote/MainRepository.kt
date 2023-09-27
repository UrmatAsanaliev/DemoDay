package com.nonmagis.demoday.data.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.nonmagis.demoday.data.model.AnswerModel
import com.nonmagis.demoday.data.model.RegisterModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainRepository {
    private val api = ApiConfig().getApi()

    fun getUser(model: RegisterModel): LiveData<List<AnswerModel>> {
        val liveData = MutableLiveData<List<AnswerModel>>()
        api.getUser(model).enqueue(object: Callback<List<AnswerModel>> {
            override fun onResponse(
                call: Call<List<AnswerModel>>,
                response: Response<List<AnswerModel>>
            ) {
                liveData.value = response.body()
            }
            override fun onFailure(call: Call<List<AnswerModel>>, t: Throwable) {
                Log.e("msg", t.localizedMessage)
            }
        })
        return liveData
    }
}


