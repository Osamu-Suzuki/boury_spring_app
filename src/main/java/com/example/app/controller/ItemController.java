package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.dto.Item;
import com.example.app.mapper.ItemMapper;

@Controller
public class ItemController {
	
	@Autowired
	ItemMapper itemMapper;
	
	//	一覧を表示
	@GetMapping("/list")
	public String showList(Model model) {
		List<Item> showItems = itemMapper.showItemList();
		model.addAttribute("showItems",showItems);
		return "list";
	}

	//	商品の追加
	@PostMapping("/additem")
	public String addItemToDatabase(Model model,
		@ModelAttribute Item item) {
		//	在庫商品登録と値付け
		itemMapper.addItem(item);
		itemMapper.addItemSelling(item);
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
