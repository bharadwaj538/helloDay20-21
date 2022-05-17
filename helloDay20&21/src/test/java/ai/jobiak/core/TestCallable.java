package ai.jobiak.core;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestCallable {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("conneceted to db....");
		
	
		CallableStatement cs2= con.prepareCall("{? = call updatebalance(?,?)}");
		cs2.registerOutParameter(1,Types.BOOLEAN);
		cs2.setInt(2,104);
		cs2.setDouble(3,105);
		cs2.executeUpdate();
		System.out.println(cs2.getBoolean(1));
		
		

	}

}
