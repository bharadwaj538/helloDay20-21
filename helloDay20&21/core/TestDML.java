package ai.jobiak.core;

import java.sql.*;
public class TestDML {

	public static void main(String[] args)throws SQLException{
		
		String userName="root"; 
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		

		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		String insertSql="insert into customer values(101,'John Doe',600)";
		String insertSql2="insert into customer values(102,'Roman Reigns',700)";
		String insertSql3="insert into customer values(103,'Wang',800)";
		String insertSql4="insert into customer values(104,'Shang chi',900)";
		String insertSql5="insert into customer values(105,'Robert',100)";
		String insertSql6="insert into customer values(106,'Liao',650)";
		String insertSql7="insert into customer values(107,'Jackie',750)";
		String insertSql8="insert into customer values(108,'Chan',850)";
		String insertSql9="insert into customer values(109,'Ching ping',950)";
		String insertSql10="insert into customer values(110,'Tang',1050)";
		long count=stmt.executeLargeUpdate(insertSql);
		long count2=stmt.executeLargeUpdate(insertSql2);
		long count3=stmt.executeLargeUpdate(insertSql3);
		long count4=stmt.executeLargeUpdate(insertSql4);
		long count5=stmt.executeLargeUpdate(insertSql5);
		long count6=stmt.executeLargeUpdate(insertSql6);
		long count7=stmt.executeLargeUpdate(insertSql7);
		long count8=stmt.executeLargeUpdate(insertSql8);
		long count9=stmt.executeLargeUpdate(insertSql9);
		long count10=stmt.executeLargeUpdate(insertSql10);
		System.out.println(count);
		System.out.println(count2);
		System.out.println(count3);
		System.out.println(count4);
		System.out.println(count5);
		System.out.println(count6);
		System.out.println(count7);
		System.out.println(count8);
		System.out.println(count9);
		System.out.println(count10);
		
		
		System.out.println(con);
		 
		
	}

}
