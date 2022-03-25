package com.technocis.courseapp.validator;

import com.technocis.courseapp.model.User;



public class UserValidator {
	/**This method used to validate the user details
	 * @param user
	 * @throws Exception
	 */
	public static void validateUser(User user) throws Exception {
		if (user.getName() == null) {
			throw new Exception("Invalid Name");
		} else if (user.getEmail() != null) {
			throw new Exception("Invalid Email");
		}
		else if(user.getPassword().length() < 8)
		{
			throw new Exception("Password min 8 chars length");
		}
		else if(user.getMobile()==null)
		{
			throw new Exception("Invalid Mobile Number");
		}
		System.out.println("User Details are valid");
	}

}
