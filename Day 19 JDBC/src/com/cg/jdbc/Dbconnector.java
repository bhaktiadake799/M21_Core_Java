package com.cg.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnector {

	public static void main(String[] args) throws SQLException {
		String dbDriver="com.mysql.cj.jdbc.Driver";
		//To connect Eclipse with MySQL server.
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "Bhakti@990";
		String query = "SELECT * FROM student";
		try 
		{
			Class.forName(dbDriver);
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		try
		{
			
		Connection c= DriverManager.getConnection(dbURL, dbUserName, dbPassword);
		Statement s = c.createStatement();
		ResultSet r = s.executeQuery(query);
		while(r.next())
		{
			String data = " ";
			for(int i=1;i<=2;i++)
			{
				data = data+" "+r.getString(i);
			}
			System.out.println(data);
		}
	}
		catch(SQLException e)
		{
			System.out.println("Invalid URL/Username/Password");
			e.printStackTrace();
		}
}
}