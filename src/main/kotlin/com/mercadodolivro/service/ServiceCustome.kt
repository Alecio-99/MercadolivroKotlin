package com.mercadodolivro.service

import com.mercadodolivro.entity.CustomeEntity
import com.mercadodolivro.repository.CustomeRepository
import org.springframework.stereotype.Service

@Service
class ServiceCustome(
    val customeRepository: CustomeRepository
) {

    fun create(custome: CustomeEntity){
        customeRepository.save(custome)
    }
    fun getCustome(id: Long): CustomeEntity {
        val optionalCustomer = customeRepository.findById(id)
        return optionalCustomer.orElseThrow {
            NoSuchElementException("Customer with ID $id not found")
        }
    }

    fun update(custome: CustomeEntity){
        if(!customeRepository.existsById(custome.id!!)){
            throw Exception("Customer with ID not found")
        }
        customeRepository.save(custome)
    }
    fun delete(id: Long){
        if(!customeRepository.existsById(id)){
            throw Exception("Customer with ID not found")
        }
        customeRepository.deleteById(id)
    }
    fun getAll(name: String): List<CustomeEntity> {
        name?.let {
            return customeRepository.findByNameContaining(name)
        }
        return customeRepository.findAll().toList()
    }
}
