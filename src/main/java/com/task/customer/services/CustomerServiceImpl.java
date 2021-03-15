package com.task.customer.services;

import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.customer.dao.IAccountDAO;
import com.task.customer.dao.ICustomerDAO;
import com.task.customer.entities.Account;
import com.task.customer.entities.Customer;

@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	ICustomerDAO customerDAO;
	
	@Autowired
	IAccountDAO accountDAO;
	
	
	

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
	public Customer addAmount(long customerId, double amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Item> itemsBoughtByCustomer(long customerID) {
		// TODO Auto-generated method stub
		return null;
	}


	
	

}
