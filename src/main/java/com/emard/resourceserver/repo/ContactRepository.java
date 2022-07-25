package com.emard.resourceserver.repo;


import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.Contact;


public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
