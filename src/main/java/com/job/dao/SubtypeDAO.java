package com.job.dao;

import java.util.ArrayList;


import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Subtype;

@Mapper
public interface SubtypeDAO {//职务子表
	String TABLE_NAME="subtype";
	String INSERT_FIELDS="id, supertypeId, typename, hit ";

	// id;//子行业类别id  supertype;//父类id
	// typename;//子类行业名 hit;//点击量
	/*
	 * 增加一个职务
	 * */
	@Insert({"INSERT INTO ", TABLE_NAME,"(",INSERT_FIELDS,") VALUES (",
		"#{id},#{supertypeid},#{typename},#{hit})"})
	public int addSubtype(Subtype subtype);
	
	
	
	/*
	 * 根据id修改一个职务名称
	 * */
	@Update({"UPDATE ",TABLE_NAME," SET typename=#{typename} WHERE id =#{id}"})
	
	public int setSubtype(@Param("id") String id,@Param("typename") String typename);
	
	/*
	 * 根据id查询职务信息
	 * */
	@Select({"SELECT * FROM ",TABLE_NAME," WHERE id= #{id}"})
	public Subtype getSubtype(String id);
	
	/*
	 * 查询所有职务信息
	 * */
	@Select({"SELECT * FROM ",TABLE_NAME})
	public ArrayList<Subtype> getAll();
}