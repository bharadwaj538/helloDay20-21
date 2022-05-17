package ai.jobiak.core;

import java.sql.*;

public class TestJdbc1 {
	
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("conneceted to db....");
		
		Statement st = con.createStatement();
		String selectSQL="select * from customer where custid=111";
		
		ResultSet rs=st.executeQuery(selectSQL);
		
		/*
		 * while(rs.next()) { System.out.println("data found");
		 * System.out.println(rs.getString(1)+" "+rs.getString(2)+"  "+rs.getString(3));
		 * }
		 */
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
		System.out.println(rsmd.getTableName(1));
		System.out.println(rsmd.getCatalogName(1));
		System.out.println(rsmd.getCatalogName(2));
		
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(1));
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnName(3));
		
		System.out.println(rsmd.getColumnType(1));
		System.out.println(rsmd.getColumnType(2));
		System.out.println(rsmd.getColumnType(3));

		
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getColumnTypeName(2));
		System.out.println(rsmd.getColumnTypeName(3));
		
		System.out.println(rsmd.isNullable(1));
		
		System.out.println(rsmd.getPrecision(3));
		System.out.println(rsmd.getScale(3));
		System.out.println(rsmd.getPrecision(2));
		System.out.println(rsmd.getScale(2));

	}

}
