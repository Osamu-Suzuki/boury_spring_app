package com.example.app.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.All;
import com.example.app.dto.Item;

@Mapper
public interface ItemMapper {
	
	//  商品一覧表示
	public List<All> showItemList();
	
	//	商品追加
	public void addItem(Item item) ;
	
	//	商品取消
	public void deleteItem(String itemNo);
	
	//  商品登録内容変更
	public void chageItemInfo(Item item);
	
}
