package com.mindtree.serviceimpl;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mindtree.daoimpl.UserDaoImpl;
import com.mindtree.entity.User;
import com.mindtree.service.UserService;

public class UserServiceImpl implements UserService
{
	ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");  
	UserDaoImpl userDao = con.getBean("a",UserDaoImpl.class);
	
	public String save(User u) 
	{	
		return userDao.save(u);
	}

	public List<User> displayAll() 
	{
		return userDao.displayAll();
	}

	@Override
	public User displayById(int userId) 
	{
		return null;
	}
	
}