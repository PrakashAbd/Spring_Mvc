package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.User;

public interface UserDao 
{
	public String save(User u);
	List<User> displayAll();
	
}
