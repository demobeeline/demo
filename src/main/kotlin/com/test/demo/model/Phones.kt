package com.test.demo.model

data class Task(
    val id: Long? = null,
    val phone_name: String,
    val memory: String,
    val color: String,
    val description: String? = null,
)