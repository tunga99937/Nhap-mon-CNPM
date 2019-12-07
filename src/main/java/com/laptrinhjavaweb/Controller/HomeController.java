package com.laptrinhjavaweb.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.laptrinhjavaweb.service.CategoryService;
import com.laptrinhjavaweb.service.ProductService;

@Controller
public class HomeController {
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService proService;
	
	@RequestMapping(value = {"/", "/home", "/product/Men"}, method = { RequestMethod.GET })
	public String index(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("category", categoryService.display());
		model.addAttribute("product", proService.display());
		return "/views/web/home";
	}
	
	@RequestMapping(value = {"/error/403"}, method = { RequestMethod.GET })
	public String error(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		System.out.println(request.getContextPath());
		return "/views/error-page/403";
	}
	
	@RequestMapping(value = {"/cart"}, method = { RequestMethod.GET })
	public String cart(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		return "/views/web/cart";
	}
	
	@RequestMapping(value = {"/checkout"}, method = { RequestMethod.GET })
	public String checkout(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("product", proService.display());
		System.out.println(request.getContextPath());
		return "/views/web/checkout";
	}
	
	@RequestMapping(value = {"/contact"}, method = { RequestMethod.GET })
	public String contact(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		System.out.println(request.getContextPath());
		return "/views/web/contact";
	}
	
	@RequestMapping(value = {"/single_product"}, method = { RequestMethod.GET })
	public String indes(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		System.out.println(request.getContextPath());
		return "/views/web/single_product";
	}
	
	@RequestMapping(value = {"/Woman"}, method = { RequestMethod.GET })
	public String woman(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("category", categoryService.display());
		model.addAttribute("product", proService.display());
		return "/views/web/womanProduct";
	}
	
	@RequestMapping(value = {"/Kid"}, method = { RequestMethod.GET })
	public String kids(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("category", categoryService.display());
		model.addAttribute("product", proService.display());
		return "/views/web/kidProduct";
	}
	
	@RequestMapping(value = {"/Men"}, method = { RequestMethod.GET })
	public String men(final ModelMap model, final HttpServletRequest request, final HttpServletResponse response) {
		model.addAttribute("category", categoryService.display());
		model.addAttribute("product", proService.display());
		return "/views/web/menProduct";
	}
	
}
