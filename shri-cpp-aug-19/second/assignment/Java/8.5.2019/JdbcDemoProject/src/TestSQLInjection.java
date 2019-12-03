import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestSQLInjection {
	public static void main(String[] args) {
		Connection con=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver() );
			String url="jdbc:mysql://localhost:3306/test";
			con=DriverManager.getConnection(url, "root","root123");
			Statement st=con.createStatement();
			Scanner sc=new Scanner(System.in);
			String nm=sc.nextLine();
			String query="select * from dept where dname='"+nm+"'";
			System.out.println(query);
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println("Deptid : "+rs.getInt(1));
				System.out.println("Dept Name : "+rs.getString(2));
				
			}
		}catch(SQLException s) {
			s.printStackTrace();
		}
		}
}
