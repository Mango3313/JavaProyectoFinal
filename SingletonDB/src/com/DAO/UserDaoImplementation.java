package com.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.User;
import com.util.DatabaseConnection;

public class UserDaoImplementation implements UserDao {

	// Singleton to obtain DB connection
	static Connection con = DatabaseConnection.getDBAdapter().getConnection();

	// Perform Insert
	@Override
	public int add(User user) throws SQLException {
		String query = "insert into users(emp_name, " + "emp_address) VALUES (?, ?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, user.getU_name());
		ps.setString(2, user.getU_address());
		int n = ps.executeUpdate();
		return n;
	}

//Perfrom delete
	@Override
	public void delete(int id) throws SQLException {
		String query = "delete from users where emp_id =?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ps.executeUpdate();
	}

//Perform Query
	@Override
	public User getUser(int id) throws SQLException {
		System.out.println("ID: " + id + " - " + con);

		String query = "select * from users where emp_id= ?";
		PreparedStatement ps = con.prepareStatement(query);

		ps.setInt(1, id);
		User usr = new User();
		ResultSet rs = ps.executeQuery();
		boolean check = false;

		while (rs.next()) {
			check = true;
			usr.setU_id(rs.getInt("emp_id"));
			usr.setU_name(rs.getString("emp_name"));
			usr.setU_address(rs.getString("emp_address"));
		}

		if (check == true) {
			return usr;
		} else
			return null;
	}

	@Override
	public List<User> getUsers() throws SQLException {
		String query = "select * from users";
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		List<User> ls = new ArrayList<User>();

		while (rs.next()) {
			User usr = new User();
			usr.setU_id(rs.getInt("emp_id"));
			usr.setU_name(rs.getString("emp_name"));
			usr.setU_address(rs.getString("emp_address"));
			ls.add(usr);
		}
		return ls;
	}

//Perform delete
	@Override
	public void update(User usr) throws SQLException {
		// TODO Auto-generated method stubString query
		String query = "update users set emp_name=?, " + " emp_address= ? where emp_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, usr.getU_name());
		ps.setString(2, usr.getU_address());
		ps.setInt(3, usr.getU_id());
		ps.executeUpdate();

	}

}
