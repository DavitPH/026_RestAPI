package com.example.pratikum12.service_api

import com.example.pratikum12.model.Kontak
import retrofit2.http.GET
import retrofit2.http.Headers

interface KontakService {

    @Headers(
        "Accept: application/json"
    )
    @GET("kontak.json")
    suspend fun getKontak(): List<Kontak>
}