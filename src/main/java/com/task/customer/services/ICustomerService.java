package com.task.customer.services;

import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

import com.task.customer.entities.Customer;

public interface ICustomerService {

	Customer findByID(long customerID);
    Customer createCustomer(String name);
    //create customer and their account also here
    Set<Item> itemsBoughtByCustomer(long customerID);
    Customer addAmount(long customerId, double amount);
	
}
