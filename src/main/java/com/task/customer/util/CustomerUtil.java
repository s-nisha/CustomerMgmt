package com.task.customer.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.task.customer.dto.CustomerDetails;
import com.task.customer.dto.ItemsBought;
import com.task.customer.entities.Account;
import com.task.customer.entities.Customer;
import com.task.item.entites.Item;

@Component
public class CustomerUtil {
	public CustomerDetails toDetails(Customer customer) {
		CustomerDetails cusDetails = new CustomerDetails();
		cusDetails.setId(customer.getId());
		cusDetails.setName(customer.getName());
		Account account = customer.getAccount();
		
		cusDetails.setAccountId(account.getAccountID());
		cusDetails.setBalance(account.getBalance());
		
		return cusDetails;	
	}
	
	public List<ItemsBought> getItemList(Set<Item>itemSet){
		List<ItemsBought> itemList = new ArrayList<>();
		for(Item item : itemSet) {
			ItemsBought itemBought = new ItemsBought();
			itemBought.setId(item.getItemId());
			itemBought.setPrice(item.getItemPrice());
			itemList.add(itemBought);
		}
		return itemList;
	}

}
