package com.tootiyesolutions.movies.domain.repository

import com.tootiyesolutions.movies.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page: Int): List<Movie>

    suspend fun getMovie(movieId: Int): Movie
}