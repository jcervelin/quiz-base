package io.jcervelin.ideas.repository;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.jcervelin.ideas.entities.QuizEntity;

@Repository
public interface QuizRepository extends CrudRepository<QuizEntity, ObjectId> {
	
	Optional<QuizEntity> findByName(String name);
	Optional<QuizEntity> findBy_id(ObjectId id);
	

}
