package com.emard.resourceserver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emard.resourceserver.model.Cards;
import com.emard.resourceserver.model.Customer;
import com.emard.resourceserver.repo.CardsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class CardsController {
	
	private CardsRepository cardsRepository;
	
	@PostMapping("/myCards")
	public List<Cards> getCardDetails(@RequestBody Customer customer) {
		List<Cards> cards = cardsRepository.findByEmail(customer.getEmail());
		if (cards != null ) {
			return cards;
		}else {
			return null;
		}
	}

}
