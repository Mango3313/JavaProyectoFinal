package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgreSqlConnection implements DBAdapter {
	private static Connection con = null;
	static {
		String url = "jdbc:postgresql://localhost:5432/users";
		String user = "postgres";
		String pass = "admin";
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, pass);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return con;
	}

}
