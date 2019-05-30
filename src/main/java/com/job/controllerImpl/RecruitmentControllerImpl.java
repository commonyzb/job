package com.job.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.job.controller.RecruitmentController;

@Controller
@RequestMapping("/recruitment")
public class RecruitmentControllerImpl implements RecruitmentController {

	@Override
	@RequestMapping(value = "addRecruitment")
	@ResponseBody
	public String addRecruitment(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "delRecruitment")
	@ResponseBody
	public String delRecruitment(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alertRecruitment")
	@ResponseBody
	public String alertRecruitment(JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
