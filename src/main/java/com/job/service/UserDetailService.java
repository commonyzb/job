package com.job.service;
import com.job.model.UserDetail;

public interface UserDetailService {
	/*
	 * 插入一条用户个人信息
	 */
	public int addUserDetail(UserDetail userdetail);

	/*
	 * 根据id获取用户个人信息
	 */
	public UserDetail getUserDetailByid(int id);

	/*
	 * 根据账号username获取用户个人信息
	 */
	public UserDetail getUserDetailByusername(String username);

	/*
	 * 根据id更新用户个人信息
	 */
	public int setUserDetailByid(UserDetail userDetail);
	
	
	/*
	 * 账号信息是否冻结
	 */
	public int setUserDetailfreezeByid(int id,int freeze);
}
