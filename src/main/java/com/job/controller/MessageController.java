package com.job.controller;

import com.alibaba.fastjson.JSONObject;

public interface MessageController {
	
	/**
	 * @Description: 添加消息
	 * @version V1.0
	 */
	public String sendMessage(JSONObject json);
	
	/**
	 * @Description: 修改消息是否删除
	 * @version V1.0
	 */
	public String alterStatus(JSONObject json);
}
