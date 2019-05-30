package com.job.serviceImpl;

import org.springframework.stereotype.Service;

import com.job.dao.UserDetailDAO;
import com.job.model.UserDetail;
import com.job.service.UserDetailService;

@Service
public class UserDetailServiceImpl implements UserDetailService{
	
	public UserDetailDAO userDetailDAO;
	
	@Override
	public int addUserDetail(UserDetail userdetail) {
		// TODO Auto-generated method stub
		return userDetailDAO.addUserDetail(userdetail);
	}

	@Override
	public UserDetail getUserDetailByid(int id) {
		// TODO Auto-generated method stub
		return userDetailDAO.getUserDetailByid(id);
	}

	@Override
	public UserDetail getUserDetailByusername(String username) {
		// TODO Auto-generated method stub
		return userDetailDAO.getUserDetailByusername(username);
	}

	@Override
	public int setUserDetailByid(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return userDetailDAO.setUserDetailByid(userDetail);
	}

	@Override
	public int setUserDetailfreezeByid(int id, int freeze) {
		// TODO Auto-generated method stub
		return userDetailDAO.setUserDetailfreezeByid(id, freeze);
	}

}
