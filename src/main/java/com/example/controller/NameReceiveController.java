package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/name")
public class NameReceiveController {

	@RequestMapping("")
	public String index() {
		return "inputname";
	}

	@RequestMapping("/output")
	public String output(String name, Model model) {
		model.addAttribute("name", name);

		return "output";
	}

}
