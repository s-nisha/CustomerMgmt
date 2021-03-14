package com.task.customer.services;

import com.task.customer.entities.Customer;

public interface ICustomerService {

	Customer findByID(long customerID);
    Customer createCustomer(String name);
    //create customer and their account also here
    //    Set<Item> itemsBoughtByCustomer(Long customerID);
    Customer addAmount(Long customerId, double amount);
	
}
