package com.task.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.task.customer.entities.Customer;

@Repository
//@Component
public class CustomerDAOImpl implements ICustomerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return null;
	}

	@Override
	public Customer findByID(long customerID) {
		return entityManager.find(Customer.class, customerID);
	}

	@Override
	public Customer update(Customer customer) {
		
		return null;
	}

}
