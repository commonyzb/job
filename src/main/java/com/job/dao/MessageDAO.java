package com.job.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Message;

@Mapper
public interface MessageDAO {
	String TABLE_NAME = " message";
    String INSERT_FIELDS=" `from`,`to`,msg,date,status ";
    
    /* 根据ID查询响应的Message*/
    @Select({"SELECT * FROM",TABLE_NAME,"WHERE id = #{id}"})
    public Message getMesageById(int id);
    
    /* 添加message */
    @Insert({"INSERT INTO",TABLE_NAME,"(",INSERT_FIELDS,")"," VALUES(#{from},#{to},#{msg},#{date},#{status})"})
    public int addMessage(Message message);
    
    /*更新Message实体中的From字段*/
    @Update({"UPDATE",TABLE_NAME,"SET `from` = #{from} WHERE id = #{id}"})
	public int UpdateFrom(String from,int id);
    
    /*更新Message实体中的to字段*/
    @Update({"UPDATE",TABLE_NAME,"SET `to` = #{to} WHERE id = #{id}"})
	public int UpdateTo(String to,int id);
    
    /*更新Message实体中的msg字段*/
    @Update({"UPDATE",TABLE_NAME,"SET msg = #{msg} WHERE id = #{id}"})
	public int UpdateMsg(String msg,int id);

    /*更新Message实体中的Date字段*/
    @Update({"UPDATE",TABLE_NAME,"SET date = #{date} WHERE id = #{id}"})
	public int UpdateDate(Date date,int id);
    
    /*更新Message实体中的status字段用于标记是否可用*/
    @Update({"UPDATE",TABLE_NAME,"SET status = 0 WHERE id = #{id}"})
	public int DelectMessage(int id);
}