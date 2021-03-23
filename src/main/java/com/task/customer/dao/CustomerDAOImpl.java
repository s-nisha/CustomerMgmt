package com.task.customer.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.task.customer.entities.Customer;
import com.task.customer.exceptions.CustomerNotFoundException;

@Repository
//@Component
public class CustomerDAOImpl implements ICustomerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public Customer add(Customer customer) {
		entityManager.persist(customer);
		return customer;
	}

	@Override
	public Customer findByID(long customerID) {
		Customer customer =  entityManager.find(Customer.class, customerID);
		 if(customer == null) {
			 throw new CustomerNotFoundException("Customer doesn't exist for id " + customerID);
		 }
		
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		customer = entityManager.merge(customer);
		return customer;
	}

}
