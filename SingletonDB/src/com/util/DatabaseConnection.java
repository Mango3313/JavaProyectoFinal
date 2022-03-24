package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

	private static Connection con = null;

	
	public static DBAdapter getDBAdapter(){
        String dbType = ConfigLoader.getDBType();
        System.out.println("DBType => " + dbType);
        switch(dbType){
            case "MySQL":
                return new DBMysqlConnection();
            case "PostgreSQL":
                return new PostgreSqlConnection();
            default:
                throw new RuntimeException("Unsupported db type");
        }
	}
	/*
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
*/
	public static Connection getConnection() {

		return con;

	}
}
