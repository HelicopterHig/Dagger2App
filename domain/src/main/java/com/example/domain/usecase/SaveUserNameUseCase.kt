package com.example.domain.usecase

import com.example.domain.models.SaveUserNameParam

class SaveUserNameUseCase(userRepository: Any) {

    fun execute(param: SaveUserNameParam): Boolean{
       val oldUserName = userRepository.getName()

        if(oldUserName.firstName ==  param.name){
            return true
        }

        val result: Boolean= userRepository.saveName(saveParam = param)
        return  result
    }
}