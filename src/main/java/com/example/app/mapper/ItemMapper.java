package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.Item;

@Mapper
public interface ItemMapper {
	
	//  商品一覧表示
	public List<Item> showItemList();
	
	//	商品追加
	public void addItem(String itemNumber, String itemName, Integer costPrice, Integer sellingPrice) ;
	//	商品取消
	public void deleteItem(String itemNumber);
	
	//  商品登録内容変更
	//	商品番号の変更
	public void changeItemNumber(String itemNumber) ;
	
	//	商品名の変更
	public void changeItemName(String itemName);
	
	//	仕入れ価格の変更
	public void changeCostPrice(Integer costPrice);
	
	//	販売価格の変更
	public void changeSellingPrice(Integer sellingPrice);
	
}
