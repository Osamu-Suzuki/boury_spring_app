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
	@GetMapping("/showitemadd")
	public String showItemAddPage() {
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
