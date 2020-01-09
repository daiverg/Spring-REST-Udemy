package com.luv2code.springdemo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springdemo.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

//	define end point for /students - return list students
	
	@GetMapping("/students")
	public List<Student> getStudents() {
		
		List<Student> listStudents = new ArrayList<>();
		listStudents.add(new Student("Poornima", "Patel"));
		listStudents.add(new Student("Nima", "Atel"));
		listStudents.add(new Student("Poor", "Telka"));
		
		return listStudents;
	}
}
