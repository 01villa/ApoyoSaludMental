package com.example.Apoyo.a.la.Salud.Mental.service

import com.example.Apoyo.a.la.Salud.Mental.dto.UserDto
import com.example.Apoyo.a.la.Salud.Mental.entity.User
import com.example.Apoyo.a.la.Salud.Mental.mapper.UserMapper
import com.example.Apoyo.a.la.Salud.Mental.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UserService {

    @Autowired
    private lateinit var userRepository: UserRepository

    fun createUsers(user: User): User {
        return userRepository.save(user)
    }

    fun getAllUsers(): List<User> {
        return userRepository.findAll()
    }

    fun getUserById(id: Long): User? {
        return userRepository.findById(id).orElse(null)
    }

    fun updateUser(user: User): User { // Corregido aquí
        return userRepository.save(user)
    }

    fun deleteUser(id: Long) {
        userRepository.deleteById(id)
    }

    fun save(userDto: UserDto): User {
        val user = UserMapper.toEntity(userDto)
        return userRepository.save(user)
    }
}

