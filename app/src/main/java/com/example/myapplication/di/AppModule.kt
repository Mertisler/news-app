package com.example.myapplication.di

import android.app.Application
import com.example.myapplication.data.manger.LocalUserMangerImpl
import com.example.myapplication.domain.manger.LocalUserManger
import com.example.myapplication.domain.usecases.AppEntryUseCases
import com.example.myapplication.domain.usecases.ReadAppEntry
import com.example.myapplication.domain.usecases.SaveAppEntry

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManger = LocalUserMangerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManger
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}