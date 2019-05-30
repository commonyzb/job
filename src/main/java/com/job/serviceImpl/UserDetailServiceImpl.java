package com.job.serviceImpl;

import org.springframework.stereotype.Service;

import com.job.dao.UserDetailDAO;
import com.job.model.UserDetail;
import com.job.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService {

	public UserDetailDAO userDetailDAO;

	/* 添加一条新的个人信息 */
	@Override
	public int addUserDetail(UserDetail userdetail) {
		// TODO Auto-generated method stub
		return userDetailDAO.addUserDetail(userdetail);
	}

	/* 根据id获取一个用户的实体类信息 */
	@Override
	public UserDetail getUserDetailByid(int id) {
		// TODO Auto-generated method stub
		return userDetailDAO.getUserDetailByid(id);
	}

	/* 根据用户账号获取一个用户实体类个人信息 */
	@Override
	public UserDetail getUserDetailByusername(String username) {
		// TODO Auto-generated method stub
		return userDetailDAO.getUserDetailByusername(username);
	}

	/* 根据id更新一个用户的个人信息 */
	@Override
	public int setUserDetailByid(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailDAO.setUserDetailByid(userDetail);
	}

	/*
	 * 根据用户id和freeze信息更新freeze信息 freeze：信息是否可用，0可用，1不可用，默认0
	 */
	@Override
	public int setUserDetailfreezeByid(int id, int freeze) {
		// TODO Auto-generated method stub
		return userDetailDAO.setUserDetailfreezeByid(id, freeze);
	}

}
