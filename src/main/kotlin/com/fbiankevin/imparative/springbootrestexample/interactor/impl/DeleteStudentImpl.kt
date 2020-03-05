package com.fbiankevin.imparative.springbootrestexample.interactor.impl

import com.fbiankevin.imparative.springbootrestexample.persistence.repository.StudentRepository
import com.fbiankevin.imparative.springbootrestexample.interactor.DeleteStudent
import org.springframework.stereotype.Service

@Service
class DeleteStudentImpl(
        private val studentRepository: StudentRepository
) : DeleteStudent {
    override fun execute(id: Long) {
       if( id != null ){
           studentRepository.deleteById(id)
       }
    }
}