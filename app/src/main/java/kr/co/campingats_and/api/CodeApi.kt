package kr.co.campingats_and.api

import kr.co.campingats_and.api.response.ApiResponse
import retrofit2.http.GET

interface CodeApi {

    @GET("/api/code/scale")
    suspend fun scale(): ApiResponse<String>

    companion object {
        val instance = ApiGenerator().generate(CodeApi::class.java)
    }
}