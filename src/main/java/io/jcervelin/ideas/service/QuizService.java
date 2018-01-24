package io.jcervelin.ideas.service;

import java.util.List;

import io.jcervelin.ideas.entities.QuizEntity;

public interface QuizService {

	public List<QuizEntity> list();
	
	public QuizEntity update(QuizEntity quiz) ;
	
	public QuizEntity save(QuizEntity quiz);
	
	public QuizEntity findById(String id);

	public QuizEntity findByName(String name);
	
	public void delete(String id);	

}
