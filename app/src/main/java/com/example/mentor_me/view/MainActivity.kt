package com.example.mentor_me.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mentor_me.MyApi
import com.example.mentor_me.R
import com.example.mentor_me.model.client
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val retrofit = Retrofit.Builder()
            .baseUrl("http://192.168.0.249:3000/") // Замените на ваш адрес сервера
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api = retrofit.create(MyApi::class.java)
        val call = api.getClients().enqueue(object : Callback<client> {
            override fun onResponse(call: Call<client>, response: Response<client>) {
                if (response.isSuccessful) {
                    val message = response.body()
                    Log.d("f",message!!.message.toString()+" responseSuccessful")
                } else {
                    // Обработка ошибки
                }
            }

            override fun onFailure(call: Call<client>, t: Throwable) {
                Log.d("f","responseFail:" + t.message)
            }
        })



    }

}