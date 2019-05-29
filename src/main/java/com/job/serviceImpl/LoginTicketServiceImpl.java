package com.job.serviceImpl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.job.dao.LoginTicketDAO;
import com.job.model.LoginTicket;
import com.job.service.LoginTicketService;

@Service("loginTicketService")
public class LoginTicketServiceImpl implements LoginTicketService{

	private LoginTicketDAO LoginTicketDao;
	
	//添加LoginTicket
	@Override
	public int addLoginTicket(LoginTicket loginTicket) {
		// TODO Auto-generated method stub
	    return LoginTicketDao.addLoginTicket(loginTicket);
	}
    
	//删除LoginTIcket
	@Override
	public int delectLoginTicket(int id) {
		// TODO Auto-generated method stub
		return LoginTicketDao.DelectTicket(id);
	}

	//根据ID查询LoginTicket实体
	@Override
	public LoginTicket getLoginTicketById(int id) {
		// TODO Auto-generated method stub
		return LoginTicketDao.getLoginTicketById(id);
	}

	//查询LoginTicket实体
	@Override
	public int getLoginTicketAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
