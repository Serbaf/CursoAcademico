package com.fermax.spuche.java.pruebas.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//@Repository
@Repository("topicRepository")
public interface TopicRepository extends CrudRepository<Topic,String>
{
	
	
}
