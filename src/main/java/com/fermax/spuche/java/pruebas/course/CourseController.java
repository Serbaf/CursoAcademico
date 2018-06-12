package com.fermax.spuche.java.pruebas.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fermax.spuche.java.pruebas.topic.Topic;

@RestController
public class CourseController
{
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.GET)
	public List<Course> getAllCourses(@PathVariable String topicId)
	{
		
		return courseService.getAllCourses(topicId);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.GET)
	public Course getCourse(@PathVariable String courseId)
	{
		return courseService.getCourse(courseId);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses", method = RequestMethod.POST)
	public void postCourse(@RequestBody Course course, @PathVariable String topicId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.PUT)
	public void updateCourse(@RequestBody Course course, @PathVariable String topicId, @PathVariable String courseId)
	{
		course.setTopic(new Topic(topicId,"",""));
		courseService.updateCourse(course);
	}
	
	@RequestMapping(value = "/topics/{topicId}/courses/{courseId}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String courseId)
	{
		courseService.deleteCourse(courseId);
	}
	
}
