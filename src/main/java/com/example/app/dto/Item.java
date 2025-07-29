package com.example.app.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	
	@NotBlank(message = "入力必須項目です")
	private String itemNo;
	@NotBlank(message = "入力必須項目です")
	private String itemName;
	@NotNull(message = "入力必須項目です")
	private Integer costPrice;
	
}
