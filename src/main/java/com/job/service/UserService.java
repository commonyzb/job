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
	public User getUserByid(int id);

	/*
	 * 根据用户username（账号）查询用户所有信息
	 */
	public User getUserByusername(String username);

	/*
	 * 根据用户id更新用户密码
	 */
	public int setpasswordByid(int id, String password);

	/*
	 * 根据id更新用户状态
	 */
	public int setFreezeByid(int id);

	/*
	 * 根据id更新用户类型
	 */
	public int setTypeByid(int id);

	/*
	 * 账号是否冻结
	 */
	public int setFreezeByid(int id, int freeze);

}
