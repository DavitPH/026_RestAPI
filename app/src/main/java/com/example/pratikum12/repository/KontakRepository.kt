package com.example.pratikum12.repository

import com.example.pratikum12.model.Kontak
import com.example.pratikum12.service_api.KontakService

interface KontakRepository{
    suspend fun getKontak(): List<Kontak>
}

class NetworkKontakRepository(
    private val kontakApiService: KontakService
) : KontakRepository {
    override suspend fun getKontak(): List<Kontak> = kontakApiService.getKontak()
}