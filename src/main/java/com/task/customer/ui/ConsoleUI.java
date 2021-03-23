package com.task.customer.ui;


import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.task.customer.entities.Customer;
import com.task.customer.exceptions.CustomerNotFoundException;
import com.task.customer.exceptions.InvalidAmountException;
import com.task.customer.exceptions.InvalidNameException;
import com.task.customer.services.CustomerServiceImpl;
import com.task.item.entites.Item;
import com.task.item.service.ItemServiceImpl;


@Component
public class ConsoleUI {

	@Autowired
	CustomerServiceImpl customerService;
	@Autowired
	ItemServiceImpl itemService;
	
	public void start() throws InvalidAmountException {
		try {
		Customer customer1 = customerService.createCustomer("Nisha");
		Customer customer2 = customerService.createCustomer("Raja");
		Customer customer3 = customerService.createCustomer("Nivi");
		customerService.addAmount(customer1.getId(), 4000);
		customerService.addAmount(customer2.getId(), 5000);
		customerService.addAmount(customer3.getId(), 6000);
		
		Item it1 = itemService.create(100, "pen");
		Item it2 = itemService.create(20, "paper");
		itemService.buyItem(it1.getItemId(), customer1.getId());
		itemService.buyItem(it2.getItemId(), customer2.getId());
		
		Customer customer7 = customerService.findByID(customer3.getId());
		display(customer7);
		
		Item it3 = itemService.findByID(it1.getItemId());
		display(it3);
		}
		catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		} catch (InvalidNameException e) {
			System.out.println(e.getMessage());
		} catch (CustomerNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Something went wrong");
			e.printStackTrace();
		}
			
		}
	public void display(Customer customer) {
		System.out.println("Customer Id:" + customer.getId() + "\nName:" + customer.getName() + "\nAccountBalance:"
				+ customer.getAccount().getBalance());
		Set<Item> it = customer.getBoughtItems();
		for (Item item : it) {
			display(item);
	}
		
	
		 }
	private void display(Item item) {
		System.out.println("ID:" + item.getItemId() + "\nDescription:" + item.getItemDescription() + "\nPrice:"
				+ item.getItemPrice() + "\nAddedDate" + item.getItemAddedDate());
	}
		
	
		
		
	}
		 
	

