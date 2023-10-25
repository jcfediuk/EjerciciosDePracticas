package com.example.androidmaster.superHeroApp

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/api/237213552673591/search/{name}")
    suspend fun getSuperHeroes(@Path("name") superHeroName: String): Response<SuperHeroDataResponse>

    @GET("/api/237213552673591/{id}")
    suspend fun getSuperHeroDetail(@Path("id") superHeroId: String) : Response<SuperHeroDetailResponse>
}
