package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//	トップページを表示
	@GetMapping("/home")
	public String showHome() {
		return "home";		
	}
	
	// 商品追加ページを表示
	@GetMapping("/add")
	public String showItemAddPage() {
		return "itemAdd";
	}
	
}
