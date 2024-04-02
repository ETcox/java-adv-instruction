package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.User;
import model.Vendor;

public class VendorDb {

public static ArrayList<Vendor> getAll(){
		
		ArrayList<Vendor> vendors = new ArrayList<>();
		String sql = "SELECT * FROM Vendor";
		try(Connection connection = PrsDb.getConnection();
			PreparedStatement ps = connection.prepareStatement(sql);
			ResultSet rs = ps.executeQuery()) {
		   while (rs.next()) {
			     Vendor v = parseVendorFromResultSet(rs);
			     vendors.add(v);
		   }
		   
		}
		catch (SQLException sqle) {
			System.err.println(sqle);
			vendors = null;
		}
		
		return vendors;
		
	}


public static Vendor getById(int id) {
	Vendor vendor = null;
	String sql = "SELECT * FROM Vendor WHERE Id = ?" ;
	
	try(Connection connection = PrsDb.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql)){
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			vendor = parseVendorFromResultSet(rs);
			
		}
	}
	catch (SQLException sqle) {
		
		System.err.println(sqle);
		
	}
	
	return vendor;
}


public static boolean add(Vendor vendor) {
	boolean success = false;
	
	
	String sql = "INSERT INTO Vendor (Code, Name, Address, City, State,"
				+ " Zip, Phone, Email)"
				+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		
	try(Connection connection = PrsDb.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql)) {
		ps.setString(1, vendor.getCode());
		ps.setString(2, vendor.getName());
		ps.setString(3, vendor.getAddress());
		ps.setString(4, vendor.getCity());
		ps.setString(5, vendor.getState());
		ps.setString(6, vendor.getZip());
		ps.setString(7, vendor.getPhone());
		ps.setString(8, vendor.getEmail());
		ps.executeUpdate();
		success = true;
	}
		catch(SQLException sqle) {
			System.out.println(sqle);
		}
	
	return success;
}



public static boolean delete (int id) {
	boolean success = false;
	
	String sql = "DELETE FROM VENDOR WHERE Id = ? ";
	try(Connection connection = PrsDb.getConnection();
		PreparedStatement ps = connection.prepareStatement(sql)){
		ps.setInt(1, id);
		ps.executeUpdate();
		success = true;
	}
	catch (SQLException sqle) {
		System.err.println(sqle);
	}
	return success;
	
}



	
private static Vendor parseVendorFromResultSet(ResultSet rs) throws SQLException {
	 int id = rs.getInt(1);
	   String code = rs.getString(2);
	   String name = rs.getString(3);
	   String addr = rs.getString(4);
	   String city = rs.getString(5);
	   String state = rs.getString(6);
	   String zip = rs.getString(7);
	   String phone = rs.getString(8);
	   String email = rs.getString(9);
	   
	   Vendor v = new Vendor(id,code,name,addr,city,state,zip,phone,email);
	
	   return v;
}








}
