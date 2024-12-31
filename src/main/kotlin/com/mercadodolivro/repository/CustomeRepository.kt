package com.mercadodolivro.repository

import com.mercadodolivro.entity.CustomeEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomeRepository : JpaRepository<CustomeEntity, Long> {

    fun findByNameContaining(name: String): List<CustomeEntity>
}