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
	@Override
	public int addLoginTicket(LoginTicket loginTicket) {
		// TODO Auto-generated method stub
	    return LoginTicketDao.addLoginTicket(loginTicket);
	}

	@Override
	public int delectLoginTicket(int id) {
		// TODO Auto-generated method stub
		return LoginTicketDao.DelectTicket(id);
	}

	@Override
	public LoginTicket getLoginTicketById(int id) {
		// TODO Auto-generated method stub
		return LoginTicketDao.getLoginTicketById(id);
	}

	@Override
	public int getLoginTicketAccount() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
