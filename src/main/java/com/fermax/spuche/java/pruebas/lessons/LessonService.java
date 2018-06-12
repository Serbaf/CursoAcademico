package com.fermax.spuche.java.pruebas.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService
{
	@Autowired
	private LessonRepository lessonRepository;
	
	/*
	 * CRUD OPERATIONS
	 */

	//CREATE
	public void addLesson(Lesson lesson)
	{
		lessonRepository.save(lesson);
	}
	
	//READ (ALL)
	public List<Lesson> getAllLessons(String courseId)
	{
		List<Lesson> lessons = new ArrayList<>();

		lessons = lessonRepository.findByCourseId(courseId);
		
		return lessons;
	}
	
	//READ (ONE)
	public Lesson getLesson(String id)
	{
		Optional<Lesson> optionalLesson = lessonRepository.findById(id);
		
		if(optionalLesson.isPresent())
		{
			Lesson t = optionalLesson.get();
			return t;
		}
		else
		{
			System.out.println("No coincidences found with that ID");
			return null;
		}
		
	}
	

	//UPDATE
	public void updateLesson(Lesson lesson)
	{
		lessonRepository.save(lesson);
	}
	
	//DELETE
	public void deleteLesson(String id)
	{
		lessonRepository.deleteById(id);
	}

}
