package com.technocis.courseapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.technocis.courseapp.exception.DBException;

public class ConnectionUtil {
	
	public static Connection getDbConnection() throws DBException
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/course_app";
			String userName="root";
			String password="root";
			con=DriverManager.getConnection(url,userName,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DBException(e.getMessage(),e);
		}
		return con;
	}

}
