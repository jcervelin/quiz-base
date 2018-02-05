package io.jcervelin.ideas.controller;

import static io.jcervelin.ideas.entities.Converter.entityToQuiz;
import static io.jcervelin.ideas.entities.Converter.quizToEntity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jcervelin.ideas.entities.Quiz;
import io.jcervelin.ideas.service.QuizServiceImpl;

@RestController
@RequestMapping("/admin")
@CrossOrigin(origins = "http://localhost:3000"/*, maxAge = 3600*/)
public class QuizController {
	
	private QuizServiceImpl service;

	@Autowired
	public QuizController(QuizServiceImpl service) {
		this.service = service;
	}
	
	@GetMapping
	public List<Quiz> list () {
		List<Quiz> listaQuiz = new ArrayList<>();
		 service.list().forEach(q -> listaQuiz.add(entityToQuiz(q)));
		 return listaQuiz;
	}
	
	@RequestMapping(params = "id")
	public Quiz findById (@RequestParam("id") String id) {
		return entityToQuiz(service.findById(id));
	}
	
	@RequestMapping(params = "name")
	public Quiz findByName (@RequestParam("name") String name) {
		return entityToQuiz(service.findByName(name));
	}
	
	@PutMapping
	public Quiz update (@RequestBody Quiz quiz) {
		return entityToQuiz(service.update(quizToEntity(quiz)));
	}
	
	@PostMapping
	public Quiz save (@RequestBody Quiz quiz) {
		return entityToQuiz(service.save(quizToEntity(quiz)));
	}
	
	@DeleteMapping("/{id}")
	public void delete (@PathVariable("id") String id) {
		service.delete(id);
	}		

}