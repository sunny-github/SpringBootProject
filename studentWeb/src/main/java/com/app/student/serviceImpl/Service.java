package com.app.student.serviceImpl;

import java.util.List;

import com.app.student.entity.Student;

public interface Service {

	Student saveStudent(Student student);
	Student updateStudent(Student student);
	void deleteStudent(Student student);
	Student getStudentById(int id);
	List<Student> getAllStudent();
}
