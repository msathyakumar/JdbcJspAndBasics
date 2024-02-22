package com.sathya.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sathya.project.db.DbHandler;
import com.sathya.project.models.Coupun;
import com.sathya.project.models.Product;

public class CoupunDao {
	
	public void save(Coupun coupun) {
		Connection connection= DbHandler.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into coupon(name,code,price) values(?,?,?);");
			String name = coupun.getName();
			String code=coupun.getCode();
			int price = coupun.getPrice();
			ps.setString(1, name);
			ps.setString(2, code);
			ps.setInt(3, price);
			ps.executeUpdate();
			connection.close();
			System.out.println("insert success coupun");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		}
	
	public Coupun get(String code) {
		Connection connection= DbHandler.getConnection();
		Coupun coupun = null;
		try {
			PreparedStatement ps = connection.prepareStatement("select *from coupon where code=?");
			ps.setString(1, code);			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				coupun.setName(rs.getString(2));
				coupun.setCode(rs.getString(3));
				coupun.setPrice(rs.getInt(4));
				
				
			}
			System.out.println("get success coupun");
			connection.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return coupun;
	}

}
