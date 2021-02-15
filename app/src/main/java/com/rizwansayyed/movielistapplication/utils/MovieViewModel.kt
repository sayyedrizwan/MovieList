package com.rizwansayyed.movielistapplication.utils

import androidx.lifecycle.ViewModel
import com.rizwansayyed.movielistapplication.apis.remote.MovieRepos
import dagger.hilt.android.scopes.ViewModelScoped

class MovieViewModel (val repos: MovieRepos): ViewModel() {

}