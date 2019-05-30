package com.job.controller;

import com.alibaba.fastjson.JSONObject;

public interface KnowledgeController {
	
	/**
	 * @Description: 添加学历
	 * @version V1.0
	 */
	public String addKnowledge(JSONObject json);
	
	/**
	 * @Description: 修改学历名
	 * @version V1.0
	 */
	public String alterKnowledgeName(JSONObject json);
}
