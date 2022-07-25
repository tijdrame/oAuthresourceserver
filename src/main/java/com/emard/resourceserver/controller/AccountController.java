package com.emard.resourceserver.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emard.resourceserver.model.Accounts;
import com.emard.resourceserver.model.Customer;
import com.emard.resourceserver.repo.AccountsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class AccountController {
	
	private final AccountsRepository accountsRepository;
	
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		Accounts accounts = accountsRepository.findByEmail(customer.getEmail());
		if (accounts != null ) {
			return accounts;
		}else {
			return null;
		}
	}

}
