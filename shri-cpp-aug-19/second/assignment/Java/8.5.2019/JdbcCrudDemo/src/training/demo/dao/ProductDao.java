package training.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import training.demo.model.Product;

public class ProductDao {
	static Connection con=null;
	static PreparedStatement pst=null;
	static PreparedStatement inspst=null;
	static PreparedStatement getpst=null;
	static PreparedStatement delpst=null;
	static PreparedStatement uppst=null;
	
	static {
		con=DBUtil.getMyConnection();
		try {
			pst=con.prepareStatement("select * from productIET");
			inspst=con.prepareStatement("insert into productIET values(?,?,?)");
			getpst=con.prepareStatement("select * from productIET where pid=?");
			delpst=con.prepareStatement("delete from  productIET where pid=?");
			uppst=con.prepareStatement("update productIET set pname=?, pdesc=? where pid=?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public ResultSet getProducts() {
		try {
			return pst.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}


	public int insertProductData(Product p) {
		try {
			inspst.setInt(1,p.getPid());
			inspst.setString(2,p.getPname());
			inspst.setString(3,p.getPdesc());
		    return inspst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return -1;
		}
		
	}


	public ResultSet getProductById(int id) throws SQLException {
		getpst.setInt(1, id);
		return getpst.executeQuery();
		
	}


	public int deleteProduct(Product p) throws SQLException {
		delpst.setInt(1, p.getPid());
		return delpst.executeUpdate();
		
	}


	public int updateProduct(Product p) throws SQLException {
		uppst.setString(1,p.getPname());
		uppst.setString(2,p.getPdesc());
		uppst.setInt(3, p.getPid());
		return uppst.executeUpdate();
	}

}
