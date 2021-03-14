package com.task.customer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.customer.dao.AccountDAOImpl;
import com.task.customer.dao.CustomerDAOImpl;
import com.task.customer.entities.Account;
import com.task.customer.entities.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	CustomerDAOImpl customerDAO;
	
	@Autowired
	AccountDAOImpl accountDAO;

	@Override
	public Customer findByID(long customerID) {
		return customerDAO.findByID(customerID);
	}

	@Override
	public Customer createCustomer(String name) {
		Account account = new Account(0);
		Customer customer = new Customer(name, account);
		accountDAO.add(account);
		customerDAO.add(customer);
		return customer;
	}

	@Override
	public Customer addAmount(Long customerId, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

}
