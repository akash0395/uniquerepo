import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestPrepareStatement {
	static PreparedStatement pst=con.prepareStatement("select * from dept",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root123");
		//	PreparedStatement pst=con.prepareStatement("select * from dept where deptno=?",ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			Scanner sc=new Scanner(System.in);
			//System.out.println("Enter dept id");
			//int no=sc.nextInt();
			//pst.setInt(1, no);
			ResultSet rs=pst.executeQuery();
			while(rs.next()) {
				System.out.println("Department id: "+rs.getInt(1));
				System.out.println("Department Name: "+rs.getString(2));
				System.out.println("Department Location: "+rs.getString(3));
			}
			rs.previous();
			System.out.println("Department id: "+rs.getInt(1));
			System.out.println("Department Name: "+rs.getString(2));
			System.out.println("Department Location: "+rs.getString(3));
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
