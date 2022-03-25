package com.technocis.courseapp.dao;

import java.util.List;

import com.technocis.courseapp.exception.DBException;
import com.technocis.courseapp.model.User;

public interface UserDao {
	public void register(User user) throws DBException;
	public List<User> findAllUsers() throws DBException;

}
