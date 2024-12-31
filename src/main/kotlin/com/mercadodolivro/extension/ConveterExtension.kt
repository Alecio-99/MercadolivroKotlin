package com.mercadodolivro.extension

import com.mercadodolivro.controller.request.PostBookRequest
import com.mercadodolivro.controller.request.PostCustomeRequest
import com.mercadodolivro.entity.BookEntity
import com.mercadodolivro.entity.CustomeEntity
import com.mercadodolivro.enums.BookEnum
import java.util.UUID

fun PostCustomeRequest.toCustomeEntity(): CustomeEntity {
    return CustomeEntity(
        name = this.name,
        email = this.email,
        id = null // Deixe `null` para que o banco de dados gere o ID automaticamente.
    )
}

fun PostBookRequest.toBookEntity(custome: CustomeEntity): BookEntity {
    return BookEntity(
        name = this.name,
        price = this.price,
        status = BookEnum.ATIVO, // Ajuste conforme o status desejado
        custome = custome
    )
}
