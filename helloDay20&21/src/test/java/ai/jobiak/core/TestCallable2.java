package ai.jobiak.core;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class TestCallable2 {

	public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("conneceted to db....");
		
		CallableStatement cs=con.prepareCall("{call updatebalance(?,?)}");
		cs.setInt(1,104);
		cs.setDouble(2,105);
		System.out.println(cs);
		
		boolean rs=cs.execute(); 
		System.out.println(rs);
	}
}