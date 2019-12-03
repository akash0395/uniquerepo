import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import training.demo.util.DBUtil;

import java.sql.CallableStatement;

public class TestCallableStatement {

	public static void main(String[] args) {
		Connection con=null;
		try {
			/*DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver() );
			String url="jdbc:mysql://localhost:3306/test";
			 con=DriverManager.getConnection(url, "root","root123");*/
			con=DBUtil.getMyConnection();
			 CallableStatement c=con.prepareCall("{call getcount(?,?)}");
			 c.setInt(1,10);
			 //c.setString(2,"MANAGER");
			 c.registerOutParameter(2, java.sql.Types.INTEGER);
			 c.execute();
			 int n=c.getInt(2);
			 System.out.println("the value is :"+ n);
			 CallableStatement c1=con.prepareCall("{call inserRec(?,?,?)}");
			 c1.setInt(1, 100);
			 c1.setString(2,"mydept");
			 c1.setString(3,"Pune");
			 c1.execute();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
