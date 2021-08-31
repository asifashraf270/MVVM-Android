package com.example.ordermanagment.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.example.ordermanagment.utilities.AppConstant
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PreferenceModule {

    @Provides
    @Singleton
    fun provideSharedPreference(app: Application): SharedPreferences =
        app.getSharedPreferences(AppConstant.PREF_NAME, Context.MODE_PRIVATE)
}