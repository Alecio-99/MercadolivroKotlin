package com.mercadodolivro.service

import com.mercadodolivro.entity.BookEntity
import com.mercadodolivro.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class ServiceBook(
    val bookRepository: BookRepository
) {

    fun create(book: BookEntity) {
        bookRepository.save(book)
    }
}