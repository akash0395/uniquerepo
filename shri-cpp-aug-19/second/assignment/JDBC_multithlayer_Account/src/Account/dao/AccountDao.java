package Account.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Account.Model.Account;



public class AccountDao {
	static Connection con=null;
	static PreparedStatement pst=null;
	static PreparedStatement inspst=null;
	static PreparedStatement srspst=null;
	static PreparedStatement sbpst=null;
	static {con=DBUtil.getMyConnection();
	try {
		pst = con.prepareStatement("select * from Bank");
		inspst=con.prepareStatement("insert into Bank values(?,?,?,?,?,?,?,?)");
		srspst = con.prepareStatement("select * from Bank where acc_id=?");
		sbpst = con.prepareStatement("update Bank set balance=? where acc_id=?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public ResultSet getData() {
		try {
			
			ResultSet s= pst.executeQuery();
			System.out.println(s);
			return s;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public int insertProductData(Account a) {
		try {
			inspst.setInt(1, a.getAcc_id());
			inspst.setString(2, a.getName());
			inspst.setFloat(3, a.getBalance());
			inspst.setInt(4, a.getMin_bal());
			inspst.setFloat(5, a.getIr());
			java.util.Date d=a.getDate_of_op();
			java.sql.Date sqlDate = new java.sql.Date(d.getTime());
			inspst.setDate(6, sqlDate);
			inspst.setString(7, a.getMob());
			inspst.setString(8, a.getEmail());
			return inspst.executeUpdate();
			//inspst.setDate(6, x);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return 0;
	}

	public ResultSet getId(int ac) throws SQLException {
		srspst.setInt(1, ac);
		return srspst.executeQuery();
	}

	public int setBalance(int rs, float ba) throws SQLException {
		sbpst.setFloat(1, ba);
		sbpst.setInt(2, rs);
		return sbpst.executeUpdate();
		// TODO Auto-generated method stub
		
	}

}
