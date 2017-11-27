package com.mkyong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class ShowForm {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showform(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "form";

	}


}