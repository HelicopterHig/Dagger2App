package com.example.Dagger2App.presentation

import com.example.domain.usecase.GetUserNameUseCase
import com.example.domain.usecase.SaveUserNameUseCase

class MainViewModel(
    getUserNameUseCase: GetUserNameUseCase,
    saveUsernameUserCase: SaveUserNameUseCase
) {
}