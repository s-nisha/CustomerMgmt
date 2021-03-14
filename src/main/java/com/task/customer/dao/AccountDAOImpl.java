package com.task.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.task.customer.entities.Account;

@Repository
public class AccountDAOImpl implements IAccountDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	@Override
	public Account add(Account account) {
		entityManager.persist(account);
		return account;
	}

}
