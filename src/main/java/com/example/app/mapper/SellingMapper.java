package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SellingMapper {
	
	//	販売状況の追加
	public void addStatus(String status);
	
	//	販売状況の変更
	public void changeStatus();
	
	//	販売状況の取消
	public void deleteStatus();
	
}
