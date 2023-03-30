package com.ty;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HomeController 
{

	@RequestMapping("/home")//send the url to web page
	public String home()
	{
		return "index";
	}
//	@RequestMapping("/about")//send th url to webpage
//	public String about()
//	{
//		return "about";
//	}

}
