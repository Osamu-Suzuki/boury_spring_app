package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ItemController {
	
	//	一覧を表示
	@GetMapping("/list")
	public String showList() {
		return "list";
	}

	//	商品の追加
	@PostMapping("/add")
	public String addItemToDatabase(String itemNumber, String itemName, Integer costPrice, Integer sellingPrice) {
		//	在庫商品登録と値付け

		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
	
	//	商品情報の取消
	@GetMapping("/delete")
	public String deleteItemFromDatabase(String itemNumber) {
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

}
