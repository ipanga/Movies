package com.tootiyesolutions.movies.data.remote

import com.tootiyesolutions.movies.util.Dispatcher
import kotlinx.coroutines.withContext

internal class RemoteDataSource( //This class is responsible to provide the remote data to the repository, as well as switching the network call
    private val apiService: MovieService,
    private val dispatcher: Dispatcher
) {
    suspend fun getMovies(page: Int) = withContext(dispatcher.io){
        apiService.getMovies(page = page)
    }

    suspend fun getMovie(movieId: Int) = withContext(dispatcher.io){
        apiService.getMovie(movieId = movieId)
    }
}