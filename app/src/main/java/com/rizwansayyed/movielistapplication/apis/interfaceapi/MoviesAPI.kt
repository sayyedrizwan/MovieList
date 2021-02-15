package com.rizwansayyed.movielistapplication.apis.interfaceapi

import com.rizwansayyed.movielistapplication.data.MoviesList
import com.rizwansayyed.movielistapplication.utils.Creds
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesAPI {
    @GET(Creds.TOP_RATED)
    fun getTopRated(
        @Query("api_key")
        api_key: String,
        @Query("language")
        language: String,
        @Query("page")
        page: Int,
    ): Call<MoviesList>


}