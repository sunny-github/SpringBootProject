package com.app.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.student.entity.Student;
import com.app.student.serviceImpl.Service;

@Controller
public class StudentController {

	@Autowired
	private Service service;
	
	@RequestMapping("/showCreate")
	public String showCreate() {
		
		return "CreateStudent";
	}
	@RequestMapping("/saveStu")
	public String saveStudent(@ModelAttribute Student student,ModelMap modelMap) {
		
		Student student2=service.saveStudent(student);
		String msg="Student saved with id"+ student2.getId();
		modelMap.addAttribute("msg",msg);
		return "CreateStudent";
		
	}
	
	@RequestMapping("/displayStudent")
	public String dipslayStu(ModelMap modelMap) {
		
		List<Student> students=service.getAllStudent();
		modelMap.addAttribute("students",students);
		
		return "displayStudent";
	}
	
	@RequestMapping("/deleteStudent")
	public String deleteStu(@RequestParam("id") int id,ModelMap modelMap) {
		
		Student student= new Student();
		student.setId(id);
		service.deleteStudent(student);
		List<Student> students=service.getAllStudent();
		modelMap.addAttribute("students",students);
		
		return "displayStudent";
	}
	
	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap)
	{
		Student student=service.getStudentById(id);
		modelMap.addAttribute("student",student);
		
		return "editStudent";
	}
	
	@RequestMapping("/updateStudent")
	public String updateStudent(@ModelAttribute Student student,ModelMap modelMap) {
		
		service.updateStudent(student);
		List<Student>students=service.getAllStudent();
		modelMap.addAttribute("students",students);
		
		return "displayStudent";
		
	}
	
	
	
}
