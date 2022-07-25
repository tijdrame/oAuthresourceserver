package com.emard.resourceserver.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.Loans;


public interface LoanRepository extends CrudRepository<Loans, Long> {
	
	List<Loans> findByEmailOrderByStartDtDesc(String email);

}
