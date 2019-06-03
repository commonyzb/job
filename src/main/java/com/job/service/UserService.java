package com.job.service;

import com.job.model.User;

public interface UserService {
	/*
	 * 插入一个新用户
	 */
	public int addUser(User user);

	/*
	 * 根据用户id查询用户信息
	 */
	public User getUserByid(String id);

	/*
	 * 根据用户username（账号）查询用户所有信息
	 */
	public User getUserByusername(String username);

	/*
	 * 根据用户id更新用户密码
	 */
	public int setpasswordByid(String id, String password);


	/*
	 * 根据id更新用户类型
	 */
	public int setTypeByid(String id,int type);

	/*
	 * 根据id更新账号状态
	 */
	public int setFreezeByid(String id, int freeze);

}
