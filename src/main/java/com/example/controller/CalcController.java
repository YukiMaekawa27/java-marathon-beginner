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
	public String output(int num1, int num2) {
		session.setAttribute("number", num1 * num2);
		return "outputvalue";
	}

	@RequestMapping("/outputsecondtime")
	public String output() {
		return "outputvalue2";
	}
}
