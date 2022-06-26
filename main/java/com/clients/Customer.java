package com.clients;

import java.math.BigDecimal;

public class Customer {
	
	private int customerId;
	private String name;
	private String surName;
	
	private BigDecimal initialCredit;

	public Customer(int customerId, String name, String surName, BigDecimal initialCredit) {
		// TODO Auto-generated constructor stub
		this.customerId=customerId;
		this.name= name ;
		this.surName = surName;
		this.initialCredit = initialCredit;
				
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public BigDecimal getInitialCredit() {
		return initialCredit;
	}

	public void setInitialCredit(BigDecimal initialCredit) {
		this.initialCredit = initialCredit;
	}
	
	
	
	

}
