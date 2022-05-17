package jdbcday24;


import java.sql.*;

public class TestResultSet {
public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("conneceted to db....");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String selectSQL="select * from customer";
		
		ResultSet rs=st.executeQuery(selectSQL);
		
		//while(rs.next()) {
			
			rs.afterLast();
			rs.previous();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			rs.first();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			rs.next();
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			rs.absolute(4);
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
	//	}
		
		ResultSetMetaData rsmd=rs.getMetaData();
		
	}


}
