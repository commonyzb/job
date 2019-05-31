package com.job.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.job.controller.MessageController;


@Controller
@RequestMapping("/message")
public class MessageControllerImpl implements MessageController {

	@Override
	@RequestMapping(value = "sendMessage")
	@ResponseBody
	public String sendMessage(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String alterStatus(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
