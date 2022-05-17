package ai.jobiak.core;

import java.sql.*;
import java.sql.Types;

public class TestDml2 {

	public static void main(String args[]) throws SQLException{

	String userName="root"; 
	String password="admin";
	String url="jdbc:mysql://localhost:3306/world";
	
	

	Connection con=DriverManager.getConnection(url,userName,password);
	
	String names[]= {"li","Xi","Xing","Lee","Pie","Poo","Woo","Wan","Zang","Chifu"};
	double deposits[]= {200,320,650,730,400,500,653,490,100,700};
	
	for(int i=1;i<names.length;i++) {
	PreparedStatement pstmt=con.prepareStatement("insert into customer values(?,?,?)");
	pstmt.setInt(1,i+ 111);
	pstmt.setString(2,names[i]);
	pstmt.setDouble(3,deposits[i]);
	
	int count = pstmt.executeUpdate();
	System.out.println(count+"record inserted");
	}
	}
}
