package io.jcervelin.ideas.service;

import java.util.ArrayList;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.jcervelin.ideas.entities.QuizEntity;
import io.jcervelin.ideas.exception.http.UnprocessableEntity;
import io.jcervelin.ideas.repository.QuizRepository;

@Service
public class QuizServiceImpl implements QuizService{

	private QuizRepository repo;

	@Autowired
	public QuizServiceImpl(QuizRepository repo) {
		this.repo = repo;
	}
	
	public List<QuizEntity> list() {
		List<QuizEntity> list = new ArrayList<>();
		repo.findAll().forEach(list::add);
		return list;
	}
	
	public QuizEntity update(QuizEntity quiz) {
		QuizEntity attached = repo.findById(quiz.get_id()).orElseThrow(() -> new UnprocessableEntity("Id not found"));
		attached.setName(quiz.getName());
		attached.setQuestions(quiz.getQuestions());
		attached.setStates(quiz.getStates());
		repo.save(attached);
		return attached;
	}
	
	public QuizEntity save(QuizEntity quiz) {
		return repo.save(quiz);
	}
	
	public QuizEntity findById(String id) {
		return repo.findById(new ObjectId(id)).orElseThrow(() -> new UnprocessableEntity("Quiz not found"));
	}

	public QuizEntity findByName(String name) {
		return repo.findByName(name).orElseThrow(() -> new UnprocessableEntity("Quiz not found"));
	}
	
	public void delete(String id) {
		repo.delete(findById(id));
	}	

}
