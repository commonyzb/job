package com.job;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.job.dao.AdminDAO;
import com.job.model.Admin;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JobApplicationTests {
	
	@Autowired
	private AdminDAO adminDAO;

	@Test
	public void contextLoads() {
		Date first = new Date();
		
		Admin a1 = adminDAO.getAdminById(1);
		System.out.println("first " + a1.getId() + ": "  + (new Date().getTime()-first.getTime()) + "ms");
		Date second = new Date();
		Admin a2 = adminDAO.getAdminById(2);
		System.out.println("second " + a2.getId() + ": " + (new Date().getTime()-second.getTime()) + "ms");
	}

}
