package com.task.customer.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.customer.entities.Customer;
import com.task.customer.services.CustomerServiceImpl;

@Component
public class ConsoleUI {

	@Autowired
	CustomerServiceImpl customerService;
	
	public void start() {
		Customer customer1 = customerService.createCustomer("Nisha");
		Customer customer2 = customerService.createCustomer("Raja");
		Customer customer3 = customerService.createCustomer("Abhishek");
		Customer customer4 = customerService.createCustomer("Shipra");
		Customer customer5 = customerService.createCustomer("Tanisha");
		Customer customer6 = customerService.createCustomer("Arpit");
		Customer customer7 = customerService.findByID(2);
		
		System.out.println(customer7.getName());
		System.out.println("Name: "+ customer1.getName() );
		System.out.println("Name: "+ customer2.getName() );
		System.out.println("Name: "+ customer3.getName() );
		System.out.println("Name: "+ customer4.getName() );
		System.out.println("Name: "+ customer5.getName() );
		System.out.println("Name: "+ customer6.getName() );
	}
	
}
