package com.laptrinhjavaweb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	@RequestMapping(value = {"/", "/home"}, method = { RequestMethod.GET })
	public String index(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		System.out.println(request.getContextPath());
		return "index";
	}
	
	@RequestMapping(value = {"/Login"} , method = { RequestMethod.GET })
	public String Login(final ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "/decorators/Login";
	}
	
}
