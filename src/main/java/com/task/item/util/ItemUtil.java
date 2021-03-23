package com.task.item.util;

import org.springframework.stereotype.Component;

import com.task.item.dto.ItemDetails;
import com.task.item.entites.Item;

@Component
public class ItemUtil {
	public ItemDetails todetail(Item item) {
		ItemDetails details = new ItemDetails();
		details.setId(item.getItemId());
		details.setPrice(item.getItemPrice());
		details.setDescription(item.getItemDescription());
		details.setCustomerId(item.getBoughtBy().getId());
		details.setCustomerName(item.getBoughtBy().getName());
	
		return details; 
	}
	

}
