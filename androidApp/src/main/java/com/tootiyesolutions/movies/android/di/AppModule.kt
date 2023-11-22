package com.tootiyesolutions.movies.android.di

import com.tootiyesolutions.movies.android.detail.DetailViewModel
import com.tootiyesolutions.movies.android.home.HomeViewModel
import org.koin.androidx.compose.get
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel {params -> DetailViewModel(getMovieUseCase = get(), movieId = params.get())}
}