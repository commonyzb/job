package com.job.service;

import java.util.ArrayList;
import java.util.Date;

import com.job.model.Recruitment;
import com.job.model.RecruitmentRecord;

public interface RecruitmentRecordService {
	/*
	 * 插入一条招聘投放记录
	 */
	public int addRecruitmentRecord(RecruitmentRecord recruitmentRecord);
	
	/*
	 * 根据招聘投放记录id获取该招聘投放记录的全部信息
	 */
	public RecruitmentRecord getRecruitmentRecorById(int id);
	
	/*
	 * 根据招聘信息id获取该招聘投放记录的全部信息
	 */
	public RecruitmentRecord getRecruitmentRecorByRecid(int recruitmentid);
	
	/*
	 * 根据商家id获取某商家的全部招聘投放记录
	 */
	public ArrayList<RecruitmentRecord> getRecruitmentRecorListByComid(int companyid, int start, int num);
	
	/*
	 * 根据招聘信息id，修改招聘信息id
	 */
	public int setRecruitmentid(int recruitmentid, int id);
	
	/*
	 * 根据招聘信息id，修改商家账户
	 */
	public int setCompanyid(int companyid, int id);
	
	/*
	 * 根据招聘信息id，修改投放时间
	 */
	public int setTime(Date time, int id);
	
	/*
	 * 根据招聘信息id，修改是否显示 0为显示，1为不显示，默认为0
	 */
	public int setState(int state, int id);
	
	/*
	 * 根据招聘信息id，修改是否冻结 0为没有冻结，1为冻结，默认为0
	 */
	public int setFreeze(int freeze, int id);
}
