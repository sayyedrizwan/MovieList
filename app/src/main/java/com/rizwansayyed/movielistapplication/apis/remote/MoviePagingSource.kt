package com.rizwansayyed.movielistapplication.apis.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.rizwansayyed.movielistapplication.apis.interfaceapi.MoviesAPI
import com.rizwansayyed.movielistapplication.data.MoviesList
import com.rizwansayyed.movielistapplication.utils.Creds

private const val STARTING_PAGE_INDEX = 1

class MoviePagingSource(private val moviesAPI: MoviesAPI): PagingSource<Int, MoviesList>() {

    override fun getRefreshKey(state: PagingState<Int, MoviesList>): Int? {
        TODO("Not yet implemented")
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, MoviesList> {
        return try{
            val position: Int = params.key ?: STARTING_PAGE_INDEX
            val response = moviesAPI.getTopRated(Creds.API_KEY, "US", position)
            val moviesList = response.request()


        }
    }

}