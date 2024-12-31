package com.mercadodolivro.entity

import jakarta.persistence.*


@Entity
@Table(name = "custome")
data class CustomeEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column
    var name: String,
    @Column
    var email: String
){
    // Construtor padrão necessário para o Hibernate
    constructor() : this(null, null.toString(), null.toString())
}