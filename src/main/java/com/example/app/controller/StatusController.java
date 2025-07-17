package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.app.dto.Status;
import com.example.app.mapper.StatusMapper;

@Controller
public class StatusController {
	
	@Autowired
	StatusMapper statusMapper;

	@PostMapping("/addstatus")
	public String addStatus(Model model,
		@ModelAttribute Status status) {
		statusMapper.addStatusToDatabase(status);
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
	
	@PostMapping("/deletestatus")
	public String deleteStatus(Model model,
		@RequestParam String itemNo) {
		statusMapper.deleteStatus(itemNo);
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

	@PostMapping("/changestatus")
	public String changeStatus(Model model,
		@ModelAttribute Status status) {
		statusMapper.changeStatus(status);	
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

}
