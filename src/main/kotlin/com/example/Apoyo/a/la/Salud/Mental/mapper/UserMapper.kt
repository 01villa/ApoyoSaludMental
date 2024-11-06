package com.example.Apoyo.a.la.Salud.Mental.mapper

import com.example.Apoyo.a.la.Salud.Mental.dto.UserDto
import com.example.Apoyo.a.la.Salud.Mental.entity.User

object UserMapper {
    fun toEntity(userDto: UserDto): User {
        val user = User()
        user.id = user.id
        user.name = userDto.name
        user.email = userDto.email
        return user
    }

}