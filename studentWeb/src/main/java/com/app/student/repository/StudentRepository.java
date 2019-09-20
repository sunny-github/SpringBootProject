package com.app.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.student.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
