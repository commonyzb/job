package com.job.serviceImpl;

import org.springframework.stereotype.Service;

import com.job.dao.MessageDAO;
import com.job.model.Message;
import com.job.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService{

	private MessageDAO MessageDao;
	
	//添加Message
	@Override
	public int addMessage(Message Message) {
		// TODO Auto-generated method stub
		return MessageDao.addMessage(Message);
	}

	//删除Message
	@Override
	public int delectMessage(int id) {
		// TODO Auto-generated method stub
		return MessageDao.DelectMessage(id);
	}

	//根据Id查询Message
	@Override
	public Message getMessageById(int id) {
		// TODO Auto-generated method stub
		return MessageDao.getMesageById(id);
	}

	//查询消息总数
	@Override
	public int getMessageAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
 
}
