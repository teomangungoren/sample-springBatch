package com.batchMaster.customer.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id

@Entity
data class Customer(

    @Id
    @Column(name = "CUSTOMER_ID")
    val id:String="",
    @Column(name = "FIRST_NAME")
    val name:String,
    @Column(name = "LAST_NAME")
    val surname:String,
    @Column(name = "EMAIL")
    var email:String,
    @Column(name="GENDER")
    val gender:String,
    @Column(name="CONTACT")
    var phone:String,
    @Column(name="COUNTRY")
    var country:String,
    @Column(name="DOB")
    val dob:String

) {
}