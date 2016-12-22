package com.manage.controller.sys;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/menu")
public class MenuController {

	@RequestMapping("/view")
	public String viewMenu(ModelMap modelMap) {
		String message = "SpringMVC";  
        //为model添加Attribute  
		modelMap.addAttribute("message",message);  
        return "/sys/menu"; 
	}

}
