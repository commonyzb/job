package com.job;

import java.util.Date;

import org.apache.ibatis.session.SqlSession;

import com.job.dao.LoginTicketDAO;
import com.job.dao.MessageDAO;
import com.job.model.LoginTicket;
import com.job.model.Message;

public class MessageTests {

	private MessageDAO messagedao;
	
	public void contextLoads() {
	Date first = new Date();

    SqlSession sqlsession = null;
    sqlsession = FKSqlSessionFactory.getSqlSession();
    Message message2 = new Message();
    messagedao = sqlsession.getMapper(MessageDAO.class);
    
    messagedao.UpdateDate(new Date(),1);
    messagedao.UpdateFrom("654321",1);
    messagedao.UpdateMsg("654321",1);
    messagedao.UpdateTo("654321",1);
    messagedao.DelectMessage(1);
    sqlsession.commit();
    sqlsession.rollback();
    message2 = messagedao.getMesageById(1);
    System.out.println("Message: from:"+message2.getFrom()+" msg:"+message2.getMsg());
}
}
