package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.Item;

@Mapper
public interface ItemMapper {
	
	//  商品一覧表示
	public List<Item> showItemList();
	
	//	商品追加(販売価格の初期値も同時登録)
	public void addItem(Item item) ;
	public void addItemSelling(Item item) ;
	
	//	商品取消
	public void deleteItem(String itemNo);
	public void deleteItemSelling(String itemNo);
	
	//  商品登録内容変更
	public void chageItemInfo(Item item);
	public void chageSellingInfo(Item item);
	
}
