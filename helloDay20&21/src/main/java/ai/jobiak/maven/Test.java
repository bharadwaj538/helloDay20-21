package ai.jobiak.maven;

import java.sql.*;
public class Test {

	public static void main(String[] args) {
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("connected to database.....");
	}

}
