package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.app.dto.Status;
import com.example.app.mapper.StatusMapper;

@Controller
public class StatusController {
	
	@Autowired
	StatusMapper statusMapper;

	@PostMapping("/addstatus")
	public String addStatus(Model model,
		@ModelAttribute Status status,
		RedirectAttributes redirectAttributes) {
		
		if(status.getItemStatus()!=null) {
		statusMapper.addStatusToDatabase(status);
		}
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",status.getItemNo());
								
		// リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}
	
	@PostMapping("/deletestatus")
	public String deleteStatus(Model model,
		@RequestParam String itemNo,
		RedirectAttributes redirectAttributes) {
		
		statusMapper.deleteStatus(itemNo);
		
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",itemNo);
										
        // リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}

	@PostMapping("/changestatus")
	public String changeStatus(Model model,
		@ModelAttribute Status status,
		RedirectAttributes redirectAttributes) {
		
		if(status.getItemStatus()!=null) {
		statusMapper.changeStatus(status);
		}
		// itemが持つitemNoをリダイレクトをリダイレクト先に必要なURLの一部として渡す
		redirectAttributes.addAttribute("itemNo",status.getItemNo());
										
        // リダイレクト：個別商品詳細表示ページへ
		return "redirect:/detail/{itemNo}";
	}

}
