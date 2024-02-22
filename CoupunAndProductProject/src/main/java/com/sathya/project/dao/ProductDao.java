package com.sathya.project.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sathya.project.db.DbHandler;
import com.sathya.project.models.Product;

public class ProductDao {
	
	public void save(Product product) {
		Connection connection= DbHandler.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("insert into product(name,coupuncode,price) values(?,?,?);");
			String name = product.getName();
			String coupuncode=product.getCoupunCode();
			int price = product.getPrice();
			ps.setString(1, name);
			ps.setString(2, coupuncode);
			ps.setInt(3, price);
			ps.executeUpdate();
			connection.close();
			System.out.println("insert success product");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
		
	}


