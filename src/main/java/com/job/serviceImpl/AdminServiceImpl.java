package com.job.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.AdminDAO;
import com.job.model.Admin;
import com.job.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Autowired
	private AdminDAO adminDAO;

	/*
	 * 增加一位管理员
	 * @see com.job.service.AdminService#addAdmin(com.job.model.Admin)
	 */
	@Override
	public int addAdmin(Admin admin) {		
		// TODO Auto-generated method stub
		return adminDAO.addAdmin(admin);		
	}
	
	/*
	 * 批量添加管理员
	 * @see com.job.service.AdminService#addAdmin(java.util.List)
	 */
	@Override
	public int addAdmin(List<Admin> admins) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	/*
	 * 通过Id删除一位管理员
	 * @see com.job.service.AdminService#delAdmin(int)
	 */
	@Override
	public int delAdmin(int id) {
		// TODO Auto-generated method stub
		return adminDAO.delAdminById(id);
	}

	/*
	 * 更新管理员信息
	 * @see com.job.service.AdminService#updateAdmin(com.job.model.Admin)
	 */
	@Override
	public int updateAdmin(Admin admin1) {
		// TODO Auto-generated method stub		
		if(adminDAO.setAdmin_name(admin1.getAdmin_name(),admin1.getId())>0 && adminDAO.setAdmin_password(admin1.getAdmin_password(),admin1.getId())>0&& adminDAO.setSuper(admin1.getMaster(),admin1.getId())>0&&adminDAO.setFroze(admin1.getFroze(),admin1.getId())>0 &&adminDAO.setDelete(admin1.getDelete(),admin1.getId())>0 && adminDAO.setRepassword(admin1.getRepassword(),admin1.getId())>0&&adminDAO.setSelect(admin1.getSelect(),admin1.getId())>0 && adminDAO.setFreeze(admin1.getFreeze(),admin1.getId())>0) 
		{
			return 1;
		}
		else{
			return 0;
		}	
	}

	/*
	 * 通过Id查询管理员
	 * @see com.job.service.AdminService#getAdminById(int)
	 */
	@Override
	public Admin getAdminById(int id) {
		// TODO Auto-generated method stub		
		return adminDAO.getAdminById(id);
	}
	
	/*
	 * 通过管理员名查询管理员信息
	 * @see com.job.service.AdminService#getAdminByAdmin_name(java.lang.String)
	 */
	@Override
	public Admin getAdminByAdmin_name(String admin_name) {
		// TODO Auto-generated method stub
		return adminDAO.getAdminByAdmin_name(admin_name);		
	}
	
	/*
	 * 获取所有管理员信息
	 * @see com.job.service.AdminService#getAllAdmin()
	 */
	@Override
	public List<Admin> getAllAdmin() {
		// TODO Auto-generated method stub
		return adminDAO.getAllAdmin();
	}

}
