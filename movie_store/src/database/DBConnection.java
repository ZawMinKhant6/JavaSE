package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/moviedb?useSSL=false";
		String user = "root";
		String password = "1234";
		Connection con = null;
		try {
			con= DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
