package com.task.item.dto;

public class BuyItemRequest {
	private String itemId;
	private long customerId;
	
	public BuyItemRequest() {
		
	}
	
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	
	

}
