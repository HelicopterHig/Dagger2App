package com.example.domain.usecase

import com.example.domain.models.UserName


class GetUserNameUseCase(userRepository: Any) {

    fun execute(): UserName {
        return UserName(firstName = "Ivan", lastName = "Ivanov")
    }




}