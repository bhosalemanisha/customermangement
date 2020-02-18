package com.tdn.customerDAO;

import java.util.List;

import com.tdn.customermangement.Customer;

public interface CustomerDAOI {
	public List<Customer>getallcustomer() ;
	public int insertcustomer (Customer customer);
	

}
