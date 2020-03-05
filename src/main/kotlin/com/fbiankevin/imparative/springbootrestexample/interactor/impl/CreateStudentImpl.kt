package com.fbiankevin.imparative.springbootrestexample.interactor.impl

import com.fbiankevin.imparative.springbootrestexample.interactor.CreateStudent
import com.fbiankevin.imparative.springbootrestexample.persistence.entity.StudentEntity
import com.fbiankevin.imparative.springbootrestexample.persistence.repository.StudentRepository
import com.fbiankevin.imparative.springbootrestexample.request.StudentForm
import com.fbiankevin.imparative.springbootrestexample.response.StudentResource
import org.springframework.stereotype.Service
import java.util.*

@Service
class CreateStudentImpl(
        private val studentRepository: StudentRepository
) : CreateStudent {

    override fun execute(studentForm: StudentForm): StudentResource {
        ///for simplicity we mapped form direct to entity
        //but in the real application it should map from form -> business model -> entity then vice versa

        var entity = StudentEntity(
                name = studentForm.name,
                age = studentForm.age,
                createdDate = Date()
        )

        entity = studentRepository.save(entity)

        return StudentResource(
                id = entity.id,
                name = entity.name,
                age = entity.age,
                createdDate = entity.createdDate
        )

    }
}