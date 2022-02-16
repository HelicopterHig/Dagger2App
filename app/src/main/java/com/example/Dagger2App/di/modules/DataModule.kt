package com.example.Dagger2App.di.modules

import android.content.Context
import dagger.Module

@Module
class DataModule {


    fun provideUserStorage(context: Context): UserStorage {
        return ShardPrefUserStorage(context = context)
    }


    fun provideUserRepository(userStorage: UserStorage):  UserRepository {
        return  UserRepositoryImpl(userStorage = userStorage)
    }


}