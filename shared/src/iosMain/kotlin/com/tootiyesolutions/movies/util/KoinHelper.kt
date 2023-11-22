package com.tootiyesolutions.movies.util

import com.tootiyesolutions.movies.di.getSharedModules
import org.koin.core.context.startKoin

fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}