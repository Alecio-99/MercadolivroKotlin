package com.mercadodolivro.controller

import com.mercadodolivro.controller.request.PostBookRequest
import com.mercadodolivro.extension.toBookEntity
import com.mercadodolivro.service.ServiceCustome
import com.mercadodolivro.service.ServiceBook
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    val serviceBook: ServiceBook,
    val serviceCustome: ServiceCustome
) {

    @PostMapping
    fun create(@RequestBody request: PostBookRequest) {
        val custome = serviceCustome.getCustome(request.custome_id)
        serviceBook.create(request.toBookEntity(custome))
    }
}