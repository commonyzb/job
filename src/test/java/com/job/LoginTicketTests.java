package com.job;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.job.dao.AdminDAO;
import com.job.dao.LoginTicketDAO;
import com.job.model.Admin;
import com.job.model.LoginTicket;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LoginTicketTests {
	
	@Autowired
	private AdminDAO adminDAO;
	@Autowired
    private LoginTicketDAO LoginTicketDao;
	
	@Test
	public void contextLoads() {
		Date first = new Date();

	    SqlSession sqlsession = null;
	    sqlsession = FKSqlSessionFactory.getSqlSession();
	    LoginTicket loginTicket1 = new LoginTicket();
	    LoginTicket loginTicket2 = new LoginTicket();
	    LoginTicketDao = sqlsession.getMapper(LoginTicketDAO.class);
	    //loginTicket1.setDevice("123456");
	    //loginTicket1.setExpired(first);
	    //loginTicket1.setIp("123456");
	    //loginTicket1.setStatus(1);
	    //loginTicket1.setTicket("123456");
	    //loginTicket1.setUserid(123456);
	    //LoginTicketDao.addLoginTicket(loginTicket1);
	    
	    
	    LoginTicketDao.UpdateDevice("654321",2);
	    LoginTicketDao.UpdateExpired(new Date(),2);
	    LoginTicketDao.UpdateIp("654321",2);
	    LoginTicketDao.UpdateTicket("654321",2);
	    LoginTicketDao.DelectTicket(2);
	    sqlsession.commit();
	    sqlsession.rollback();
	    loginTicket2 = LoginTicketDao.getLoginTicketById(2);
	    System.out.println("loginTicket: Userid:"+loginTicket2.getUserid()+" Ip:"+loginTicket2.getIp());
	}

}
