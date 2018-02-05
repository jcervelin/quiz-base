package io.jcervelin.ideas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.jcervelin.ideas.entities.Alternative;
import io.jcervelin.ideas.entities.Question;
import io.jcervelin.ideas.entities.Quiz;
import io.jcervelin.ideas.entities.QuizEntity;
import io.jcervelin.ideas.entities.State;
import io.jcervelin.ideas.entities.StateEnum;
import io.jcervelin.ideas.repository.QuizRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class QuizBaseApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(QuizBaseApplication.class, args);
	}

	@Autowired
	private QuizRepository repo;

	
	@Override
	public void run(String... args) throws Exception {
		
		/*QuizEntity q1 = new QuizEntity();
		q1 = new QuizEntity();
		q1.setName("Enquete sobre Atualidades");
		
		Question qu1 = new Question();
		qu1.setName("Qual capital do Brasil?");
		
		Alternative a1 = new Alternative();
		a1.setText("Brasilia");
		a1.setCorrect(false);

		Alternative a2 = new Alternative();
		a2.setText("Rio de Janeiro");
		a2.setCorrect(true);
		
		Alternative a3 = new Alternative();
		a3.setText("São Paulo");
		a3.setCorrect(false);
		
		qu1.setAlternatives(Arrays.asList(a1,a2,a3));
		
		Question qu3 = new Question();
		qu3.setName("Qual capital do Afeganistão?");
		
		Alternative a7 = new Alternative();
		a7.setText("Não sei");
		a7.setCorrect(true);

		Alternative a8 = new Alternative();
		a8.setText("Sei lá");
		a8.setCorrect(false);
		
		Alternative a9 = new Alternative();
		a9.setText("Não quero saber");
		a9.setCorrect(false);
		
		qu3.setAlternatives(Arrays.asList(a7,a8,a9));
		q1.setQuestions(Arrays.asList(qu1,qu3));
		
		List<State> states = new ArrayList<>();
		
		states.add(new State(StateEnum.SP));
		states.add(new State(StateEnum.RJ));
		states.add(new State(StateEnum.SC));
		q1.setStates(states);
		List<QuizEntity> returnetList = new ArrayList<>();
		
		returnetList.add(q1);

		QuizEntity q2 = new QuizEntity();
		q2 = new QuizEntity();
		q2.setName("Enquete sobre Atualidades");
		
		Question qu2 = new Question();
		qu2.setName("Qual capital do Brasil?");

		Alternative a4 = new Alternative();
		a4.setText("Brasilia");
		a4.setCorrect(true);

		Alternative a5 = new Alternative();
		a5.setText("Rio de Janeiro");
		a5.setCorrect(false);
		
		Alternative a6 = new Alternative();
		a6.setText("São Paulo");
		a6.setCorrect(false);
		
		qu2.setAlternatives(Arrays.asList(a4,a5,a6));
		

		Question qu4 = new Question();
		qu4.setName("Qual capital do Afeganistão?");
		
		Alternative a10 = new Alternative();
		a10.setText("Não sei");
		a10.setCorrect(true);

		Alternative a11 = new Alternative();
		a11.setText("Sei lá");
		a11.setCorrect(false);
		
		Alternative a12 = new Alternative();
		a12.setText("Não quero saber");
		a12.setCorrect(false);
		
		qu4.setAlternatives(Arrays.asList(a10,a11,a12));
		
		q2.setQuestions(Arrays.asList(qu2,qu4));
		
		
		List<State> states1 = new ArrayList<>();
		
		states1.add(new State(StateEnum.SP));
		states1.add(new State(StateEnum.RJ));
		states1.add(new State(StateEnum.SC));
		q2.setStates(states1);
		returnetList.add(q2);
		repo.save(returnetList);*/
	} 
}



/*[
 {
     "id": "5a66a07182902b4b7c7defc2",
     "name": "Enquete sobre Atualidades",
     "questions": [
         {
             "name": "Qual capital do Brasil?",
             "alternatives": [
                 {
                     "id": "345fsdgersf",
                     "text": "Brasilia",
                     "correct": false
                 },
                 {
                     "id": "345fsdffdgersf",
                     "text": "Rio de Janeiro",
                     "correct": false
                 },
                 {
                     "id": "35fsdffdgrsf",
                     "text": "São Paulo",
                     "correct": false
                 }
             ]
         },
         {
             "name": "Qual capital do Afeganistão?",
             "alternatives": [
                 {
                     "id": "36fsdffdgrsf",
                     "text": "Não sei",
                     "correct": false
                 },
                 {
                     "id": "37fsdffdgrsf",
                     "text": "Sei lá",
                     "correct": false
                 },
                 {
                     "id": "38fsdffdgrsf",
                     "text": "Não quero saber",
                     "correct": false
                 }
             ]
         }
     ],
     "states": [
         {
             "code": "SP",
             "ibgeCode": 35,
             "name": "São Paulo"
         },
         {
             "code": "RJ",
             "ibgeCode": 33,
             "name": "Rio de Janeiro"
         },
         {
             "code": "SC",
             "ibgeCode": 42,
             "name": "Santa Catarina"
         }
     ]
 },
 {
     "id": "5a766132e3595d70a09f9db7",
     "name": "Enquete sobre Atualidades",
     "questions": [
         {
             "name": "Qual capital do Brasil?",
             "alternatives": [
                 {
                     "id": "39fsdffdgrsf",
                     "text": "Brasilia",
                     "correct": false
                 },
                 {
                     "id": "21fsdffdgrsf",
                     "text": "Rio de Janeiro",
                     "correct": false
                 },
                 {
                     "id": "21fsdffdgrsf",
                     "text": "São Paulo",
                     "correct": false
                 }
             ]
         },
         {
             "name": "Qual capital do Afeganistão?",
             "alternatives": [
                 {
                     "text": "Não sei",
                     "correct": false
                 },
                 {
                     "text": "Sei lá",
                     "correct": false
                 },
                 {
                     "text": "Não quero saber",
                     "correct": false
                 }
             ]
         }
     ],
     "states": [
         {
             "code": "SP",
             "ibgeCode": 35,
             "name": "São Paulo"
         },
         {
             "code": "RJ",
             "ibgeCode": 33,
             "name": "Rio de Janeiro"
         },
         {
             "code": "SC",
             "ibgeCode": 42,
             "name": "Santa Catarina"
         }
     ]
 }
]*/
