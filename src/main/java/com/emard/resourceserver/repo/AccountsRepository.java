package com.emard.resourceserver.repo;


import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.Accounts;


public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	
	Accounts findByEmail(String email);

}
