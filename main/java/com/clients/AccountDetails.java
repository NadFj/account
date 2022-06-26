package com.clients;

import java.util.ArrayList;

public class AccountDetails{
	
	private Customer customer;
	private ArrayList<Transactions> lstTransaction;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<Transactions> getLstTransaction() {
		return lstTransaction;
	}
	public void setLstTransaction(ArrayList<Transactions> lstTransaction) {
		this.lstTransaction = lstTransaction;
	}
	
	
	

}
