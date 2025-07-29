package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.dto.All;
import com.example.app.dto.Item;
import com.example.app.mapper.ItemMapper;

@Controller
public class ItemController {

	@Autowired
	ItemMapper itemMapper;

	// 一覧を表示
	@GetMapping("/list")
	public String showList(Model model) {
		List<All> showItems = itemMapper.showItemList();
		model.addAttribute("showItems", showItems);
		return "allList";
	}
	// 販売価格が未登録の商品のみ表示
	@GetMapping("/nosellinglist")
	public String showNoSellingList(Model model) {
		List<All> showNoSellingItems = itemMapper.showNoSellingItemList();
		model.addAttribute("showNoSellingItems", showNoSellingItems);
		return "allNoSellingList";
	}
	
	// 販売状況が未登録の商品のみ表示
	@GetMapping("/nostatuslist")
	public String showNoStatusList(Model model) {
		List<All> showNoStatusItems = itemMapper.showNoStatusItemList();
		model.addAttribute("showNoStatusItems", showNoStatusItems);
		return "allNoStatusList";
	}
	
	// 商品詳細ページを表示
	@GetMapping("/detail/{itemNo}")
	public String showDetail(Model model,
		@PathVariable String itemNo) {
		
		All all = itemMapper.showItemDetailByItemNo(itemNo);
		model.addAttribute(all);
		
		return "itemDetail";
	}

	// 商品の追加
	@PostMapping("/additem")
	public String addItemToDatabase(Model model,
			@Validated @ModelAttribute Item item,
			BindingResult bindingResult,
			RedirectAttributes redirectAttributes) {
		
		// 入力にエラーがある場合
		if(bindingResult.hasErrors()) {
			return "itemAdd";
		}
		
		// 在庫商品登録
		itemMapper.addItem(item);
		
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",item.getItemNo());
		
		// リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}

	// 商品情報の取消
	@PostMapping("/deleteitem")
	public String deleteItemFromDatabase(Model model,
		@RequestParam String itemNo) {
		
		itemMapper.deleteItem(itemNo);
		
		//	リダイレクト：一覧表示ページへ
		return "redirect:/list";
	}

	// 商品情報の変更
	@PostMapping("/changeitem")
	public String changeItemData(Model model,
		@ModelAttribute Item item,
		RedirectAttributes redirectAttributes) {
		
		if(item.getItemName() != null && item.getItemName() !="") {
			itemMapper.changeItemName(item);				
		}
		if(item.getCostPrice() != null) {
			itemMapper.changeItemCostPrice(item);						
		}
		
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",item.getItemNo());
		
		// リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}
}