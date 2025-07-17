package com.example.app.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class All{
	
	private String itemNo;
	private String itemName;
	private Integer costPrice;
	private Integer sellingPrice;
	private String itemStatus;
	
}
