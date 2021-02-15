package com.rizwansayyed.movielistapplication.apis.remote

import com.rizwansayyed.movielistapplication.apis.interfaceapi.MoviesAPI
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepos @Inject constructor(val moviesAPI: MoviesAPI) {

}