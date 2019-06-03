package com.job.service;

import java.util.ArrayList;
import java.util.Date;

import com.job.model.Recruitment;

public interface RecruitmentService {
	/*
	 *  插入一条招聘信息
	 */
	public int addRecruitment(Recruitment recruitment);
	
	/*
	 * 根据商家账号id获取其发布的全部招聘信息
	 */
	public ArrayList<Recruitment> getRecruitmentListByUserid(String userid, int start, int num);
	
	/*
	 * 根据商家账户名获取其发布的全部招聘信息
	 */
	public ArrayList<Recruitment> getRecruitmentListByUsername(String username, int start, int num);
	
	/*
	 *  根据招聘信息id获取该招聘信息的全部信息
	 */
	public Recruitment getRecruitmentById(String id);
	
	/*
	 * 根据招聘信息id，修改该招聘信息
	 */
	public int setRecruitment(Recruitment recruitment);
	
	/*
	 * 根据招聘信息id，修改职位信息
	 */
	public int setPosition(String position, String id);
	
	/*
	 * 根据招聘信息id，修改商家要求信息
	 */
	public int setDemend(String demend, String id);
	
	/*
	 * 根据招聘信息id，修改期望最高薪资信息
	 */
	public int setSalaryHight(int salaryHight, String id);
	
	/*
	 * 根据招聘信息id，修改期望最低薪资信息
	 */
	public int setSalaryLow(int salaryLow, String id);
	
	/*
	 * 根据招聘信息id，修改工作经验年限信息
	 */
	public int setExperience(int experience, String id);
	
	/*
	 * 根据招聘信息id，修改工作时间信息
	 */
	public int setWorktime(Date worktime, String id);
	
	/*
	 * 根据招聘信息id，修改工作地点信息
	 */
	public int setWorkplace(String workplace, String id);
	
	/*
	 * 根据招聘信息id，修改工作描述信息
	 */
	public int setWorkdescribe(String workdescribe, String id);
	
	/*
	 * 根据招聘信息id，修改联系人姓名信息
	 */
	public int setContacts(String contacts, String id);
	
	/*
	 * 根据招聘信息id，修改联系电话信息
	 */
	public int setTel(String tel, String id);
	
	/*
	 * 根据招聘信息id，修改商家地址信息
	 */
	public int setAddress(String address, String id);
	
	/*
	 * 根据招聘信息id，修改发布时间信息
	 */
	public int setTime(Date time, String id);
	
	/*
	 * 根据招聘信息id，修改点击量信息
	 */
	public int setHit(int hit, String id);
	
	/*
	 * 根据招聘信息id，修改行业类型
	 */
	public int setTypeid(String typeid, String id);
	
	/*
	 * 根据招聘信息id，修改是否招聘结束，0为没有结束，1为结束，默认为0
	 */
	public int setStatus(int status, String id);
	
	/*
	 *  根据招聘信息id，修改该招聘信息是否冻结 0为正常，1为冻结，默认为0
	 */
	public int setSuper(int freeze, String id);
}
