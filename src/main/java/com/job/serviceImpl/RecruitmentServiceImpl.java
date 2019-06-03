package com.job.serviceImpl;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.RecruitmentDAO;
import com.job.model.Recruitment;
import com.job.service.RecruitmentService;

@Service
public class RecruitmentServiceImpl implements RecruitmentService {

	@Autowired
	private RecruitmentDAO recruitmentDAO;
	
	@Override
	public int addRecruitment(Recruitment recruitment) {
		return recruitmentDAO.addRecruitment(recruitment);
	}
	
	@Override
	public Recruitment getRecruitmentById(String id) {
		return recruitmentDAO.getRecruitmentById(id);
	}
	
	@Override
	public int setRecruitment(Recruitment recruitment) {
		return recruitmentDAO.setRecruitment(recruitment);
	}
	
	@Override
	public int setPosition(String position, String id) {
		return recruitmentDAO.setPosition(position, id);
	}

	@Override
	public int setDemend(String demend, String id) {
		return recruitmentDAO.setDemend(demend, id);
	}

	@Override
	public int setSalaryHight(int salaryHight, String id) {
		return recruitmentDAO.setSalaryHight(salaryHight, id);
	}

	@Override
	public int setSalaryLow(int salaryLow, String id) {
		return recruitmentDAO.setSalaryLow(salaryLow, id);
	}

	@Override
	public int setExperience(int experience, String id) {
		return recruitmentDAO.setExperience(experience, id);
	}

	@Override
	public int setWorktime(Date worktime, String id) {
		return recruitmentDAO.setWorktime(worktime, id);
	}

	@Override
	public int setWorkplace(String workplace, String id) {
		return recruitmentDAO.setWorkplace(workplace, id);
	}

	@Override
	public int setWorkdescribe(String workdescribe, String id) {
		return recruitmentDAO.setWorkdescribe(workdescribe, id);
	}

	@Override
	public int setContacts(String contacts, String id) {
		return recruitmentDAO.setContacts(contacts, id);
	}

	@Override
	public int setTel(String tel, String id) {
		return recruitmentDAO.setTel(tel, id);
	}

	@Override
	public int setAddress(String address, String id) {
		return recruitmentDAO.setAddress(address, id);
	}

	@Override
	public int setTime(Date time, String id) {
		return recruitmentDAO.setTime(time, id);
	}

	@Override
	public int setHit(int hit, String id) {
		return recruitmentDAO.setHit(hit, id);
	}

	@Override
	public int setTypeid(String typeid, String id) {
		return recruitmentDAO.setTypeid(typeid, id);
	}

	@Override
	public int setSuper(int freeze, String id) {
		return recruitmentDAO.setSuper(freeze, id);
	}

	@Override
	public ArrayList<Recruitment> getRecruitmentListByUserid(String userid, int start, int num) {
		return recruitmentDAO.getRecruitmentListByUserid(userid, start, num);
	}

	@Override
	public ArrayList<Recruitment> getRecruitmentListByUsername(String username, int start, int num) {
		return recruitmentDAO.getRecruitmentListByUsername(username, start, num);
	}

	@Override
	public int setStatus(int status, String id) {
		return recruitmentDAO.setStatus(status, id);
	}

}
