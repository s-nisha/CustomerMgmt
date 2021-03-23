package com.task.customer.services;

import java.util.Set;



import com.task.customer.entities.Customer;
import com.task.item.entites.Item;

public interface ICustomerService {

	Customer findByID(long customerID);
    Customer createCustomer(String name);
    //create customer and their account also here
    Set<Item> itemsBoughtByCustomer(long customerID);
    Customer addAmount(long customerId, double amount);
	
}
