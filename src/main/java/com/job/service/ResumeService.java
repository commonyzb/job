
package com.job.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.job.model.Resume;

public interface ResumeService {
	
	/**
	 * 添加用户简历
	 * @param resume
	 * @return 成功返回1，失败返回0
	 */
	public int addResume(Resume resume);
	
	/**
	 * 删除用户简历
	 * @param id
	 * @return 成功返回1，失败返回0
	 */
	public int deleteResume(String id);
	
	/**
	 * 隐藏用户简历(通过freeze冻结)
	 * @param freeze 简历是否冻结 freeze=0为正常，freeze=1为冻结，默认为0
	 * @param id
	 * @return 成功返回1，失败返回0
	 */
	public int freezeResume(int freeze,String id);
	
	/**
	 * 更新用户简历
	 * @param resume
	 * @return 成功返回1，失败返回0
	 */
	public int updateResume(Resume resume);
	
	/**
	 * 通过id查询用户简历
	 * @param id
	 * @return 返回用户简历实体类
	 */
	public Resume getResumeById(String id);
	
	/**
	 * 通过用户名查询简历
	 * @param userName
	 * @return 返回用户简历实体类
	 */
	public Resume getResumeByUserName(String userName);
	
	/**
	 * 查看商家详细信息表中的信息总数
	 * @return
	 */
	public int getTotal();
	
	/**
	 * 按页查询
	 * @param start  数据开始位置
	 * @param count  数据显示条数(每页显示数据的条数)
	 * @return
	 */
	public List<Resume> getResumeByPage(int start,int count);
}


