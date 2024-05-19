package com.Strange.ToDoListwithSpringBoot.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class loginController {
	
	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@RequestMapping("login-jsp")
	public String sayHelloJsp(@RequestParam String name,ModelMap model) {
		model.put("name", name);
		logger.info("This is the {}",name);
		return "login";
	}

}
