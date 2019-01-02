package com.mindtree.serviceimpl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.LoginDaoImpl;
import com.mindtree.entity.Login;
import com.mindtree.service.LoginService;

public class LoginServiceImpl implements LoginService
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");  
	LoginDaoImpl loginDao = con.getBean("b",LoginDaoImpl.class);
	public int validate(Login login) 
	{
		return loginDao.validate(login);			
	}

	
	public String add(Login login) 
	{			return loginDao.add(login);					}

	
	public List<Login> display() 
	{			return loginDao.display();					}
}