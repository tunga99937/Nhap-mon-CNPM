package com.laptrinhjavaweb.Controller.admin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AdminHomeController {
	@RequestMapping(value = {"/admin", "admin/home"} , method = RequestMethod.GET)
	public String index(final ModelMap model, HttpServletRequest request, HttpServletResponse response) {
		return "/views/admin/admin";
	}
}
