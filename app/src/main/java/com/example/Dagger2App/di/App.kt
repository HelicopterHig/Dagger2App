package com.example.Dagger2App.di

import  android.app.Application
import  com.example.Dagger2App.di.component.AppCompnent
import  com.example.Dagger2App.di.Da

class App: Application() {

    lateinit var  appComponent: AppCompnent

    override fun onCreate() {
        super.onCreate()

            appComponent = Dagg
    }
}