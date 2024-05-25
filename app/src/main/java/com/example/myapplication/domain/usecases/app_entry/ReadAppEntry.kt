package com.example.myapplication.domain.usecases.app_entry

import com.example.myapplication.domain.manger.LocalUserManger
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManger: LocalUserManger
) {

     operator fun invoke(): Flow<Boolean> {
        return localUserManger.readAppEntry()
    }

}