package com.job.controller;

import com.alibaba.fastjson.JSONObject;

public interface JobTypeController {
	
	/**
	 * @Description: 添加父类职业
	 * @version V1.0
	 */
	public String addSuperType(JSONObject json);
	
	/**
	 * @Description: 修改父类职业名
	 * @version V1.0
	 */
	public String alterSuperTypeName(JSONObject json);
	
	/**
	 * @Description: 修改子职业所属父类职业id
	 * @version V1.0
	 */
	public String alterSuperTypeId(JSONObject json);
	
	/**
	 * @Description: 修改子职业名
	 * @version V1.0
	 */
	public String alterTypeName(JSONObject json);
	
	/**
	 * @Description: 修改子职业点击量
	 * @version V1.0
	 */
	public String alterHit(JSONObject json);
	
	
}
