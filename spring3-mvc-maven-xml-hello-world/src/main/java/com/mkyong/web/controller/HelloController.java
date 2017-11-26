package com.mkyong.web.controller;

import com.mkyong.web.models.FormDTO;
import com.mkyong.web.models.Product;
import com.mkyong.web.services.ProductManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showform(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "form";

	}

	@RequestMapping(value = "/Home",method =RequestMethod.POST)
	public String submit(@ModelAttribute("formDto") FormDTO formDto,
						 BindingResult result) {
		if (result.hasErrors()) {
			return "error";
		}
		System.out.println(formDto.getEmailId());
		System.out.println(formDto.getName());
		return "hello";
	}

}