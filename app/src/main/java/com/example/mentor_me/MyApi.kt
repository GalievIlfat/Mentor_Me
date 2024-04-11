package com.example.mentor_me

import com.example.mentor_me.model.client
import retrofit2.Call
import retrofit2.http.GET

interface MyApi {
    @GET("clients")
    fun getClients(): Call<client>
}