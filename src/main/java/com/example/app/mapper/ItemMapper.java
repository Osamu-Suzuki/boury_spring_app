package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.All;
import com.example.app.dto.Item;

@Mapper
public interface ItemMapper {
	
	//  商品一覧表示
	public List<All> showItemList();
	
	//	商品詳細表示
	public All showItemDetailByItemNo(String itemNo);
	
	//	商品追加
	public void addItem(Item item);
	
	//	商品取消
	public void deleteItem(String itemNo);
	
	//  商品名変更
	public void changeItemName(Item item);	

	//  商品原価変更
	public void changeItemCostPrice(Item item);

	
}
