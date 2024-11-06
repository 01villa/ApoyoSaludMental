package com.example.Apoyo.a.la.Salud.Mental.controller

import com.example.Apoyo.a.la.Salud.Mental.dto.UserDto
import com.example.Apoyo.a.la.Salud.Mental.entity.User
import com.example.Apoyo.a.la.Salud.Mental.service.UserService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController {

    @Autowired
    private lateinit var userService: UserService

    @GetMapping
    fun  getUsers() = userService.getAllUsers()

    @PostMapping
    fun save (@RequestBody @Valid userDto: UserDto): User {
        return save(userDto)
    }

}
