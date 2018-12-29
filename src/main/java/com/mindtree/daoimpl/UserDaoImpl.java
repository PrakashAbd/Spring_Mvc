package com.mindtree.daoimpl;
import java.util.List;
import org.hibernate.Session;
import org.springframework.orm.hibernate4.HibernateTemplate;
import com.mindtree.dao.UserDao;
import com.mindtree.entity.User;

public class UserDaoImpl implements UserDao
{
	HibernateTemplate template;
	
	public UserDaoImpl() {
		super();
	}

	public UserDaoImpl(HibernateTemplate template) {
		super();
		this.template = template;
	}
	
	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public String save(User u) 
	{
		Session session = template.getSessionFactory().openSession();
		session.save(u);
		session.beginTransaction().commit();
		
		return "Added Successfully";
	}
	
	public List<User> displayAll()
	{		return template.loadAll(User.class);			}


}