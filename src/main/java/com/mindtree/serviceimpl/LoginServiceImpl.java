package com.mindtree.serviceimpl;
import java.util.List;

import com.mindtree.controller.Config;
import com.mindtree.entity.Login;
import com.mindtree.service.LoginService;

public class LoginServiceImpl implements LoginService
{
	public int validate(Login login) 
	{			return Config.getLoginDao().validate(login);			}

	
	public String add(Login login) 
	{			return Config.getLoginDao().add(login);					}

	
	public List<Login> display() 
	{			return Config.getLoginDao().display();					}
}