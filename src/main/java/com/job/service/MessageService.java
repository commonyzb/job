package com.job.service;

import com.job.model.Message;

public interface MessageService {
	
	/* 添加Message */
	public int addMessage(Message Message);
   
	/*删除message*/
	public int delectMessage(int id);
	
	/*查询message*/
	public Message getMessageById(int id);
	
	/*得到message总数量*/
	public int getMessageAccount();
}
