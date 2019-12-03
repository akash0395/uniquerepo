import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestJdbcConnection {

	public static void main(String[] args) {
		Connection con=null;
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver() );
			String url="jdbc:mysql://localhost:3306/test";
			 con=DriverManager.getConnection(url, "root","root123");
			con.setAutoCommit(false);
			System.out.println("Connection done");
			Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			ResultSet rs=st.executeQuery("select * from dept");
			while(rs.next()) {
				System.out.println("Deptid: "+rs.getInt(1));
				System.out.println("DeptName: "+rs.getString(2));
				System.out.println("Location: "+rs.getString(3));
			}
			rs.previous();
			System.out.println("Previous done");
			System.out.println("Deptid: "+rs.getInt(1));
			System.out.println("DeptName: "+rs.getString(2));
			System.out.println("Location: "+rs.getString(3));
			Scanner sc=new Scanner(System.in);
			int did=sc.nextInt();
			String name=sc.next();
			String loc=sc.next();
			String query="insert into dept values("+did+",'"+name+"','"+loc+"')";
			System.out.println("Query : "+query);
		    int i=st.executeUpdate(query);
		    if(i>0) {
		    	System.out.println("Record inserted.....");
		    	
		    }else {
		    	System.out.println(" No Record inserted.....");
		    	
		    }
		con.commit();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
