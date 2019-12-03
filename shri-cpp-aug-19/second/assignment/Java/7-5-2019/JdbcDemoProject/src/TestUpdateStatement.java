import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;
import java.util.Scanner;



public class TestUpdateStatement {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			String url="jdbc:mysql://localhost:3306/test";
			Connection con=DriverManager.getConnection(url,"root","root123");
			Statement st=con.createStatement(); 
			Scanner sc=new Scanner(System.in);
			System.out.println("enter data");
			int did=sc.nextInt();
			String str="select * from dept where deptno="+did;
			ResultSet rs=st.executeQuery(str);
			boolean b=rs.next();
			if (b) {
				System.out.println("deptid:"+rs.getInt(1));
				System.out.println("dname:"+rs.getString(2));
				System.out.println("loc:"+rs.getString(3));
				System.out.println("enter data");
				String nm=sc.next();
				String loc=sc.next(); 
				str="update dept set dname='"+nm+"',loc='"+loc+"'" +"where deptno="+did;
				System.out.println(str);
				int n=st.executeUpdate(str);
				if(n>0)
				{
					System.out.println("updation done");
				}
				else {
					System.out.println("updation not done");
				}
				
				}
			else {
				System.out.println("record not found");
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		
		}
		

	}

}
