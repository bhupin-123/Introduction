package JavaPractixe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Mysqldata {
	public static void main(String args[]) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		//String host="localhost";
	//	String port="3306";
		String url="jdbc:mysql://localhost:3306/qadbt";
		
		
		Connection con=DriverManager.getConnection(url,"root", "root");
		//Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/qadbt?user=root&password=root&useUnicode=true&characterEncoding=UTF-8"); 
		//DriverManager.getConnection(url, user, password)     
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Logininfo");
		while(rs.next()) {
		
		System.out.println(rs.getString("username"));
		System.out.println(rs.getString("password"));
		}
		
	}

}
	 	