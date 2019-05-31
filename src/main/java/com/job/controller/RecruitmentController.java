package com.job.controller;

import com.alibaba.fastjson.JSONObject;

public interface RecruitmentController {
	
	/**
	 * @Description: 添加一条招聘信息
	 * @version V1.0
	 */
	public String addRecruitment(JSONObject json);
	
	/**
	 * @Description: 删除一条招聘信息
	 * @version V1.0
	 */
	public String delRecruitment(JSONObject json);
	
	/**
	 * @Description: 修改招聘信息
	 * @version V1.0
	 */
	public String alertRecruitment(JSONObject json);
	
	
}
