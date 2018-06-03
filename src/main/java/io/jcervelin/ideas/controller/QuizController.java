package io.jcervelin.ideas.controller;

import io.jcervelin.ideas.entities.Quiz;
import io.jcervelin.ideas.service.QuizServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

import static io.jcervelin.ideas.entities.Converter.entityToQuiz;
import static io.jcervelin.ideas.entities.Converter.quizToEntity;

@RestController
@RequestMapping("/admin")
@CrossOrigin
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