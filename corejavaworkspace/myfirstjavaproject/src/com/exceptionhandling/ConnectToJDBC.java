package com.exceptionhandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ConnectToJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		System.out.println("main method started");
		//Step 1 : loading the Driver Class
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver class loaded");
		
		//Step 2 : Establish the connection btw the JDBC & MYSQL
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/batch74","root","root");
		System.out.println("connection establised");
		//Step 3 : create a statement object
		//createStatement()-->Creates a Statement object for sending SQL statements to the database.
		Statement stmt = con.createStatement();
		//Step 4 : Create a ResultSet
		String str = "select * from emp";
		ResultSet rs = stmt.executeQuery(str);
		//Step 5 : Representing the data
		while(rs.next()) {
			System.out.println();
			System.out.print(rs.getInt(1)+" | ");
			System.out.print(rs.getString(2)+" | ");
			System.out.print(rs.getString(3)+" | ");
			System.out.print(rs.getInt(4)+" | ");
		}
		//Step 6 : Closing all the connection related objects
	}

}
