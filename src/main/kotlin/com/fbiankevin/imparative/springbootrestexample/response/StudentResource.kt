package com.fbiankevin.imparative.springbootrestexample.response

import java.util.*

data class StudentResource(
        var id: Long? = null,
        val name: String?,
        val age: Int?,
        var createdDate: Date? = null
)