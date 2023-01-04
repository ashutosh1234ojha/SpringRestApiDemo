package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.services.CourseServices;

@RestController
public class MyController {
	
	@Autowired
	private CourseServices courseServices;
	
	@GetMapping("/home")
	public String home() {
		return "From spring api welcome";
	}
	
	@GetMapping("/courses")
	public List<Courses> getCourses() {
		return courseServices.getCourses();
	}
	
	@GetMapping("/courses/{id}")
	public Courses getCourses(@PathVariable int id) {
		return courseServices.getCoursesById(id);
	}
	
	@PostMapping("/courses")
	public Courses getCourses(@RequestBody Courses c) {
		return courseServices.addCourse(c);
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<HttpStatus> deleteCourses(@PathVariable int id) {
		
		try {
			 courseServices.deleteCourse(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
