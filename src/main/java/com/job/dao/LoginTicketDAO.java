package com.job.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.job.model.LoginTicket;

@Mapper
public interface LoginTicketDAO {
	String TABLE_NAME=" login_ticket ";
	String INSERT_FIELDS=" userid,ticket,device,ip,expired,status ";
	String SELECT_FIELDS=" id,"+INSERT_FIELDS;
	@Select({"SELECT * FROM",TABLE_NAME," WHERE id = #{id}"})
	public LoginTicket getLoginTicketById(int id);
	
	@Insert({"INSERT INTO",TABLE_NAME,"(",INSERT_FIELDS,")"," VALUES(#{userid},#{ticket},#{device},#{ip},#{expired},#{status})"})
	public int addLoginTicket(LoginTicket loginTicket);
	
	@Update({"UPDATE",TABLE_NAME,"SET ticket = #{ticket} WHERE id = #{id}"})
	public int UpdateTicket(String ticket,int id);
	
	@Update({"UPDATE",TABLE_NAME,"SET device = #{device} WHERE id = #{id}"})
	public int UpdateDevice(String device,int id);

	@Update({"UPDATE",TABLE_NAME,"SET ip = #{ip} WHERE id = #{id}"})
	public int UpdateIp(String ip,int id);
	
	@Update({"UPDATE",TABLE_NAME,"SET expired = #{expired} WHERE id = #{id}"})
	public int UpdateExpired(Date expired,int id);
	
	@Update({"UPDATE",TABLE_NAME,"SET status = 0 WHERE id = #{id}"})
	public int DelectTicket(int id);

}