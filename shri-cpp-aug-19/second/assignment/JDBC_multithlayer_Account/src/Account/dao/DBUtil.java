package Account.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
static Connection con=null;
	public static Connection getMyConnection() {
		
		if(con==null) {
			
			try {
				DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
				String url="jdbc:mysql://192.168.10.71:3307/dac96";
				con=DriverManager.getConnection(url,"dac96","welcome");
				return con;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return con;
	}
	
	public static void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
