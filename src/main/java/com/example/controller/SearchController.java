package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.repository.UserDao;

@Controller
@RequestMapping("/search")
public class SearchController {

	@Autowired
	private UserDao dao;

	@RequestMapping("")
	public String index() {
		return "userinfosearch";
	}

	@RequestMapping("/infoview")
	public String infoview(String id, Model model) {
//		Integer idIntForm = Integer.parseInt(id);
		User user = dao.load(Integer.parseInt(id));
		model.addAttribute(user);
		return "userinfoview";
	}

}
