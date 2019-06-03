package com.job.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Message;

@Mapper
public interface MessageDAO {
	String TABLE_NAME = " message";
    String INSERT_FIELDS="id, `from`,`to`,msg,date,status ";
    
    /* 根据ID查询响应的Message*/
    @Select({"SELECT * FROM",TABLE_NAME,"WHERE id = #{id}"})
    public Message getMesageById(int id);
    
    /* 添加message */
    @Insert({"INSERT INTO",TABLE_NAME,"(",INSERT_FIELDS,")"," VALUES(#{id},#{from},#{to},#{msg},#{date},#{status})"})
    public int addMessage(Message message);
    
    /*更新Message实体中的From字段*/
    @Update({"UPDATE",TABLE_NAME,"SET `from` = #{from} WHERE id = #{id}"})
	public int UpdateFrom(@Param("from") String from,@Param("id") int id);
    
    /*更新Message实体中的to字段*/
    @Update({"UPDATE",TABLE_NAME,"SET `to` = #{to} WHERE id = #{id}"})
	public int UpdateTo(@Param("to") String to,@Param("id") int id);
    
    /*更新Message实体中的msg字段*/
    @Update({"UPDATE",TABLE_NAME,"SET msg = #{msg} WHERE id = #{id}"})
	public int UpdateMsg(@Param("msg") String msg,@Param("id") int id);

    /*更新Message实体中的Date字段*/
    @Update({"UPDATE",TABLE_NAME,"SET date = #{date} WHERE id = #{id}"})
	public int UpdateDate(@Param("date") Date date,@Param("id") int id);
    
    /*更新Message实体中的status字段用于标记是否可用*/
    @Update({"UPDATE",TABLE_NAME,"SET status = 0 WHERE id = #{id}"})
	public int DelectMessage(int id);
}