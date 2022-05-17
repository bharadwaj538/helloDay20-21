package ai.jobiak.maven;

import java.sql.*;

public class SelectDrop {
	public static void main(String args[]) throws SQLException, ClassNotFoundException{
		
		String url="jdbc:mysql://localhost:3306/world";
		String userName="root";
		String password="admin";
		

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,password);
		Statement stmt=con.createStatement();
		
	/*	String sql="Create table Employees("
				+ "EmpName varchar(45),"
				+ "EmpId integer,"
				+ "EmpSalary varchar(45),"
				+ "primary key(EmpId))";
		stmt.executeUpdate(sql);
		*/
		//String sql1="insert into Employees values('john',20,'200000')";
		//stmt.executeUpdate(sql1);
		//String sql2="insert into Employees values('doe',21,'2000000')";
		//stmt.executeUpdate(sql2);
		
	//	String sql4="update Employees set EmpName='ram' where EmpId=21";
	//	stmt.executeUpdate(sql4);
		
	//	String sql4="update Employees set EmpName='krish' where EmpId=21";
	//	stmt.executeUpdate(sql4);
		
	//	PreparedStatement psm=con.prepareStatement("update Employees set EmpName='ram' where EmpId=20");
	//	psm.executeUpdate();
		
	//	PreparedStatement psm1=con.prepareStatement("insert into Employees values('ramana',22,'220000')");
	//	psm1.executeUpdate();
		
	//	CallableStatement cs=con.prepareCall("insert into Employees value('tilak',23,'210000')");
	//	cs.executeUpdate();
		
		String sql4="select * from Employees";

		ResultSet rs=stmt.executeQuery(sql4);
		while(rs.next())
		System.out.println(rs.getString(1)+"  :  "+rs.getString(2)+"  :  "+rs.getString(3));
		
		
	    
		
	}

}
