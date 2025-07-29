package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.dto.Selling;
import com.example.app.mapper.SellingMapper;

@Controller
public class SellingController {
	
	@Autowired
	SellingMapper sellingMapper;
	
	//	販売価格の設定
	@PostMapping("/addselling")
	public String addPrice(Model model,
		@ModelAttribute Selling selling,
		RedirectAttributes redirectAttributes) {
		
		if(selling.getSellingPrice()!=null) {
		sellingMapper.addSellingToDatabase(selling);
		}
		
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",selling.getItemNo());
				
		//	リダイレクト：一覧表示ページへ
		return "redirect:/detail/{itemNo}";
	}
	
	//	販売価格の削除
	@PostMapping("/deleteselling")
	public String deletePrice(Model model,
		@RequestParam String itemNo,
		RedirectAttributes redirectAttributes) {
		
		sellingMapper.deleteSelling(itemNo);
		
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",itemNo);
						
		// リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}
	
	//	販売価格の変更
	@PostMapping("/changeselling")
	public String changePrice(Model model,
		@ModelAttribute Selling selling,
		RedirectAttributes redirectAttributes) {
		
		if(selling.getSellingPrice()!=null) {
		sellingMapper.changeSelling(selling);
		}
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",selling.getItemNo());
								
		// リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}
	

}
