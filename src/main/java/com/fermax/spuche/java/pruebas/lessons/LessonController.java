package com.fermax.spuche.java.pruebas.lessons;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fermax.spuche.java.pruebas.course.Course;

@RestController
public class LessonController
{
	
	@Autowired
	private LessonService lessonService;
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}/lessons", method = RequestMethod.GET)
	public List<Lesson> getAllLessons(@PathVariable String courseId)
	{
		
		return lessonService.getAllLessons(courseId);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}", method = RequestMethod.GET)
	public Lesson getLesson(@PathVariable String lessonId)
	{
		return lessonService.getLesson(lessonId);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}/lessons", method = RequestMethod.POST)
	public void postLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId)
	{
		lesson.setCourse(new Course(courseId,"","",topicId));
		lessonService.addLesson(lesson);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}", method = RequestMethod.PUT)
	public void updateLesson(@RequestBody Lesson lesson, @PathVariable String topicId, @PathVariable String courseId)
	{
		lesson.setCourse(new Course(courseId,"","",topicId));
		lessonService.updateLesson(lesson);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}/lessons/{lessonId}", method = RequestMethod.DELETE)
	public void deleteLesson(@PathVariable String lessonId)
	{
		lessonService.deleteLesson(lessonId);
	}
	
}
