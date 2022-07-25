package com.emard.resourceserver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emard.resourceserver.model.AccountTransactions;
import com.emard.resourceserver.model.Customer;
import com.emard.resourceserver.repo.AccountTransactionsRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BalanceController {

	private final AccountTransactionsRepository accountTransactionsRepository;
	
	@PostMapping("/myBalance")
	public List<AccountTransactions> getBalanceDetails(@RequestBody Customer customer) {
		List<AccountTransactions> accountTransactions = accountTransactionsRepository.
				findByEmailOrderByTransactionDtDesc(customer.getEmail());
		if (accountTransactions != null ) {
			return accountTransactions;
		}else {
			return null;
		}
	}
}
