package com.task.item.entites;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.task.customer.entities.Customer;

@Entity
public class Item {
	@GeneratedValue
	@Id
	int ItemId;
	
    double ItemPrice;
    String ItemDescription;
    LocalDateTime ItemAddedDate;
    
    @ManyToOne
    Customer boughtBy;
    
	public Item( double itemPrice, String itemDescription, LocalDateTime itemAddedDate) {
		super();
		
		ItemPrice = itemPrice;
		ItemDescription = itemDescription;
		ItemAddedDate = itemAddedDate;
	}
	public Item() {
		
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public Customer getBoughtBy() {
		return boughtBy;
	}
	public void setBoughtBy(Customer boughtBy) {
		this.boughtBy = boughtBy;
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
