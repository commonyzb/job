package com.job.service;

import java.util.List;

import com.job.model.Knowledge;

public interface KnowledgeService 
{
	/*
	 * 增加一条学历
	 */
	int addKnowledge(Knowledge knowledge);
	
	/*
	 * 通过Id删除学历信息
	 */
	int delKnowledge(int id);
	
	/*
	 * 删除一条学历信息
	 */
	int delKnowledge(Knowledge knowledge);
	
	/*
	 * 修改学历信息
	 */
	int updateKnowledge(Knowledge knowledge);
	
	/*
	 * 通过Id查询学历信息
	 */
	Knowledge getKnowledgeById(int id);
	
	/*
	 * 通过学历名查询简历信息
	 */
	List<Knowledge> getKnowledgesByType(String type_name);
}
