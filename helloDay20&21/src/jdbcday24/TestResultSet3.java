package jdbcday24;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestResultSet3 {

public static void main(String[] args)throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		
		Connection con=DriverManager.getConnection(url,userName,password);
		System.out.println("conneceted to db....");
		
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		String selectSQL="select * from customer";
		
		ResultSet rs=st.executeQuery(selectSQL);
		
		if(rs.next()) {
			
			//rs.moveToInsertRow();
			
			//rs.updateInt(1, 111);
			//rs.updateString(2, "Maria");
			//rs.updateDouble(3,890);
			//rs.insertRow();
			//rs.last();
			
			rs.last();
			rs.deleteRow();
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			
		}
	}
}
