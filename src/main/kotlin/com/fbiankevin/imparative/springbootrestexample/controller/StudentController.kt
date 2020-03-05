package com.fbiankevin.imparative.springbootrestexample.controller

import com.fbiankevin.imparative.springbootrestexample.interactor.CreateStudent
import com.fbiankevin.imparative.springbootrestexample.interactor.DeleteStudent
import com.fbiankevin.imparative.springbootrestexample.interactor.GetStudents
import com.fbiankevin.imparative.springbootrestexample.interactor.UpdateStudent
import com.fbiankevin.imparative.springbootrestexample.request.StudentForm
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("/students")
class StudentController(
        private val createStudent: CreateStudent,
        private val getStudents: GetStudents,
        private val updateStudent: UpdateStudent,
        private val deleteStudent: DeleteStudent
) {

    @PostMapping
    fun createStudent(@RequestBody studentForm: StudentForm) = createStudent.execute(studentForm)

    @PutMapping
    fun updateStudent(@RequestBody studentForm: StudentForm) = updateStudent.execute(studentForm)

    @DeleteMapping("/{id}")
    fun deleteStudent(@PathVariable id:Long) = deleteStudent.execute(id)

    @GetMapping
    fun getStudents() = getStudents.execute()
}