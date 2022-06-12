package com.example.weatherapp.data.remote


import com.example.weatherapp.data.entities.CharacterList
import com.example.weatherapp.data.entities.Character
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}