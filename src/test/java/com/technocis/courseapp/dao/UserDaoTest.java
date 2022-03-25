package com.technocis.courseapp.dao;

import java.util.List;

import com.technocis.courseapp.exception.DBException;
import com.technocis.courseapp.model.User;

public class UserDaoTest {

	public static void main(String[] args) throws DBException {
		//addUserTest();
		UserDao userDao=new UserDaoImpl();
		List<User> userList=userDao.findAllUsers();
		for (User user : userList) {
			System.out.println(user);
		}
	}

	private static void addUserTest() throws DBException {
		User user = new User();
		user.setName("Johnson");
		user.setEmail("john@man.com");
		user.setMobile(6788763323L);
		user.setPassword("pass");
		System.out.println(user);
		UserDao userDao=new UserDaoImpl();
		userDao.register(user);
	}

}
