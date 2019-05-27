package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "buygoods";
	}
	
	@RequestMapping("/totalprice")
	public String totalPrice(String goods1, String goods2, String goods3) {
		Integer totalPriceWithoutTax =
				Integer.parseInt(goods1) + Integer.parseInt(goods2) + Integer.parseInt(goods3);
		application.setAttribute("totalPriceWithoutTax", totalPriceWithoutTax);
		Integer totalPriceWithTax =
				(int)(totalPriceWithoutTax * 1.08);
		application.setAttribute("totalPriceWithTax", totalPriceWithTax);
		return "totalprice";
	}

}
