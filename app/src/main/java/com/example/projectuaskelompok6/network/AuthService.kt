package com.example.projectuaskelompok4.network

import com.example.projectuaskelompok4.model.LoginRequest
import com.example.projectuaskelompok4.model.LoginResponse
import com.example.projectuaskelompok4.model.RegisterRequest
import com.example.projectuaskelompok4.model.RegisterResponse
import com.example.projectuaskelompok4.model.ProductResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AuthService {
    @POST("auth/login")
    fun login(@Body loginRequest: LoginRequest): Call<LoginResponse>

    @POST("auth/register")
    fun register(@Body registerRequest: RegisterRequest): Call<RegisterResponse>

    @GET("products")
    fun getProducts(): Call<ProductResponse>
}