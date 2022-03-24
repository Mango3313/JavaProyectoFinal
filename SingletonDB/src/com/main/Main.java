package com.main;

import java.sql.SQLException;
import java.util.List;
import com.DAO.UserDaoImplementation;
import com.model.User;

public class Main {

	public static void main(String[] args) {
		// Initialize User
		User usr = new User();
		// Set name and addres
		usr.setU_name("Haider");
		usr.setU_address("Mars");

		// Call Dao to perform operations
		UserDaoImplementation usrDao;
		try {

			usrDao = new UserDaoImplementation();
			// add
			usrDao.add(usr);

			// read
			User e = usrDao.getUser(2);
			// System.out.println(usrDao.getUser(1));
			System.out.println(e.getU_id() + " " + e.getU_name() + " " + e.getU_address());

			// read All
			List<User> ls = usrDao.getUsers();
			for (User allUsr : ls) {
				System.out.println(allUsr);
			}

			// update
			User tempUser = usrDao.getUser(2);
			tempUser.setU_address("Asgard");
			usrDao.update(tempUser);
			
			List<User> ls1 = usrDao.getUsers();
			for (User allUsr : ls1) {
				System.out.println(allUsr);
			}

			// delete
			//usrDao.delete(1);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
