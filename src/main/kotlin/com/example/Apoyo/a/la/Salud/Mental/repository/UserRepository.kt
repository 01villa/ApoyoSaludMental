package com.example.Apoyo.a.la.Salud.Mental.repository

import com.example.Apoyo.a.la.Salud.Mental.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long> {
    // Agrega aquí los métodos personalizados que necesites, como findByEmail(email: String)
}
