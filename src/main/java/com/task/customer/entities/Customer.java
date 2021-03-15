package com.task.customer.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {

	@GeneratedValue
	@Id
	long id;
	
	String name;
	
	@OneToOne 
	Account account;
	//items one to many; getter setter
	
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