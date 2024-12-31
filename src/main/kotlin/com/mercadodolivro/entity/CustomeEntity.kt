package com.mercadodolivro.entity

import jakarta.persistence.*


@Entity
@Table(name = "custome")
data class CustomeEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long,
    @Column
    var name: String,
    @Column
    var email: String
)