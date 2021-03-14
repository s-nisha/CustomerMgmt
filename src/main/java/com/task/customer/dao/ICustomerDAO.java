package com.task.customer.dao;

import com.task.customer.entities.Customer;

public interface ICustomerDAO {

	public Customer add(Customer customer);
    public Customer findByID(long customerID);
    public Customer update(Customer customer);
   
	
}


