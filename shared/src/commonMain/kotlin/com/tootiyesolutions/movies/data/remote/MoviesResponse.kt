package com.tootiyesolutions.movies.data.remote

@kotlinx.serialization.Serializable
internal data class MoviesResponse( //We use "internal" to make the class private
    val results: List<MovieRemote>
)
