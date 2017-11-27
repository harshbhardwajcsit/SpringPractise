package com.mkyong.web.controller;

import com.mkyong.web.models.FormDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AddformData {
    @RequestMapping(value = "/Home",method = RequestMethod.POST)
    public String submit(@ModelAttribute("formDto") FormDTO formDto,
                         BindingResult result) {
        if (result.hasErrors()) {
            return "error";
        }


        System.out.println("email:"+ formDto.getEmailId());
        System.out.println("name:"+ formDto.getName());
        return "hello";
    }



}
