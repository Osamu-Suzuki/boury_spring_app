package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.example.app.dto.Selling;
import com.example.app.mapper.SellingMapper;

@Controller
public class SellingController {
	
	@Autowired
	SellingMapper sellingMapper;

	@PostMapping("/addstatus")
	public String addStatus(Model model,
		@ModelAttribute Selling selling) {
		sellingMapper.addStatusToDatabase(selling);
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

	@PostMapping("/changestatus")
	public String changeStatus(Model model,
		@ModelAttribute Selling selling) {
		sellingMapper.changeStatus(selling);
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

}
