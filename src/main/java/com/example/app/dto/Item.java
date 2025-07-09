package com.example.app.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Item {
	
	private String itemNumber;
	private String itemName;
	private Integer costPrice;
	private Integer sellingPrice;
}
