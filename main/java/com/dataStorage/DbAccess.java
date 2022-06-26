package com.dataStorage;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.clients.AccountDetails;
import com.clients.Customer;

public class DbAccess {
	
	
private static Map<Integer ,Customer> customerInfos = new HashMap<Integer ,Customer>();

private static DbAccess instance;
public static DbAccess getInstance(){
	if (instance == null) {
		
		return new DbAccess();
	}
	return instance;
}


private DbAccess () {
	
	customerInfos.put(0000001, new Customer (0000001,"Nada","Far",new BigDecimal("1") )) ;
	customerInfos.put(0000002, new Customer (0000002,"jhon","smith",new BigDecimal("0") )) ;
	
	
}

public Customer getCustomer(int customerId) {
return customerInfos.get(customerId);
}

public void putCustomer(Customer customer) {
 customerInfos.put(customer.getCustomerId(),customer);
}

}
