package com.job.service;

import com.job.model.LoginTicket;

public interface LoginTicketService {
   
	/* 添加登录ticket */
	public int addLoginTicket(LoginTicket loginTicket);
   
	/*删除登录ticket*/
	public int delectLoginTicket(int id);
	
	/*查询登录ticket*/
	public LoginTicket getLoginTicketById(int id);
	
	/*得到登录ticket数量*/
	public int getLoginTicketAccount();
	
	
}
