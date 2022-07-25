package com.emard.resourceserver.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emard.resourceserver.model.Customer;
import com.emard.resourceserver.model.Loans;
import com.emard.resourceserver.repo.LoanRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class LoansController {
	
	private final LoanRepository loanRepository;
	
	@PostMapping("/myLoans")
	public List<Loans> getLoanDetails(@RequestBody Customer customer) {
		List<Loans> loans = loanRepository.findByEmailOrderByStartDtDesc(customer.getEmail());
		if (loans != null ) {
			return loans;
		}else {
			return null;
		}
	}

}
