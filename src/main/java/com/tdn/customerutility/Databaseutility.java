package com.tdn.customerutility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseutility {
	final  String DB_URL="jdbc:mysql://localhost:3306/student1";
	final  String DB_USER="root";
	final  String DB_PASSWORD="";
  
	public Connection getconnection()  {
		Connection con=null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			 con =DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
			System.out.println(con);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}




}
