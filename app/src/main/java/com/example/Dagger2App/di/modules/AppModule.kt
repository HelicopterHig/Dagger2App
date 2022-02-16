package com.example.Dagger2App.di.modules

import android.content.Context
import com.example.Dagger2App.presentation.MainViewModel
import com.example.Dagger2App.presentation.MainViewModelFactory
import com.example.domain.usecase.GetUserNameUseCase
import com.example.domain.usecase.SaveUserNameUseCase
import dagger.Module


@Module
class AppModule(val context: Context) {


    fun provideContext(): Context{
        return context
    }

    /**
     * как только кто то попросит Factory, то Dagger найдет функцию ниже
     * посмотрит какой тип она возвращает и убедится что да, действительно этот тип такой который нужен,
     * дальше посмотрит что нужны useCase  и пойдет на Domain модуль от туда потом в Data модуль,
     * создаст репозитории, создаст useCase и вернется сюда, в этот модуль
     *
     *
     */
    fun provideMainViewModelFactory(
        getUserNameUseCase: GetUserNameUseCase,
        saveUserNameUseCase: SaveUserNameUseCase
    ): MainViewModelFactory{
        return  MainViewModelFactory(
            getUserNameUseCase = getUserNameUseCase,
            saveUserNameUseCase = saveUserNameUseCase
        )
    }
}