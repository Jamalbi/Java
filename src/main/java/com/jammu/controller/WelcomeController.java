package com.jammu.controller;


	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.servlet.ModelAndView;

	@Controller
	public class WelcomeController {
	@GetMapping("/wecome")	
	public ModelAndView getWelcome() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Welcome to my world");
		mav.setViewName("welcome");
		return mav;
	}
		
	@GetMapping("/greet")	
	public ModelAndView greet() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","Hello team");
		return mav;
		
	}

	}


