package com.laptrinhjavaweb.Controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminSercurityController {
	@RequestMapping(value = {"/login"})
	public String index() {
		return "/views/login/login";
	}
}
