package com.example.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/calc")
public class CalcController {

	@Autowired
	private HttpSession session;

	@RequestMapping("")
	public String index() {
		return "inputvalue";
	}

	@RequestMapping("/output")
	public String output(String num1, String num2) {
		session.setAttribute("number", Integer.parseInt(num1) * Integer.parseInt(num2));
		return "outputvalue";
	}

	@RequestMapping("/outputsecondtime")
	public String output() {
		return "outputvalue2";
	}
}
