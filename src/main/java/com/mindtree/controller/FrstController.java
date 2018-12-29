package com.mindtree.controller;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.mindtree.entity.Login;
import com.mindtree.entity.User;

@Controller
public class FrstController 
{	
	@RequestMapping("/login")
	public String func()
	{			return "loginpage";			}
	
	
	@RequestMapping(value = "/userpage")
	public ModelAndView func1(@ModelAttribute Login obj)
	{	
		int num = Config.getLoginService().validate(obj);
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
		System.out.println(Config.getUserService().save(u));
		
		Login login = Config.getLogin();
		login.setUsername(u.getUsername());
		login.setPassword(u.getPassword());
		
		System.out.println(Config.getLoginService().add(login));
		
		return new ModelAndView("redirect:/display");
	}
	
	
	@RequestMapping("/display")
	public ModelAndView func4()
	{
		List<User> list = Config.getUserService().displayAll();
		return new ModelAndView("display","list1",list);
	}
	
	@RequestMapping("/displayAll")
	public ModelAndView func5()
	{
		List<Login> list = Config.getLoginService().display();
		return new ModelAndView("displayAll","list",list);	
	}
}
