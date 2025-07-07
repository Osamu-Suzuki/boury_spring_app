package com.example.app.controller;

import org.springframework.stereotype.Controller;

@Controller
public class SellingController {

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
