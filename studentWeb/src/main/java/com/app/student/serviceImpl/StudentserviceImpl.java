package com.app.student.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.student.entity.Student;
import com.app.student.repository.StudentRepository;

@org.springframework.stereotype.Service
public class StudentserviceImpl implements Service  {

	@Autowired
	private StudentRepository repository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return repository.save(student);
	}

	@Override
	public void deleteStudent(Student student) {
		
		repository.delete(student);
		
	}

	@Override
	public Student getStudentById(int id) {
		
		return repository.getOne(id);
	}

	@Override
	public List<Student> getAllStudent() {
		
		return repository.findAll();
	}

}
