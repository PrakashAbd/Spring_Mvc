package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.User;

public interface UserService 
{
	List<User> displayAll();
	User displayById(int userId);
	String save(User u);
}
