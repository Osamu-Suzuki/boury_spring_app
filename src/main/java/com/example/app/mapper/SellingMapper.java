package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.Selling;

@Mapper
public interface SellingMapper {
	
	// 商品の値付け
	public void addSelling(Selling selling) ;
	
	// 商品お値付け削除
	public void deleteSelling(String itemNo);
	
	// 商品の販売価格変更
	public void chageSelling(Selling selling);
	
}
