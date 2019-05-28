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
	public Recruitment getRecruitmentById(int id) {
		return recruitmentDAO.getRecruitmentById(id);
	}

	@Override
	public int setPosition(String position, int id) {
		return recruitmentDAO.setPosition(position, id);
	}

	@Override
	public int setDemend(String demend, int id) {
		return recruitmentDAO.setDemend(demend, id);
	}

	@Override
	public int setSalaryHight(int salaryHight, int id) {
		return recruitmentDAO.setSalaryHight(salaryHight, id);
	}

	@Override
	public int setSalaryLow(int salaryLow, int id) {
		return recruitmentDAO.setSalaryLow(salaryLow, id);
	}

	@Override
	public int setExperience(int experience, int id) {
		return recruitmentDAO.setExperience(experience, id);
	}

	@Override
	public int setWorktime(Date worktime, int id) {
		return recruitmentDAO.setWorktime(worktime, id);
	}

	@Override
	public int setWorkplace(String workplace, int id) {
		return recruitmentDAO.setWorkplace(workplace, id);
	}

	@Override
	public int setWorkdescribe(String workdescribe, int id) {
		return recruitmentDAO.setWorkdescribe(workdescribe, id);
	}

	@Override
	public int setContacts(String contacts, int id) {
		return recruitmentDAO.setContacts(contacts, id);
	}

	@Override
	public int setTel(String tel, int id) {
		return recruitmentDAO.setTel(tel, id);
	}

	@Override
	public int setAddress(String address, int id) {
		return recruitmentDAO.setAddress(address, id);
	}

	@Override
	public int setTime(Date time, int id) {
		return recruitmentDAO.setTime(time, id);
	}

	@Override
	public int setHit(int hit, int id) {
		return recruitmentDAO.setHit(hit, id);
	}

	@Override
	public int setTypeid(int typeid, int id) {
		return recruitmentDAO.setTypeid(typeid, id);
	}

	@Override
	public int setSuper(int freeze, int id) {
		return recruitmentDAO.setSuper(freeze, id);
	}

	@Override
	public ArrayList<Recruitment> getRecruitmentListById(int userid) {
		return recruitmentDAO.getRecruitmentListById(userid);
	}

	@Override
	public ArrayList<Recruitment> getRecruitmentListByUserid(String username) {
		return recruitmentDAO.getRecruitmentListByUserid(username);
	}

	@Override
	public int setStatus(int status, int id) {
		return recruitmentDAO.setStatus(status, id);
	}

}
