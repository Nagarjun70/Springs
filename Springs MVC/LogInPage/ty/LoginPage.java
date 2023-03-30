package com.ty;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller

public class LoginPage 
{

	@RequestMapping("/home")//send the url to web page
	public String home()
	{
		return "login";
	}
	
	@RequestMapping(path="/process",method=RequestMethod.POST)
	
	public String getForm(@RequestParam("emial")String useremail,@RequestParam("name")String username,@RequestParam("password")String userpassword,Model model)
	
	{
		System.out.println(useremail);
		System.out.println(username);
		System.out.println(userpassword);
		model.addAttribute("name",username);
		model.addAttribute("email",useremail);
		model.addAttribute("password",userpassword);
		return "success";
	}
}