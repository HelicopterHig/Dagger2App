package com.example.data.storage

import com.example.domain.models.SaveUserNameParam
import com.example.domain.models.UserName

interface UserStorage {



    fun save(saveParam: SaveUserNameParam): Boolean

    fun get(): UserName
}