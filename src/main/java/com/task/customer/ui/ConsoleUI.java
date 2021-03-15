package com.task.customer.ui;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.customer.entities.Customer;

import com.task.customer.services.CustomerServiceImpl;
import com.task.item.entites.Item;
import com.task.item.service.ItemServiceImpl;


@Component
public class ConsoleUI {

	@Autowired
	CustomerServiceImpl customerService;
	@Autowired
	ItemServiceImpl itemService;
	
	public void start() {
		Customer customer1 = customerService.createCustomer("Nisha");
		Customer customer2 = customerService.createCustomer("Raja");
		Item it1 = itemService.create(10000, "pen");
		Item it2 = itemService.create(20000, "paper");
		
		
		Customer customer7 = customerService.findByID(2);
		Item it3 = itemService.findByID(5);
		
		
		System.out.println(customer7.getName());
		System.out.println("Name: "+ customer1.getName() );
		System.out.println("Name: "+ customer2.getName() );
		
		System.out.println(it3);
		System.out.println("Item ID: "+ it1.getItemId() + "\nItem Desc: "+it1.getItemDescription());
		System.out.println("Item Details " + it2);
		
		Item item = itemService.buyItem(5, 2);
		System.out.println("item id: "+item.getItemId() + "\nitem desc: "+item.getItemDescription() + "\nboughtBy:" + item.getBoughtBy().getName());
		
		
	}
	
}
