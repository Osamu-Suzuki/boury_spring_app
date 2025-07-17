package com.example.app.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.app.dto.Status;

@Mapper
public interface StatusMapper {
	
	//	販売状況の追加
	public void addStatusToDatabase(Status status);
	
	//	販売状況の削除
	public void deleteStatus(String itemNo);
	
	//	販売状況の変更
	public void changeStatus(Status status);
	
}
