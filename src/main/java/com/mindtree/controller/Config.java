package com.mindtree.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.LoginDaoImpl;
import com.mindtree.daoimpl.UserDaoImpl;
import com.mindtree.entity.Login;
import com.mindtree.serviceimpl.LoginServiceImpl;
import com.mindtree.serviceimpl.UserServiceImpl;

public class Config 
{
	static ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");
	
	public static UserDaoImpl getUserDao()
	{
		return con.getBean("a",UserDaoImpl.class);
	}
	
	public static LoginDaoImpl getLoginDao()
	{
		return con.getBean("b",LoginDaoImpl.class);
	}
	
	public static UserServiceImpl getUserService()
	{
		return con.getBean("c",UserServiceImpl.class);
	}
	
	public static LoginServiceImpl getLoginService()
	{
		return con.getBean("d",LoginServiceImpl.class);
	}
	
	public static Login getLogin()
	{
		return con.getBean("e",Login.class);
	}
}