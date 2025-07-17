package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.app.dto.Selling;
import com.example.app.mapper.SellingMapper;

@Controller
public class SellingController {
	
	@Autowired
	SellingMapper sellingMapper;
	
	//	販売価格の設定
	@PostMapping("/addselling")
	public String addPrice(Model model,
		@ModelAttribute Selling selling) {
		sellingMapper.addSellingToDatabase(selling);
		return "redirect:/list";
	}
	
	//	販売価格の削除
	@PostMapping("/deleteselling")
	public String deletePrice(Model model,
		@RequestParam String itemNo) {
		sellingMapper.deleteSelling(itemNo);
		return "redirect:/list";
	}
	
	//	販売価格の変更
	@PostMapping("/changeselling")
	public String changePrice(Model model,
		@ModelAttribute Selling selling) {
		sellingMapper.chageSelling(selling);
		return "redirect:/list";
	}
	

}
