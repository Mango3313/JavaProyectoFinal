package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBMysqlConnection implements DBAdapter{

	private static Connection con = null;
	static {
        try {
        	String url = "jdbc:mysql://localhost:3306/users";
    		String user = "root";
    		String pass = "Gordom4ngo";
    		Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
        	System.err.println(e);
            throw new RuntimeException("Unexpected error on load MySQL Driver");
        }
    }
	@Override
	public Connection getConnection() {
		// TODO Auto-generated method stub
		return con;
	}

}
