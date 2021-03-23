package com.task.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.customer.dto.AddAmount;
import com.task.customer.dto.CustomerDetails;
import com.task.customer.dto.ItemsBought;
import com.task.customer.entities.Customer;
import com.task.customer.services.ICustomerService;
import com.task.customer.util.CustomerUtil;

@RequestMapping("/customers")
@RestController
public class CustomerRestController {
	
	@Autowired 
	ICustomerService service;
	@Autowired
	CustomerUtil util;
	
	@GetMapping("/customer/byId/(id)")
	public CustomerDetails fetchCustomer(@PathVariable ("id") int customerId) {
		Customer customer = service.findByID(customerId);
		CustomerDetails cusDetails = util.toDetails(customer);
		return cusDetails;
	}
	@PutMapping("/addamount")
	public CustomerDetails addAmount(@RequestBody AddAmount requestData) {
	
		Customer customer = service.addAmount(requestData.getId(),requestData.getAmount());
		CustomerDetails details = util.toDetails(customer);
		return details;
	}
	@GetMapping(value = "/getitemsbought/{id}")
	public List<ItemsBought> getitemsBought(@PathVariable("id") Long customerId){
		
		Customer customer = service.findByID(customerId);
		List<ItemsBought> itemList = util.getItemList(customer.getBoughtItems());
		return itemList;
	}
	

}
