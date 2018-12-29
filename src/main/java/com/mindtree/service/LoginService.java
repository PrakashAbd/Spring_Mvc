package com.mindtree.service;
import java.util.List;

import com.mindtree.entity.Login;

public interface LoginService 
{
	int validate(Login login);
	String add(Login login);
	List<Login> display();
}
