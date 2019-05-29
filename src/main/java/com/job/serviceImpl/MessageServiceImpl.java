package com.job.serviceImpl;

import org.springframework.stereotype.Service;

import com.job.dao.MessageDAO;
import com.job.model.Message;
import com.job.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService{

	private MessageDAO MessageDao;
	@Override
	public int addMessage(Message Message) {
		// TODO Auto-generated method stub
		return MessageDao.addMessage(Message);
	}

	@Override
	public int delectMessage(int id) {
		// TODO Auto-generated method stub
		return MessageDao.DelectMessage(id);
	}

	@Override
	public Message getMessageById(int id) {
		// TODO Auto-generated method stub
		return MessageDao.getMesageById(id);
	}

	@Override
	public int getMessageAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
 
}
