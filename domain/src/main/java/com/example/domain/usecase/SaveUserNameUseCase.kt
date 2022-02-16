package com.example.domain.usecase

import com.example.domain.models.SaveUserNameParam

class SaveUserNameUseCase(userRepository: Any) {

    fun execute(param: SaveUserNameParam): Boolean{
        if(param.name.isEmpty()){
            return false
        }else {
            return true
        }
    }
}