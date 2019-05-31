package com.job;


import java.util.Date;
import java.util.List;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.job.dao.AdminDAO;
import com.job.dao.KnowledgeDAO;
import com.job.model.Admin;
import com.job.model.Knowledge;
import com.job.service.AdminService;
import com.job.serviceImpl.AdminServiceImpl;
import com.job.serviceImpl.KnowledgeServiceImpl;


@RunWith(SpringRunner.class)
@SpringBootTest
public class JobApplicationTests {
	

	@Autowired
	private AdminDAO adminDAO;
	
	@Autowired
	private KnowledgeDAO knowledgeDAO;

	@Autowired
	private AdminServiceImpl adminService;
	
	@Autowired
	private KnowledgeServiceImpl knowledgeService;
	
	@Test
	public void contextLoads() {
	
//	Knowledge knowledge=new Knowledge("sadf");	
		
//	System.out.println(knowledgeService.addKnowledge(knowledge));	
		
//	System.out.println(knowledgeService.delKnowledge(3));	
	
//	Knowledge knowledge=knowledgeService.getKnowledgeById(4);
//	System.out.println(knowledge.toString());
//	Admin admin=new Admin("hello","heo",0,0,0,0,0,0);
//	admin.setSalt("hga");
//	System.out.println(adminDAO.addAdmin(admin));
//	System.out.println(adminService.addAdmin(admin));
//	System.out.println(adminService.delAdmin(6));
	
//	Admin admin=adminService.getAdminById(7);
//	admin.setFroze(0);
//	System.out.println(adminDAO.setRepassword(3,7));
//	System.out.println(adminService.updateAdmin(admin));
//	if(adminService.addAdmin(admin)) {
//		System.out.println("添加成功");
//	}
//	else {
//		System.out.println("添加失败");
//	}
	
/*
		Date first = new Date();
		Admin a1 = adminDAO.getAdminById(1);
		System.out.println("first " + a1.getId() + ": "  + (new Date().getTime()-first.getTime()) + "ms");
		Date second = new Date();
		Admin a2 = adminDAO.getAdminById(2);
		System.out.println("second " + a2.getId() + ": " + (new Date().getTime()-second.getTime()) + "ms");
*/	
	/*	Knowledge knowledge=new Knowledge("本科");
		knowledgeDAO.addKnowledge(knowledge);
				
		knowledgeDAO.addKnowledge(knowledge);
		
		List<Knowledge> knowledges=knowledgeDAO.getKnowledgeByType("本科");
		for(int i=0;i<knowledges.size();i++) {
			System.out.println(knowledges.get(i).toString());
		}
//		System.out.println(knowledgeDAO.getKnowledgeById(2).toString());
	*/	
//		System.out.println(knowledgeDAO.getKnowledgeById(1).toString());		
//		knowledgeDAO.updateKnowledge(1,"大学");
//		System.out.println(knowledgeDAO.getKnowledgeById(1).toString());
		
//		knowledgeDAO.delKnodledge(2);
		
//		Admin a3=new Admin("hello","123456",0,0,0,1,1,1);
//		adminDAO.addAdmin(a3);
		
/*		List<Admin> admins=adminDAO.getAdminByName("hello");
		
		for(int i=0;i<admins.size();i++) {
			Admin admin=admins.get(i);
			System.out.println(admin.toString());
		}
*/		
//		System.out.println(adminDAO.getAdminById(5).toString());
//		adminDAO.delAdmin(3);
//		adminDAO.setSelect(0,3);
//		System.out.println(adminDAO.getAdminById(3).toString());
//		adminDAO.setDelete(0,3);
//		System.out.println(adminDAO.getAdminById(3).toString());
	
	}
}

