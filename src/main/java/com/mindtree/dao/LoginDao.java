package com.mindtree.dao;

import java.util.List;

import com.mindtree.entity.Login;

public interface LoginDao 
{
	int validate(Login login);
	List<Login> display();
	String add(Login login);
}
