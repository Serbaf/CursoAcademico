package com.fermax.spuche.java.pruebas.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService
{
	@Autowired
	private TopicRepository topicRepository;
	
	/*
	 * CRUD OPERATIONS
	 */

	//CREATE
	public void addTopic(Topic topic)
	{
		topicRepository.save(topic);
	}
	
	//READ (ALL)
	public List<Topic> getAllTopics()
	{
		List<Topic> topics = new ArrayList<>();
		for(Topic t:topicRepository.findAll())
		{
			topics.add(t);
		}
		
		return topics;
	}
	
	//READ (ONE)
	public Topic getTopic(String id)
	{
		Optional<Topic> optionalTopic = topicRepository.findById(id);
		
		if(optionalTopic.isPresent())
		{
			Topic t = optionalTopic.get();
			return t;
		}
		else
		{
			System.out.println("No coincidences found with that ID");
			return null;
		}
		
	}
	

	//UPDATE
	public void updateTopic(String id, Topic topic)
	{
		topicRepository.save(topic);
	}
	
	//DELETE
	public void deleteTopic(String id)
	{
		topicRepository.deleteById(id);
	}

}
