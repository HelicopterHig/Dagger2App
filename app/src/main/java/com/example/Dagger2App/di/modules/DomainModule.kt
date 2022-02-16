package com.example.Dagger2App.di.modules

import com.example.domain.usecase.GetUserNameUseCase
import com.example.domain.usecase.SaveUserNameUseCase
import dagger.Module


@Module
class DomainModule {

    fun provideGetUserNameUseCase(userRepository: UserRepository): GetUserNameUseCase{
        return GetUserNameUseCase(userRepository = userRepository)
    }

    fun provideSaveUserNameUseCase(userRepository: UserRepository): SaveUserNameUseCase{
        return SaveUserNameUseCase(userRepository = userRepository)
    }


}