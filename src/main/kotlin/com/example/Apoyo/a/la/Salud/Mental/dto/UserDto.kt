package com.example.Apoyo.a.la.Salud.Mental.dto

import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

data class UserDto(
    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    val id: Long?,
    @NotNull(message = "Email is required")
    @NotBlank(message = "Email is required")
    val name: String,
    @NotNull(message = "Password is required")
    @NotBlank(message = "Password is required")
    val email: String
)
