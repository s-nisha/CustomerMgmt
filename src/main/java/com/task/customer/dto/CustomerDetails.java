package com.task.customer.dto;

public class CustomerDetails {
     private long id;
     private String name;
 	 private long accountId;
 	 private double balance;
 	 
 	 
 	 public CustomerDetails() {
 		 
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

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
 	 
}