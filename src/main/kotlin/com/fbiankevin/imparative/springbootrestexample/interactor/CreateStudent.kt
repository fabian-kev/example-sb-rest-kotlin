package com.fbiankevin.imparative.springbootrestexample.interactor

import com.fbiankevin.imparative.springbootrestexample.request.StudentForm
import com.fbiankevin.imparative.springbootrestexample.response.StudentResource

interface CreateStudent {
    fun execute(studentForm: StudentForm): StudentResource
}