package com.example.Apoyo.a.la.Salud.Mental.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import jakarta.validation.constraints.Email
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "users")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    var id: Long? = null,

    @field:NotBlank
    @Column(name = "name")
    var name: String? = null,

    @field:Email
    @field:NotBlank
    @Column(name = "email", unique = true)
    var email: String? = null
)
