package com.fermax.spuche.java.pruebas.course;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService
{
	@Autowired
	private CourseRepository courseRepository;
	
	/*
	 * CRUD OPERATIONS
	 */

	//CREATE
	public void addCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	//READ (ALL)
	public List<Course> getAllCourses(String topicId)
	{
		List<Course> courses = new ArrayList<>();

		courses = courseRepository.findByTopicId(topicId);
		
		return courses;
	}
	
	//READ (ONE)
	public Course getCourse(String id)
	{
		Optional<Course> optionalCourse = courseRepository.findById(id);
		
		if(optionalCourse.isPresent())
		{
			Course t = optionalCourse.get();
			return t;
		}
		else
		{
			System.out.println("No coincidences found with that ID");
			return null;
		}
		
	}
	

	//UPDATE
	public void updateCourse(Course course)
	{
		courseRepository.save(course);
	}
	
	//DELETE
	public void deleteCourse(String id)
	{
		courseRepository.deleteById(id);
	}

}
