package com.Strange.ToDoListwithSpringBoot.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	
	@RequestMapping("say-hello")
	@ResponseBody
	public String sayHello() {
		return "Hello,what are you doing";
	}
	
	@RequestMapping("say-hello-html")
	@ResponseBody
	public String sayHelloHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html lang=\"en\">");
		sb.append("<head>");
		sb.append("<title>HTML 5 Boilerplate</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("this is body");
		sb.append(" </body>");
		sb.append(" </html>");
		
		
		return sb.toString();
	}
	
	@RequestMapping("say-hello-jsp")
	public String sayHelloJsp() {
		return "sayHello";
	}
	

}
