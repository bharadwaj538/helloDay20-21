package ai.jobiak.core;

import java.sql.*;
import java.sql.DriverManager;

public class TestStudent {

	public static void main(String[] args) throws SQLException{
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
		/*
		 * String
		 * insertSql="insert into students values(501,'Jackie','M' ,'Vietnam','Computational Geometry')"
		 * ; String
		 * insertSql2="insert into students values(502,'Hamid Karzai','M','Afghanistan','Artificial Intelligence')"
		 * ; String
		 * insertSql3="insert into students values(503,'Amelia','F','New Zealand','Computer Architecture')"
		 * ; String
		 * insertSql4="insert into students values(504,'Fernando','M','Mexico','Data Mining')"
		 * ; String
		 * insertSql5="insert into students values(505,'Kamel Maghur','M','Libya','Database')"
		 * ; String
		 * insertSql6="insert into students values(506,'Aluna','F','Kenya','Networks')";
		 * String
		 * insertSql7="insert into students values(507,'James','M','USA','Robotics')";
		 * String
		 * insertSql8="insert into students values(508,'RamaKrishna','F','India','Software Engineering')"
		 * ; String
		 * insertSql9="insert into students values(509,'Maghur','M','Libya','Robotics')"
		 * ; String
		 * insertSql10="insert into students values(510,'Alexander','F','Germany','Networks')"
		 * ;
		 * 
		 * 
		 * 
		 * long count=stmt.executeLargeUpdate(insertSql); long
		 * count2=stmt.executeLargeUpdate(insertSql2); long
		 * count3=stmt.executeLargeUpdate(insertSql3); long
		 * count4=stmt.executeLargeUpdate(insertSql4); long
		 * count5=stmt.executeLargeUpdate(insertSql5); long
		 * count6=stmt.executeLargeUpdate(insertSql6); long
		 * count7=stmt.executeLargeUpdate(insertSql7); long
		 * count8=stmt.executeLargeUpdate(insertSql8); long
		 * count9=stmt.executeLargeUpdate(insertSql9); long
		 * count10=stmt.executeLargeUpdate(insertSql10);
		 * 
		 * System.out.println(count+" "+count2+" "+count3+" "+count4+" "+count5+" "
		 * +count6+" "+count7+" "+count8+" "+count9+" "+count10);
		 * System.out.println(con);
		 */ 

		String updateSql="UPDATE students SET Country=Chaina where StudentId=501";
		int rowsupdated=stmt.executeUpdate(updateSql);
		System.out.println(rowsupdated);
		
	}

}
