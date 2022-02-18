package com.example.Dagger2App.di.component

import com.example.Dagger2App.di.modules.AppModule
import com.example.Dagger2App.di.modules.DataModule
import com.example.Dagger2App.di.modules.DomainModule
import com.example.Dagger2App.presentation.MainActivity
import dagger.Component


@Component(modules = [AppModule::class, DomainModule::class, DataModule::class] )
interface AppCompnent {

    fun inject(mainActivity: MainActivity)

}