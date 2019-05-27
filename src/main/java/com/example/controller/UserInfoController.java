package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;

@Controller
@RequestMapping("/user")
public class UserInfoController {
	
	@RequestMapping("")
	public String index() {
		return "inputuserinfo";
	}
	@RequestMapping("/output")
	public String output(String name, String age, String address, Model model) {
		User user = new User();
		user.setName(name);
		user.setAge(Integer.parseInt(age));
		user.setAddress(address);
		model.addAttribute(user);
		return "outputuserinfo";
	}

}
