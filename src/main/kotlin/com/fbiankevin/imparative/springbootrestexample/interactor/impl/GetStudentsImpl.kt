package com.fbiankevin.imparative.springbootrestexample.interactor.impl

import com.fbiankevin.imparative.springbootrestexample.interactor.GetStudents
import com.fbiankevin.imparative.springbootrestexample.persistence.repository.StudentRepository
import com.fbiankevin.imparative.springbootrestexample.response.StudentResource

import org.springframework.stereotype.Service

@Service
class GetStudentsImpl(
        private val studentRepository: StudentRepository
) : GetStudents {
    override fun execute(): List<StudentResource> {
        println("test")
        return studentRepository.findAll()
                .map { StudentResource(
                        it.id,
                        it.name,
                        it.age,
                        it.createdDate
                ) }
    }
}