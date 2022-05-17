package jdbcday24;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class TestCsvInsert {
 
	public static void main(String[] args)throws SQLException,IOException {
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		String FilePath="CourseList.csv";
		
		int batchSize=10;
		
		String sql="insert into courselist(CourseName,StudentName)"+"values(?,?)";
		PreparedStatement stmt= con.prepareStatement(sql);
		
		BufferedReader lineReader= new BufferedReader(new FileReader(FilePath));
		String lineText=null;
		int count=0;
		lineReader.readLine();
		
		while((lineText = lineReader.readLine())!=null ){
			String[] data=lineText.split(",");
			String CourseName = data[0];
			String StudentName = data[1];
			
			stmt.setString(1,CourseName);
			stmt.setString(2, StudentName);
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
