package com.batchMaster.customer.repository

import com.batchMaster.customer.model.Customer
import org.springframework.data.jpa.repository.JpaRepository

interface CustomerRepository:JpaRepository<Customer, String> {
}