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
	Databaseutility db=new Databaseutility();
	@Override
	public List<Customer> getallcustomer() {
		List<Customer> customerlist = new ArrayList<>();
		try {
    		
            
			Connection con =db.getconnection();			
		    Statement st = con.createStatement();
			String query="select * from customertbl";
			ResultSet rs= st.executeQuery(query);
			ResultSetMetaData rsmd= rs.getMetaData();		
			
			while (rs.next()) {
				Customer cp = new Customer();
				cp.setId(rs.getInt(1));
				cp.setName(rs.getString(2));
				cp.setAddress(rs.getString(3));
				cp.setNumber(rs.getString(4));
		
				customerlist.add(cp);
							}
			
		
			 	con.close();
		} catch (ClassNotFoundException e) {
						// TODO: handle exception
		}catch (SQLException e) {
			// TODO: handle exception
	}
		
		
		return customerlist;
		
		
	
	}
	@Override
	public int insertcustomer(Customer customer) {
		int flag =0;
		try {
				System.out.println(customer.getName());
				
				Connection con=db.getconnection();
				System.out.println(con);
				PreparedStatement ps= con.prepareStatement("INSERT INTO `customertbl`( `custname`, `address`, `moblienumber`) VALUES (?,?,?) ");
				ps.setString(1,customer.getName());
				ps.setString(2,customer.getAddress());
				ps.setString(3, customer.getNumber());
				int s=ps.executeUpdate();
				//System.out.println(s);
				if (s==1){
					flag=1;
					
				} else {

					flag=0;
				}

				con.close();
				
	} catch (ClassNotFoundException e) {
		
		// TODO: handle exception
	}catch (SQLException e) {
		// TODO: handle exception
	}
		return flag;
	

		
	}

}
