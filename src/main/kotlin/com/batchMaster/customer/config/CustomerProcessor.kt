package com.batchMaster.customer.config

import com.batchMaster.customer.model.Customer
import org.springframework.batch.item.ItemProcessor

class CustomerProcessor:ItemProcessor<Customer,Customer> {
    override fun process(customer: Customer): Customer {
         return customer;
    }
}