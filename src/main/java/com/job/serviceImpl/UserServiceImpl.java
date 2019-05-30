package com.job.serviceImpl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.UserDAO;
import com.job.model.User;
import com.job.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	public UserDAO userDAO;

	@Override
	public int addUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.addUser(user);
	}

	@Override
	public User getUserByid(int id) {
		// TODO Auto-generated method stub
		return userDAO.getUserByid(id);
	}

	@Override
	public User getUserByusername(String username) {
		// TODO Auto-generated method stub
		return userDAO.getUserByusername(username);
	}

	@Override
	public int setpasswordByid(int id, String password) {
		// TODO Auto-generated method stub
		return userDAO.setpasswordByid(id, password);
	}

	@Override
	public int setFreezeByid(int id) {
		// TODO Auto-generated method stub
		return userDAO.setfreezeByid(id);
	}

	@Override
	public int setTypeByid(int id) {
		// TODO Auto-generated method stub
		return userDAO.settypeByid(id);
	}

	@Override
	public int setFreezeByid(int id, int freeze) {
		// TODO Auto-generated method stub
		return userDAO.setUserfreezeByid(id, freeze);
	}


	
}
