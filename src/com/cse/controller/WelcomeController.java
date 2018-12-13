package com.cse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
@RequestMapping(value="/")
public String Dostart(Model model){
	model.addAttribute("sun","Welcome");
	return "home";
}
}
