package com.ty;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
		@RequestMapping("/home")
		public String home(Model model)
		{
				model.addAttribute("id", 101);
				model.addAttribute("name", "ARJUN");
				model.addAttribute("age", 23);
				List<String> friends = new ArrayList<String>();
				friends.add("KARUNA");
				friends.add("ARYAA");
				friends.add("NAGARJUN");
				
				model.addAttribute("f", friends);
				return "index";
				
	 
		}
//	@RequestMapping("/help")
//	public ModelAndView help() {
//		ModelAndView view = new ModelAndView();
//		view.addObject("id", 101);
//		view.addObject("name", "Arjun");
//
//		view.setViewName("index1");
//
//		return view;
//	}
}