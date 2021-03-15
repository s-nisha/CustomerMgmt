package com.task.customer.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

@Entity
public class Items {
	@GeneratedValue
	@Id
	int ItemId;
	
    double ItemPrice;
    String ItemDescription;
    LocalDateTime ItemAddedDate;
    // cust type bghtby fld many to one,getset
    
	public Items( double itemPrice, String itemDescription, LocalDateTime itemAddedDate) {
		super();
		
		ItemPrice = itemPrice;
		ItemDescription = itemDescription;
		ItemAddedDate = itemAddedDate;
	}
	public Items() {
		
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public double getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(double itemPrice) {
		ItemPrice = itemPrice;
	}
	public String getItemDescription() {
		return ItemDescription;
	}
	public void setItemDescription(String itemDescription) {
		ItemDescription = itemDescription;
	}
	public LocalDateTime getItemAddedDate() {
		return ItemAddedDate;
	}
	public void setItemAddedDate(LocalDateTime itemAddedDate) {
		ItemAddedDate = itemAddedDate;
	}
    
    
    

}
