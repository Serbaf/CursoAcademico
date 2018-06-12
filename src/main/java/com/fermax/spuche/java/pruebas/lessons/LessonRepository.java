package com.fermax.spuche.java.pruebas.lessons;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface LessonRepository extends CrudRepository<Lesson,String>
{
	
	//Al crear un método llamado findBy____, Spring lo implementa automáticamente y devuelve una lista filtrada por esa clave!
	public List<Lesson> findByName(String name);
	//Si la clave de la búsqueda es otro objeto, habrá que incluir la clave primaria de aquel objeto
	public List<Lesson> findByCourseId(String courseId);
}
