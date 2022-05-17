package ai.jobiak.maven;

import java.util.Scanner;
import java.sql.*;

public class Assessment2_Bharadwaj_Pudi {
	public static void main(String args[]) throws SQLException, ClassNotFoundException{
		
		String url="jdbc:mysql://localhost:3306/mail";
		String userName="root";
		String password="admin";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,userName,password);
		
		Statement stmt=con.createStatement();
		
		String sql="Create table mailinbox"
				+"(s.No integer,"
				+"from varchar(50),"
				+"subject varchar(150),"
				+"content varchar(700),"
				+"size integer"
				+"primary key(s.No))";
		stmt.executeUpdate(sql); 
		
		String sql2="insert into mailinbox values(1,'LEO','OfferLetter','Your are successfully completed the Assessment and Interview"
			+ "we happy to inform that you are selected the company jobiak',119)";
		String sql3="insert into mailinbox values(2,'Niana','Assessment','You have an assessment on tuesday',33)";
		String sql4="insert into mailinbox values(3,'Niana','Interview','You are qualifeied the first round',34)";
		String sql5="insert into mailinbox values(4,'Niana','hr Round','you are done the t/r on saturday you have hr round',50)";
		
		stmt.executeUpdate(sql2);
		stmt.executeUpdate(sql3);
		stmt.executeUpdate(sql4);
		stmt.executeUpdate(sql5);
		
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String selectSQL="select * from mailinbox";
		
		ResultSet rs=st.executeQuery(selectSQL);
		
		while(rs.next()) {
			
			Scanner s=new Scanner(System.in);
			System.out.println("Enter 0 to close the mail");
			System.out.println("Enter a number : ");
			int a=s.nextInt();
			
			if(a==1)
				rs.first();
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			if(a==2)
				rs.next();
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			if(a==3)
				rs.previous();
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			if(a==4)
				rs.last();
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			if(a==5)
				rs.absolute(a);
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5));
			if(a==0)
				rs.close();
				System.out.println("you are logged out");
				
			
			
		
		}
	}

}
