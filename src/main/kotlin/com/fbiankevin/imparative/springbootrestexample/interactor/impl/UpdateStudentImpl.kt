package com.fbiankevin.imparative.springbootrestexample.interactor.impl

import com.fbiankevin.imparative.springbootrestexample.interactor.UpdateStudent
import com.fbiankevin.imparative.springbootrestexample.persistence.repository.StudentRepository
import com.fbiankevin.imparative.springbootrestexample.request.StudentForm
import com.fbiankevin.imparative.springbootrestexample.response.StudentResource
import org.springframework.stereotype.Service

@Service
class UpdateStudentImpl(
        private val studentRepository: StudentRepository
) : UpdateStudent {
    override fun execute(studentForm: StudentForm): StudentResource {


        if( studentForm.id == null ){
            throw RuntimeException("Please specify the student ID to update")
        }

        var dbStudent = studentRepository.findById(studentForm.id)
                .orElseThrow { RuntimeException("Unable to find student: ${studentForm.id}") }

        dbStudent?.name = studentForm.name
        dbStudent?.age = studentForm.age


        dbStudent = studentRepository.save(dbStudent)

        return StudentResource(
                dbStudent.id,
                dbStudent.name,
                dbStudent.age,
                dbStudent.createdDate
        )
    }
}
