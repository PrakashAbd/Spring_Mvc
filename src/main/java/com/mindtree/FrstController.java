package com.mindtree.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.mindtree.entity.Login;
import com.mindtree.entity.User;
import com.mindtree.serviceimpl.LoginServiceImpl;
import com.mindtree.serviceimpl.UserServiceImpl;

@Controller
public class FrstController 
{
	LoginServiceImpl loginService = new LoginServiceImpl();
	UserServiceImpl userService = new UserServiceImpl();
	
	
	@RequestMapping("/login")
	public String func()
	{	
		
		return "loginpage";			
	}
	
	
	@RequestMapping(value = "/userpage")
	public ModelAndView func1(@ModelAttribute Login obj)
	{	
		LoginServiceImpl loginService = new LoginServiceImpl();
		System.out.println(obj.getUsername()+"" +obj.getPassword());
		int num = loginService.validate(obj);
		return new ModelAndView( (num > 0)? ( (num==1)? "HomePage" : "UserHomePage") : "errorpage");			
	}
	
	
	@RequestMapping(value="/addUser")
	public String fun2()
	{
		return "userpage";	
	}
	
	
	@RequestMapping(value="/validate")
	public ModelAndView func3(@ModelAttribute("u") User u)
	{
		UserServiceImpl userService = new UserServiceImpl();
		LoginServiceImpl loginService = new LoginServiceImpl();
		System.out.println(userService.save(u));
		Login login = new Login();
		login.setUsername(u.getUsername());
		login.setPassword(u.getPassword());
		
		System.out.println(loginService.add(login));
		
		return new ModelAndView("redirect:/display");
	}
	
	
	@RequestMapping("/display")
	public ModelAndView func4()
	{
		List<User> list = userService.displayAll();
		return new ModelAndView("display","list1",list);
	}
	
	@RequestMapping("/displayAll")
	public ModelAndView func5()
	{
		List<Login> list = loginService.display();
		return new ModelAndView("displayAll","list",list);	
	}
}
