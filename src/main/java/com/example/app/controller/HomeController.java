package com.example.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	
	//	トップページを表示
	public String showHome() {
		return "home";		
	}
	
	//	一覧を表示
	public String showList() {
		return "list";		
	}
	
	//	商品の追加
	public String addItem(String itemNumber, String itemName, Integer costPrice, Integer sellingPrice) {
		//	在庫商品登録と値付け
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
	
	//	商品情報の変更
	public String changeItem(String itemNumber, String itemName, Integer costPrice, Integer sellingPrice) {
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
	
	//	商品情報の取消
	public String deleteItem() {
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
	
	//	販売状況の登録
	public String addStatus(String status) {
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
		
	//	販売状況の変更
	public String changeStatus() {
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";		
	}
	
	//	販売状況の取消
	public String deleteStatus() {
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}
}
