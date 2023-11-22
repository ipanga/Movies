package com.tootiyesolutions.movies.util

import kotlinx.coroutines.CoroutineDispatcher

internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher //This function (having same name in Android and IOs package) help to determine which platform to run