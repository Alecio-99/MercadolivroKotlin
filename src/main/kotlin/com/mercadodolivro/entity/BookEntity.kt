package com.mercadodolivro.entity

import com.mercadodolivro.enums.BookEnum
import jakarta.persistence.*


@Entity
@Table(name = "book")
data class BookEntity(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column
    var name: String,
    @Column
    @Enumerated(EnumType.STRING)
    var status: BookEnum,
    @Column
    var price: Double,
    @ManyToOne
    @JoinColumn(name = "custome_id")
    var custome: CustomeEntity? = null

)