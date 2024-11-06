package com.tuempresa.saludmental.model

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank

@Entity
@Table(name = "therapists")
data class Therapist(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @field:NotBlank
    @Column(name = "name")
    val name: String,

    @field:NotBlank
    @Column(name = "specialty")
    val specialty: String
)
