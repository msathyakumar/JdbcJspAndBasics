package com.sathya.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AccountDAO {
	
	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account;");) {
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");
			//Statement statement = connection.createStatement();
			//int rs = statement.executeUpdate("insert into account values(1,'sathya','kumar',50000);");
			//System.out.println(rs +" rows gets inserted");
			//int rs = statement.executeUpdate("update account set bal=100000 where accno=1");
			//System.out.println(rs +" rows gets updated");
			//int rs = statement.executeUpdate("delete from account where accno=1");
			//System.out.println(rs +" rows gets deleted");
			//ResultSet rs = statement.executeQuery("select * from account;");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
