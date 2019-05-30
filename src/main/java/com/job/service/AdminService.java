package com.job.service;

import java.util.List;

import com.job.model.Admin;

public interface AdminService 
{
		
	/*
	 * 添加一名管理员
	 */
	int addAdmin(Admin admin);
	
	/*
	 * 批量添加管理员
	 */
	int addAdmin(List<Admin> admins);
	
	/*
	 * 通过Id删除一名管理员
	 */
	int delAdmin(int id);
	
	/*
	 * 更新管理员信息
	 */
	int updateAdmin(Admin admin);
	
	/*
	 * 通过Id查询管理员信息
	 */
	Admin getAdminById(int id);
	
	/*
	 * 通过管理员名查询管理员信息
	 */
	Admin getAdminByAdmin_name(String admin_name);

	/*
	 * 查询所有管理员信息
	 */
	List<Admin> getAllAdmin();
	
	
	
}
