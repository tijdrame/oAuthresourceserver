package com.emard.resourceserver.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.AccountTransactions;

public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long>{
    List<AccountTransactions> findByEmailOrderByTransactionDtDesc(String email);
}
