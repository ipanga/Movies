package com.tootiyesolutions.movies.android

import android.app.Application
import com.tootiyesolutions.movies.android.di.appModule
import com.tootiyesolutions.movies.di.getSharedModules
import org.koin.core.context.startKoin

class Movie: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(appModule + getSharedModules())
        }
    }
}