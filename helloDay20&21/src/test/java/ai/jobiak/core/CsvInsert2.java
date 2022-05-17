package ai.jobiak.core;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class CsvInsert2 {
  
	public static void main(String[] args)throws SQLException,IOException {
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		String FilePath="C:\\Users\\JOBIAK\\Mymaven\\hello\\EmpDetails.csv";
		
		int batchSize=15;
		
		String sql="insert into empdetails values(?,?,?,?)";
		PreparedStatement stmt= con.prepareStatement(sql);
		
		BufferedReader lineReader= new BufferedReader(new FileReader(FilePath));
		String lineText=null;
		int count=0;
		lineReader.readLine();
		
		while((lineText = lineReader.readLine())!=null ){
			String[] data=lineText.split(" ");
			String EmpId = data[0];
			String EmpName = data[1];
			String EmpSalary = data[2];
			String WorkLocation = data[3];
			
			stmt.setString(1,EmpId);
			stmt.setString(2,EmpName);
			stmt.setString(3,EmpSalary);
			stmt.setString(4,WorkLocation);
			stmt.addBatch();
			
			if(count % batchSize==0) {
				stmt.executeBatch();
			}
		}
		
		lineReader.close();
		stmt.executeBatch();
		System.out.println("values Inserted");
		con.close();

	}

}
