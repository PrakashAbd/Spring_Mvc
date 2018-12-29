package com.mindtree.serviceimpl;
import java.util.List;
import com.mindtree.controller.Config;
import com.mindtree.entity.User;
import com.mindtree.service.UserService;

public class UserServiceImpl implements UserService
{
	public String save(User u) 
	{	
		return Config.getUserDao().save(u);
	}

	public List<User> displayAll() 
	{
		return Config.getUserDao().displayAll();
	}

	@Override
	public User displayById(int userId) 
	{
		return null;
	}
	
}