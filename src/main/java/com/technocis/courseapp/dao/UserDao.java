package com.technocis.courseapp.dao;

import com.technocis.courseapp.exception.DBException;
import com.technocis.courseapp.model.User;

public interface UserDao {
	public void register(User user) throws DBException;

}
