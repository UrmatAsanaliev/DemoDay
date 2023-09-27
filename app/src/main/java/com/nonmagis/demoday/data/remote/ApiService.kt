package com.nonmagis.demoday.data.remote

import com.nonmagis.demoday.data.model.AnswerModel
import com.nonmagis.demoday.data.model.RegisterModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {

    @POST("users/")
    fun getUser(
        @Body model: RegisterModel
    ) : Call<List<AnswerModel>>
}