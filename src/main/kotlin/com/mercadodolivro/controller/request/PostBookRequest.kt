package com.mercadodolivro.controller.request

import com.fasterxml.jackson.annotation.JsonAlias

data class PostBookRequest (
    var name: String,
    var price: Double,
    @JsonAlias("custome_id")
    var custome_id: Long
)