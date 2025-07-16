package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.mapper.SellingMapper;

@Controller
public class SellingController {
	
	@Autowired
	SellingMapper sellingMapper;
	
	//	販売価格の設定
	@PostMapping()
	public String addPrice() {
		
		return "redirect:/list";
	}
	
	//	販売価格の削除
	public String deletePrice() {
		
		return "redirect:/list";
	}
	
	//	販売価格の変更
	public String changePrice() {
		
		return "redirect:/list";
	}
	

}
