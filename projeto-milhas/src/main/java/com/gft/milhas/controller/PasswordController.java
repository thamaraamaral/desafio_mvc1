package com.gft.milhas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.gft.milhas.models.PasswordModel;

@Controller
public class PasswordController {

	@RequestMapping(value = "/password")
	public ModelAndView password() {
		ModelAndView modelAndView = new ModelAndView("password");
		
		modelAndView.addObject("model", new PasswordModel());
		
		return modelAndView;
	}
	
}
