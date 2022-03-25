package com.technocis.courseapp.validator;

import com.technocis.courseapp.model.User;

public class UservalidatorTest {
	public static void main(String[] args) throws Exception {
		User user = new User();
		user.setName("Manoj");
		user.setEmail("manoj@man.com");
		user.setMobile(6788763323L);
		user.setPassword("pass");
		System.out.println(user);
		UserValidator.validateUser(user);
	}

}
