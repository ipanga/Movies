package com.tootiyesolutions.movies.data.repository

import com.tootiyesolutions.movies.data.remote.RemoteDataSource
import com.tootiyesolutions.movies.data.util.toMovie
import com.tootiyesolutions.movies.domain.model.Movie
import com.tootiyesolutions.movies.domain.repository.MovieRepository

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
): MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
            return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }
}