package com.laptrinhjavaweb.Controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminSercurityController {
	@RequestMapping(value = {"/login"})
	public String index(Model model, HttpServletRequest request, HttpServletResponse response) {
		if(request.getParameter("error") != null) {
			model.addAttribute("message", "sorry, try again !!");
		}
		return "/views/login/login";
	}
	
	@RequestMapping(value = {"/403"})
	public String error(Model model, HttpServletRequest request, HttpServletResponse response) {
		return "/views/error-page/403";
	}
}
