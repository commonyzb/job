package com.job.service;

import java.util.Date;

import com.job.model.Recruitment;

public interface RecruitmentService {
	/*
	 *  插入一条招聘信息
	 */
	public int addRecruitment(Recruitment recruitment);
	
	/*
	 *  根据招聘信息id获取该招聘信息的全部信息
	 */
	public Recruitment getRecruitmentById(int id);
	
	/*
	 * 根据招聘信息id，修改职位信息
	 */
	public int setPosition(String position, int id);
	
	/*
	 * 根据招聘信息id，修改商家要求信息
	 */
	public int setDemend(String demend, int id);
	
	/*
	 * 根据招聘信息id，修改期望最高薪资信息
	 */
	public int setSalaryHight(int salaryHight, int id);
	
	/*
	 * 根据招聘信息id，修改期望最低薪资信息
	 */
	public int setSalaryLow(int salaryLow, int id);
	
	/*
	 * 根据招聘信息id，修改工作经验年限信息
	 */
	public int setExperience(int experience, int id);
	
	/*
	 * 根据招聘信息id，修改工作时间信息
	 */
	public int setWorktime(Date worktime, int id);
	
	/*
	 * 根据招聘信息id，修改工作地点信息
	 */
	public int setWorkplace(String workplace, int id);
	
	/*
	 * 根据招聘信息id，修改工作描述信息
	 */
	public int setWorkdescribe(String workdescribe, int id);
	
	/*
	 * 根据招聘信息id，修改联系人姓名信息
	 */
	public int setContacts(String contacts, int id);
	
	/*
	 * 根据招聘信息id，修改联系电话信息
	 */
	public int setTel(String tel, int id);
	
	/*
	 * 根据招聘信息id，修改商家地址信息
	 */
	public int setAddress(String address, int id);
	
	/*
	 * 根据招聘信息id，修改发布时间信息
	 */
	public int setTime(Date time, int id);
	
	/*
	 * 根据招聘信息id，修改点击量信息
	 */
	public int setHit(int hit, int id);
	
	/*
	 * 根据招聘信息id，修改点击量信息
	 */
	public int setTypeid(int typeid, int id);
	
	/*
	 *  根据招聘信息id，修改该信息是否被删除
	 */
	public int setSuper(int freeze, int id);
}
