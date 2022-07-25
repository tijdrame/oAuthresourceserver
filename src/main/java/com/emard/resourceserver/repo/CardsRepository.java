package com.emard.resourceserver.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.Cards;


public interface CardsRepository extends CrudRepository<Cards, Long> {
	
	List<Cards> findByEmail(String email);

}
