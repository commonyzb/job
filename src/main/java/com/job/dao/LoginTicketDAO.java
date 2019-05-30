package com.job.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.hibernate.validator.constraints.ParameterScriptAssert;

import com.fasterxml.jackson.annotation.JacksonInject.Value;
import com.job.model.LoginTicket;

@Mapper
public interface LoginTicketDAO {
	String TABLE_NAME=" login_ticket ";
	String INSERT_FIELDS=" userid,ticket,device,ip,expired,status ";
	String SELECT_FIELDS=" id,"+INSERT_FIELDS;
	
	
	/*根据Id查询LoginTicket*/
	@Select({"SELECT * FROM",TABLE_NAME," WHERE id = #{id}"})
	public LoginTicket getLoginTicketById(int id);
	
	
	/*向表中添加LoginTicket*/
	@Insert({"INSERT INTO",TABLE_NAME,"(",INSERT_FIELDS,")"," VALUES(#{userid},#{ticket},#{device},#{ip},#{expired},#{status})"})
	public int addLoginTicket(LoginTicket loginTicket);
	
	/*更新LoginTicket实体中ticket字段*/
	@Update({"UPDATE",TABLE_NAME,"SET ticket = #{ticket} WHERE id = #{id}"})
	public int UpdateTicket(@Param("ticket") String ticket,@Param("id") int id);
	
	/*更新LoginTicket实体中device字段*/
	@Update({"UPDATE",TABLE_NAME,"SET device = #{device} WHERE id = #{id}"})
	public int UpdateDevice(@Param("device") String device,@Param("id") int id);

	/*更新LoginTicket实体中ip字段*/
	@Update({"UPDATE",TABLE_NAME,"SET ip = #{ip} WHERE id = #{id}"})
	public int UpdateIp(@Param("ip") String ip,@Param("id") int id);
	
	/*更新LoginTicket实体中expried字段*/
	@Update({"UPDATE",TABLE_NAME,"SET expired = #{expired} WHERE id = #{id}"})
	public int UpdateExpired(@Param("expired") Date expired,@Param("id") int id);
	
	/*更新LoginTicket实体中status字段用于标记是否可用*/
	@Update({"UPDATE",TABLE_NAME,"SET status = 0 WHERE id = #{id}"})
	public int DelectTicket(int id);

}