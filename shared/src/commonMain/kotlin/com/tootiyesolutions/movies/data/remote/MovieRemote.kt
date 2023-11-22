package com.tootiyesolutions.movies.data.remote

import kotlinx.serialization.SerialName

@kotlinx.serialization.Serializable
internal data class MovieRemote( //We use "internal" to make the class private
    val id: Int,
    val title: String,
    val overview: String,
    @SerialName("poster_path")
    val posterImage: String,
    @SerialName("release_date")
    val releaseDate: String
)
