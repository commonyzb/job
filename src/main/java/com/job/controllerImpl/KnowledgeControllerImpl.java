package com.job.controllerImpl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.job.controller.KnowledgeController;

@Controller
@RequestMapping("/knowledge")
public class KnowledgeControllerImpl implements KnowledgeController {

	@Override
	@RequestMapping(value = "addKnowledge")
	@ResponseBody
	public String addKnowledge(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(value = "alterName")
	@ResponseBody
	public String alterKnowledgeName(@RequestBody JSONObject json) {
		// TODO Auto-generated method stub
		return null;
	}

}
