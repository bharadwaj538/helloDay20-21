package ai.jobiak.core;

import java.sql.*;
import java.sql.DriverManager;

public class TestSelect {

	public static void main(String[] args)throws SQLException {
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println(con);
		Statement stmt=con.createStatement();
		
		String selectSql="select * from customer";
		ResultSet rs=stmt.executeQuery(selectSql);
		
		while(rs.next()) {
			System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		}

	}

}
