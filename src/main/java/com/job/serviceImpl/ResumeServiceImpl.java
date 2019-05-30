package com.job.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.job.dao.ResumeDAO;
import com.job.model.Resume;
import com.job.service.ResumeService;

@Service
public class ResumeServiceImpl implements ResumeService{

	@Resource
	ResumeDAO resumeDao;
	@Override
	public int addResume(Resume resume) {
		return this.resumeDao.insertResume(resume);
	}

	@Override
	public int deleteResume(int id) {
		return this.resumeDao.deleteResume(id);
	}

	@Override
	public int freezeResume(int freeze, int id) {
		return this.resumeDao.freezeResume(freeze, id);
	}

	@Override
	public int updateResume(Resume resume) {
		return this.resumeDao.updateResume(resume);
	}

	@Override
	public Resume getResumeById(int id) {
		return this.resumeDao.selectResumeById(id);
	}

	@Override
	public Resume getResumeByUserName(String userName) {
		return this.resumeDao.selectResumeByUserName(userName);
	}

	@Override
	public int getTotal() {
		return this.resumeDao.getTotal();
	}

	@Override
	public List<Resume> getResumeByPage(int start, int count) {
		return this.resumeDao.selectResumeByPage(start, count);
	}

}
