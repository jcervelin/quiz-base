package io.jcervelin.ideas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.jcervelin.ideas.entities.Alternative;
import io.jcervelin.ideas.entities.Question;
import io.jcervelin.ideas.entities.QuizEntity;
import io.jcervelin.ideas.entities.State;
import io.jcervelin.ideas.entities.StateEnum;
import io.jcervelin.ideas.repository.QuizRepository;

@SpringBootApplication
public class QuizBaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuizBaseApplication.class, args);
	}

	@Autowired
	private QuizRepository repo;

	
	@Override
	public void run(String... args) throws Exception {
		
		/*QuizEntity q1 = new QuizEntity();
		
		q1.setName("Enquete sobre Atualidades");
		
		Question qu1 = new Question();
		qu1.setName("Qual capital do Brasil?");
		
		Alternative a1 = new Alternative();
		a1.setText("Brasilia");
		a1.setCorrect(true);

		Alternative a2 = new Alternative();
		a2.setText("Rio de Janeiro");
		a2.setCorrect(false);
		
		Alternative a3 = new Alternative();
		a3.setText("São Paulo");
		a3.setCorrect(false);
		
		qu1.setAlternatives(Arrays.asList(a1,a2,a3));
		
		q1.setQuestions(Arrays.asList(qu1));
		
		
		List<State> states = new ArrayList<>();
		
		states.add(new State(StateEnum.SP));
		states.add(new State(StateEnum.RJ));
		states.add(new State(StateEnum.SC));
		q1.setStates(states);*/
		
		//repo.save(q1);
	}
}
