package com.job.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.job.controller.JobTypeController;

@Controller
@RequestMapping("/jobtype")
public class JobTypeControllerImpl implements JobTypeController {

	@Override
	@RequestMapping(value = "addSuperType")
	@ResponseBody
	public String addSuperType(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterSuperTypeName")
	@ResponseBody
	public String alterSuperTypeName(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterSuperTypeId")
	@ResponseBody
	public String alterSuperTypeId(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterTypeName")
	@ResponseBody
	public String alterTypeName(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterHit")
	@ResponseBody
	public String alterHit(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
