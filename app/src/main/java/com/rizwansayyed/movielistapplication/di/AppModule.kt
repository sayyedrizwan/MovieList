package com.rizwansayyed.movielistapplication.di

import com.rizwansayyed.movielistapplication.apis.interfaceapi.MoviesAPI
import com.rizwansayyed.movielistapplication.utils.Creds
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@Singleton
object AppModule {

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit.Builder().baseUrl(Creds.MAIN_URLS)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun TopRatedList(retrofit: Retrofit): MoviesAPI =
        retrofit.create(MoviesAPI::class.java)
}