package com.task.customer.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.task.item.entites.Item;

@Entity
public class Customer {

	@GeneratedValue
	@Id
	long id;
	
	String name;
	
	@OneToOne 
	Account account;
	//items one to many; getter setter
	
	 @OneToMany(fetch = FetchType.EAGER)
     Set<Item> boughtItems;
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Set<Item> getBoughtItems() {
		return boughtItems;
	}
	public void setBoughtItems(Set<Item> boughtItems) {
		this.boughtItems = boughtItems;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boughtItems == null) ? 0 : boughtItems.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (boughtItems == null) {
			if (other.boughtItems != null)
				return false;
		} else if (!boughtItems.equals(other.boughtItems))
			return false;
		return true;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}
	public Customer() {}
	
}