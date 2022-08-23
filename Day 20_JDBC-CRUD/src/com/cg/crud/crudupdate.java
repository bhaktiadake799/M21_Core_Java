package com.cg.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class crudupdate {

	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/capgemini";
		String dbUserName = "root";
		String dbPassword = "Bhakti@990";
		
		try
		{
			Connection c = DriverManager.getConnection(dbURL, dbUserName, dbPassword);
			String query = "UPDATE EMPLOYE full_name = ? , EMAIL_ID= ? WHERE ID = ?";
			PreparedStatement p = c.prepareStatement(query);
			p.setString(1, "Bhakti");
			p.setString(2, "bhaktiadake799gmail.com");
			p.setInt(3, 103);
			
			int rowUpdated = p.executeUpdate();
			if(rowUpdated > 0)
			{
				System.out.println("New User is Inserted successfully");
			}
			c.close();
	}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}

	}

}