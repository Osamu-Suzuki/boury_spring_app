package com.example.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.dto.Item;

@Controller
public class HomeController {
	
	//	トップページを表示
	@GetMapping("/home")
	public String showHome() {
		return "home";		
	}
	
	// 商品追加ページを表示
	@GetMapping("/showitemadd")
	public String showItemAddPage(Model model) {
		// 商品情報を格納するためのItemオブジェクトを生成
		Item item = new Item();
		// モデルにItemオブジェクトを追加	
		model.addAttribute("item", item);
		return "itemAdd";
	}
	
	// 商品取消ページを表示
	@GetMapping("/showitemdelete")
	public String showItemDeletePage() {
		return "itemDelete";
	}
	
	// 商品変更ページを表示
	@GetMapping("/showitemchange")
	public String showItemChangePage() {
		return "itemChange";
	}
	
	// 販売価格登録ページを表示
	@GetMapping("/showsellingadd")
	public String showSellingAddPage() {
		return "sellingAdd";
	}
	
	// 販売価格登録ページを表示
	@GetMapping("/showsellingdelete")
	public String showSellingDeletePage() {
		return "sellingDelete";
	}
	
	// 販売価格変更ページを表示
	@GetMapping("/showsellingchange")
	public String showSellingChangePage() {			
		return "sellingChange";
	}
	
	// 販売状況登録ページを表示
	@GetMapping("/showstatusadd")
	public String showStatusAddPage() {
		return "statusAdd";
	}
	
	// 販売状況登録ページを表示
	@GetMapping("/showstatusdelete")
	public String showStatusDeletePage() {
		return "statusDelete";
	}
	
	// 販売状況変更ページを表示
	@GetMapping("/showstatuschange")
	public String showStatusChangePage() {			
		return "statusChange";
	}
	
}
