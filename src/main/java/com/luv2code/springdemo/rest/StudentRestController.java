package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {
	
	private List<Student> listStudents; 
	
	@PostConstruct
	public void loadData() {

		listStudents = new ArrayList<>();
		listStudents.add(new Student("Poornima", "Patel0"));
		listStudents.add(new Student("Nima", "Atel1"));
		listStudents.add(new Student("Poor", "Telka2"));
		
	}

//	define end point for /students - return list students
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		return listStudents;
	}
	
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable int studentId) {
		
		return listStudents.get(studentId);
	}
	
	
	
	
	
}
