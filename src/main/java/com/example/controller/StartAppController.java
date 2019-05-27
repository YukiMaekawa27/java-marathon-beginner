package com.example.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;

@Controller
@RequestMapping("/item")
public class StartAppController {
	
	@Autowired
	private ServletContext application;
	
	@Autowired
	private HttpSession session;
	
	@RequestMapping("")
	public String index() {
		Item note = new Item();
		note.setName("手帳ノート");
		note.setPrice(1000);
		application.setAttribute("note", note);
		Item pencils = new Item();
		pencils.setName("文房具セット");
		pencils.setPrice(1500);
		application.setAttribute("pencils", pencils);
		Item file = new Item();
		file.setName("ファイル");
		file.setPrice(2000);
		application.setAttribute("file", file);
		
		Item noteInCart = new Item();
		session.setAttribute("noteInCart", noteInCart);
		Item pencilsInCart = new Item();
		session.setAttribute("pencilsInCart", pencilsInCart);
		Item fileInCart = new Item();
		session.setAttribute("file", fileInCart);
		
		
		return "itemandcart";
	}

}
