package com.gft.milhas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventosEdicaoController {
	
	@RequestMapping(value = "/eventos-edicao")
	public ModelAndView edicao() {
		
		ModelAndView modelAndView = new ModelAndView("eventos-edicao");
		return modelAndView;
	}
}
