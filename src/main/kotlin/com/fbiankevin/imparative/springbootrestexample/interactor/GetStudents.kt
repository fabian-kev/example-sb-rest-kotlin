package com.fbiankevin.imparative.springbootrestexample.interactor

import com.fbiankevin.imparative.springbootrestexample.response.StudentResource

interface GetStudents {
    fun execute():List<StudentResource>
}