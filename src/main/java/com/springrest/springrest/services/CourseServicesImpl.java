package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Courses;

@Service
public class CourseServicesImpl implements CourseServices {

	List<Courses> list;
	
	@Override
	public List<Courses> getCourses() {
		if(list==null)
		{
			list= new ArrayList<>();
			list.add(new Courses(123,"Java"));
			list.add(new Courses(344,"Python"));
			list.add(new Courses(901,"Rust"));
		}
		
		return list;
		
	}

	@Override
	public Courses getCoursesById(int id) {
		Courses c=null;
		
		if(list==null) return c;
		for(int  i=0;i<list.size();i++) {
			if(list.get(i).get_id()==id) {
				c= list.get(i);
			}
		}
		
				
		return c;
	}

	@Override
	public Courses addCourse(Courses c) {
		if(list==null)
		{
			list= new ArrayList<>();
		list.add(c);
		}else {
			list.add(c);
		}
		return c;
		
	}

	@Override
	public Courses deleteCourse(int id) {
Courses c=null;
		
		if(list==null) return c;
		for(int  i=0;i<list.size();i++) {
			if(list.get(i).get_id()==id) {
				c= list.get(i);
				list.remove(i);
				break;
			}
		}
		
				
		return c;
	}
	
		

}
