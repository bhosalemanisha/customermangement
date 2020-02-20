package com.tdn.customerDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.tdn.customermangement.Customer;
import com.tdn.customerutility.Databaseutility;

public class CustomerDAOImp implements CustomerDAOI {
	Databaseutility  dbutility=null;
	Connection con=null;

	@Override
	public List<Customer> getallcustomer() {
		dbutility = new Databaseutility();
		con=dbutility.getconnection();
		ArrayList<Customer> customerlist=null;
		if (con!=null) {
			try {
			customerlist = new  ArrayList<>();
			PreparedStatement ps = con.prepareStatement("select * from customertbl");
			ResultSet rs =ps.executeQuery();
			while (rs.next()) {
				Customer customer = new Customer(rs.getInt(1), rs.getString(2),rs.getString(3), rs.getString(4));
				
				customerlist.add(customer);
				//System.out.println(customerlist);
							}
			
		
			 	con.close();
		} catch (SQLException e) {
			// TODO: handle exception
				}
		
			}
			return customerlist;
		
		
	
		}
	}
	


