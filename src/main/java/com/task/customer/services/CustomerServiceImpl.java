package com.task.customer.services;

import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.task.customer.dao.IAccountDAO;
import com.task.customer.dao.ICustomerDAO;
import com.task.customer.entities.Account;
import com.task.customer.entities.Customer;
import com.task.customer.exceptions.CustomerNotFoundException;
import com.task.customer.exceptions.InvalidAmountException;
import com.task.customer.exceptions.InvalidNameException;
import com.task.item.entites.Item;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDAO customerDAO;
	
	@Autowired
	IAccountDAO accountDAO;
	
	@PersistenceContext
	EntityManager entityManager;
	
	
	

	@Override
	public Customer findByID(long customerID) {
		validateCustomerId(customerID);
		return customerDAO.findByID(customerID);
	}

	@Override
	public Customer createCustomer(String name) {
		validateName(name);
		Account account = new Account(0);
		Customer customer = new Customer(name, account);
		accountDAO.add(account);
		customerDAO.add(customer);
		return customer;
	}

	@Transactional
	@Override
	public Customer addAmount(long customerId, double amount) {
		validateCustomerId(customerId);
		Customer customer = customerDAO.findByID(customerId);
		Account account = customer.getAccount();
		account.setBalance(account.getBalance() + amount);
		entityManager.persist(account);
		customerDAO.update(customer);
		return customer;
	}

	@Override
	public Set<Item> itemsBoughtByCustomer(long customerID) {
		validateCustomerId(customerID);
		Customer customer = customerDAO.findByID(customerID);
		return customer.getBoughtItems();
	}
	public void validateCustomerId(Long id) {
		if (id == null) {
			throw new CustomerNotFoundException("ID entered is invalid :  " + id);
		}
	}
	public void validateAmmount(double amount) {
		if (amount<0) {
			throw new InvalidAmountException("Ammount entered is invalid : "+amount);
		}
	}
	public void validateName(String name) {
		if(name == null || name.isEmpty() || name.trim().isEmpty()) {
			throw new InvalidNameException("Name entered is invalid : " + name);
		}
	}


	
	

}
