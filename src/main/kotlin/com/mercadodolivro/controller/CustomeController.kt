package com.mercadodolivro.controller

import com.mercadodolivro.controller.request.PostCustomeRequest
import com.mercadodolivro.entity.CustomeEntity
import com.mercadodolivro.extension.toCustomeEntity
import com.mercadodolivro.service.ServiceCustome
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customeres")
class CustomeController(
    val serviceCustome: ServiceCustome
) {

    @GetMapping
    fun getAll(@RequestParam name: String): List<CustomeEntity>{
        return serviceCustome.getAll(name)
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody request: PostCustomeRequest){
        serviceCustome.create(request.toCustomeEntity())
    }

}