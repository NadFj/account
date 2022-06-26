package com.dataStorage;
import java.math.BigDecimal;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

import com.clients.Customer;
import com.clients.Transactions;

public class TransactionDBStorage {

	
	private static Map<Integer ,Transactions> transactionsInfos = new HashMap<Integer ,Transactions>();

	private static TransactionDBStorage instance;
	public static TransactionDBStorage getInstance(){
		if (instance == null) {
			
			return new TransactionDBStorage();
		}
		return instance;
	}


	private TransactionDBStorage () {
		Customer customer = new Customer(0000001,"Nada","Faraj",new BigDecimal("1") );
		Customer customer2 = new Customer(0000002,"John","Smith",new BigDecimal("1") );
		Date transactionDate = null;
		   String sDate1="31/12/2020";
		   try {
			 transactionDate=(Date) new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   
		   
		   transactionsInfos.put(0000001, new Transactions(1, new BigDecimal(100), new BigDecimal(2000), customer, transactionDate )); 
		transactionsInfos.put(0000002, new Transactions(1, new BigDecimal(500), new BigDecimal(5000), customer,(Date) transactionDate) ); 
		
		
	}

	public Transactions getTransactions(int customerId) {
	return transactionsInfos.get(customerId);
	}

	public void puttTransactions(Transactions transaction) {
		transactionsInfos.put(transaction.getCustomer().getCustomerId(),transaction);
	}



}
