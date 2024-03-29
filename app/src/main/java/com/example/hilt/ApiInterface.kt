package com.example.hilt

import io.reactivex.Single
import retrofit2.http.GET

interface ApiInterface {
    @GET("/superhero-api/api/all.json")
    fun getHeroes(): Single<List<Hero>>
}
