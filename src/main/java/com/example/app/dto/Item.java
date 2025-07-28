package com.example.app.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	@NotBlank(message = "商品番号を入力してください")
	private String itemNo;
	@NotBlank(message = "商品名を入力してください")
	private String itemName;
	@NotBlank(message = "原価を入力してください")
	private Integer costPrice;
	
}
