package com.springrest.springrest.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.springrest.springrest.entities.Courses;


public interface CourseServices {
	
	public	List<Courses>  getCourses();
	public	Courses  getCoursesById(int id);
	public	Courses  addCourse(Courses id);
	public	Courses  deleteCourse(int id);

}
