package com.job.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.UserDAO;
import com.job.model.User;
import com.job.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	public UserDAO userDAO;

	/* 传入一个user对象，添加一条注册信息 */
	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.addUser(user);
	}

	/* 根据用户id获取一个用户实体类user */
	@Override
	public User getUserByid(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUserByid(id);
	}

	/* 根据用户账号获取一个用户实体类user */
	@Override
	public User getUserByusername(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserByusername(username);
	}

	/* 根据用户id和password更新一条用户密码信息 */
	@Override
	public int setpasswordByid(int id, String password) {
		// TODO Auto-generated method stub
		return userDAO.setpasswordByid(id, password);
	}



	@Override
	public int setTypeByid(int id, int type) {
		// TODO Auto-generated method stub
		return userDAO.settypeByid(id, type);
	}

	@Override
	public int setFreezeByid(int id, int freeze) {
		// TODO Auto-generated method stub
		return userDAO.setfreezeByid(id, freeze);
	}

}
