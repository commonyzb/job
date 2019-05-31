package com.job.controller;

import com.alibaba.fastjson.JSONObject;

public interface AdminController {
	
	/**
	 * @Description: 管理员登录
	 * @version V1.0
	 */
	public String login(JSONObject json);
	
	/**
	 * @Description:管理员注册
	 * @version V1.0
	 */
	public String registered(JSONObject json);
	
	/**
	 * @Description: 修改是否为管理员
	 * @version V1.0
	 */
	public String alterMasterPower(JSONObject json);
	
	/**
	 * @Description: 修改是否有冻结权限
	 * @version V1.0
	 */
	public String alterFrozePower(JSONObject json);
	
	/**
	 * @Description: 修改是否有删除权限
	 * @version V1.0
	 */
	public String alterDeletePower(JSONObject json);
	
	/**
	 * @Description: 修改是否有修改密码权限
	 * @version V1.0
	 */
	public String alterPasswordPower(JSONObject json);
	
	/**
	 * @Description: 修改是否有查看用户信息权限
	 * @version V1.0
	 */
	public String alterSelectPower(JSONObject json);
	
	/**
	 * @Description: 修改管理员密码
	 * @version V1.0
	 */
	public String alterPassword(JSONObject json);
	
	/**
	 * @Description: 修改管理员账号是否冻结
	 * @version V1.0
	 */
	public String alterFreeze(JSONObject json);
}
