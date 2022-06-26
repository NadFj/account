package com.clients;

import java.math.BigDecimal;
import java.util.Date;

public class Transactions {

	private int transactionId;
	private BigDecimal amount;
	private BigDecimal balance;
	private Customer customer;
	private Date transactionDate;
	

 public Transactions (int transactionId, BigDecimal amount, BigDecimal balance, Customer customer, Date transactionDate) {
	// TODO Auto-generated constructor stub
	this.transactionId=transactionId;
	this.amount= amount ;
	this.balance = balance;
	this.customer = customer;
			this.transactionDate =transactionDate;
}
 

	
	public Date getTransactionDate() {
	return transactionDate;
}



public void setTransactionDate(Date transactionDate) {
	this.transactionDate = transactionDate;
}



	public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getBalance() {
		return balance;
	}
	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}
	
	
	
}
