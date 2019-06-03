package com.job.serviceImpl;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.RecruitmentRecordDAO;
import com.job.model.Recruitment;
import com.job.model.RecruitmentRecord;
import com.job.service.RecruitmentRecordService;

@Service
public class RecruitmentRecordServiceImpl implements RecruitmentRecordService {

	@Autowired
	private RecruitmentRecordDAO recruitmentRecordDAO;
	
	@Override
	public int addRecruitmentRecord(RecruitmentRecord recruitmentRecord) {
		return recruitmentRecordDAO.addRecruitmentRecord(recruitmentRecord);
	}

	@Override
	public RecruitmentRecord getRecruitmentRecorById(String id) {
		return recruitmentRecordDAO.getRecruitmentRecorById(id);
	}

	@Override
	public RecruitmentRecord getRecruitmentRecorByRecid(String recruitmentid) {
		return recruitmentRecordDAO.getRecruitmentRecorByRecid(recruitmentid);
	}

	@Override
	public ArrayList<RecruitmentRecord> getRecruitmentRecorListByComid(String companyid, int start, int num) {
		return recruitmentRecordDAO.getRecruitmentRecorListByComid(companyid, start, num);
	}

	@Override
	public int setRecruitmentid(String recruitmentid, String id) {
		return recruitmentRecordDAO.setRecruitmentid(recruitmentid, id);
	}

	@Override
	public int setCompanyid(String companyid, String id) {
		return recruitmentRecordDAO.setCompanyid(companyid, id);
	}

	@Override
	public int setTime(Date time, String id) {
		return recruitmentRecordDAO.setTime(time, id);
	}

	@Override
	public int setState(int state, String id) {
		return recruitmentRecordDAO.setState(state, id);
	}

	@Override
	public int setFreeze(int freeze, String id) {
		return recruitmentRecordDAO.setFreeze(freeze, id);
	}

}
