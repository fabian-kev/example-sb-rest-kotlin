package com.fbiankevin.imparative.springbootrestexample.persistence.repository

import com.fbiankevin.imparative.springbootrestexample.persistence.entity.StudentEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface StudentRepository : JpaRepository<StudentEntity, Long>