package com.tuempresa.saludmental.model

import com.example.Apoyo.a.la.Salud.Mental.entity.User
import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "appointments")
data class Appointment(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    val user: User,

    @ManyToOne
    @JoinColumn(name = "therapist_id", nullable = false)
    val therapist: Therapist,

    @Column(name = "appointment_time", nullable = false)
    val appointmentTime: LocalDateTime
)
