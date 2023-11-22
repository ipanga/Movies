package com.tootiyesolutions.movies.di

import com.tootiyesolutions.movies.data.remote.MovieService
import com.tootiyesolutions.movies.data.remote.RemoteDataSource
import com.tootiyesolutions.movies.data.repository.MovieRepositoryImpl
import com.tootiyesolutions.movies.domain.repository.MovieRepository
import com.tootiyesolutions.movies.domain.usecase.GetMovieUseCase
import com.tootiyesolutions.movies.domain.usecase.GetMoviesUseCase
import com.tootiyesolutions.movies.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(), get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> {MovieRepositoryImpl(get())}
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModules() = sharedModules