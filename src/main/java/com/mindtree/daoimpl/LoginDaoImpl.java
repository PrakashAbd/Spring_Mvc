package com.mindtree.daoimpl;
import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import com.mindtree.dao.LoginDao;
import com.mindtree.entity.Login;

public class LoginDaoImpl implements LoginDao
{
	/*ApplicationContext con = new ClassPathXmlApplicationContext("Beans.xml");  
	UserDaoImpl userDao = con.getBean("a",UserDaoImpl.class);*/
	HibernateTemplate logintemplate;
	
	public LoginDaoImpl() {
		super();
	}

	public LoginDaoImpl(HibernateTemplate logintemplate) {
		super();
		this.logintemplate = logintemplate;
	}

	public HibernateTemplate getLogintemplate() {
		return logintemplate;
	}

	public void setLogintemplate(HibernateTemplate logintemplate) {
		this.logintemplate = logintemplate;
	}

	public int validate(Login login) 
	{
		try 
		{		
			if(display().stream().
			   filter(i -> i.getUsername().equals(login.getUsername()) && i.getPassword().equals(login.getPassword())).
				  toArray().length!=0)
			{
				if(login.getUsername().equals("admin") && login.getPassword().equals("admin123"))
						return 1;
				else
						return 2;
				/*if(userDao.displayAll().stream().filter(e -> e.getUsername().equals(login.getUsername()) && e.getPassword().equals(login.getPassword())).toArray().length!=0)
				{			System.out.println(2);return 2;			}
				else
				{			System.out.println(1);return 1;			}*/
			}
			else	{			System.out.println(0);return 0;			}
		
		}
		catch(Exception e){		System.out.println("error");return 0;		}	
	}
	

	public String add(Login login) 
	{		
		Session session = logintemplate.getSessionFactory().openSession();
		session.save(login);
		session.beginTransaction().commit();
		return "Added Successfully";			
	}
	
	public List<Login> display() 
	{		return logintemplate.loadAll(Login.class);			}

}