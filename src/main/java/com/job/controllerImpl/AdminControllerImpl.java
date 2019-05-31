package com.job.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.job.controller.AdminController;

@Controller
@RequestMapping("/admin")
public class AdminControllerImpl implements AdminController {

	@Override
	@RequestMapping(value = "login")
	@ResponseBody
	public String login(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "registered")
	@ResponseBody
	public String registered(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterMasterPower")
	@ResponseBody
	public String alterMasterPower(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterFrozePower")
	@ResponseBody
	public String alterFrozePower(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterDeletePower")
	@ResponseBody
	public String alterDeletePower(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterPasswordPower")
	@ResponseBody
	public String alterPasswordPower(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterSelectPower")
	@ResponseBody
	public String alterSelectPower(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterPassword")
	@ResponseBody
	public String alterPassword(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterFreeze")
	@ResponseBody
	public String alterFreeze(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
