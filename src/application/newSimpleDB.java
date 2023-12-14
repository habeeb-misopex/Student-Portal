package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;


public class newSimpleDB {

	
	private static String dbUsername = "root"; //mysql user name
	private static String dbPassword = "1234"; //mysql password
	private static String URL = "127.0.0.1"; // location of db server
	private static String port = "3306"; // constant
	private static String dbName = "university"; //most likely will not change
	private static Connection con;
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
			
		
		DBConn a = new DBConn(URL,port, dbName, dbUsername, dbPassword);
	/*	
		con = a.connectDB();
		System.out.println("Connection established");
		con.close();
	*/	

		
		con = a.connectDB();

		String mystring = "select * from student";
		
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(mystring);


		while ( rs.next() ) //one tuple at a time
			System.out.println(rs.getString(1)+ " "+ rs.getString(2) + " "+
					rs.getString(3) + " " + rs.getString(4) +
					" " + rs.getString(5));
		
		rs.close();
		stmt.close();
		
		con.close();
		System.out.println("Connection closed" );
		
	}

}




