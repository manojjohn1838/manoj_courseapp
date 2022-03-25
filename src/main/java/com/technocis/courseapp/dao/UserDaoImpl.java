package com.technocis.courseapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.technocis.courseapp.exception.DBException;
import com.technocis.courseapp.model.User;

public class UserDaoImpl implements UserDao{

	public void register(User user) throws DBException {
		String query="INSERT INTO courseapp_user (name,email,password,mobile)VALUES(?,?,?,?)";
		Connection con=ConnectionUtil.getDbConnection();
		PreparedStatement pstmt=null;
		try
		{
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setLong(4, user.getMobile());
			int rows = pstmt.executeUpdate();
			System.out.println("Number of Rows Inserted "+rows);
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DBException(e.getMessage(), e);
		}
		finally
		{
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
		}
	}

	public List<User> findAllUsers() throws DBException {
		String query="SELECT id,name,email,password,mobile FROM courseapp_user";
		Connection con=ConnectionUtil.getDbConnection();
		List<User> userList=new ArrayList<User>();
		PreparedStatement pstmt=null;
		try
		{
			pstmt = con.prepareStatement(query);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next())
			{
				User user=new User(rs.getInt("id"), rs.getString("name")
						, rs.getString("email"), rs.getString("password")
						, rs.getLong("mobile"));
				userList.add(user);
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			throw new DBException(e.getMessage(), e);
		}
		finally
		{
			try {
				pstmt.close();
				con.close();
			} catch (SQLException e) { 
				e.printStackTrace();
			}
		}
		return userList;
	}

}
