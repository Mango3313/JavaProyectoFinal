package com.DAO;

import java.sql.SQLException;
import java.util.List;

import com.model.User;

public interface UserDao {
	public int add(User user) throws SQLException;

	public void delete(int id) throws SQLException;

	public User getUser(int id) throws SQLException;

	public List<User> getUsers() throws SQLException;

	public void update(User usr) throws SQLException;
}
