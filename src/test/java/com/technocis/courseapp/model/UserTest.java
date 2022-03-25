package com.technocis.courseapp.model;

public class UserTest {
	public static void main(String[] args) {
		User user = new User();
		user.setName("Manoj");
		user.setEmail("manoj@man.com");
		user.setMobile(6788763323L);
		user.setPassword("pass");
		System.out.println(user);
	}

}
