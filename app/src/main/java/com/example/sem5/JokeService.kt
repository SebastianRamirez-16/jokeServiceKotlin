package com.example.sem5

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface JokeService {
    @GET("joke/Any")

    fun getJoke(@Query("format") format: String): Call<Joke>



}