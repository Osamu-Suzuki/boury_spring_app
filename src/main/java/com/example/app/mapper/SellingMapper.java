package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.Selling;

@Mapper
public interface SellingMapper {
	
	//	販売状況の追加
	public void addStatusToDatabase(Selling selling);
	
	//	販売状況の変更
	public void changeStatus(Selling selling);
	
}
