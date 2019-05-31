package com.job.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.job.dao.KnowledgeDAO;
import com.job.model.Knowledge;
import com.job.service.KnowledgeService;

@Service
public class KnowledgeServiceImpl implements KnowledgeService{

	@Autowired
	private KnowledgeDAO knowledgeDAO;
	
	/*
	 * 增加一位管理员
	 * @see com.job.service.KnowledgeService#addKnowledge(com.job.model.Knowledge)
	 */
	@Override
	public int addKnowledge(Knowledge knowledge) {
		// TODO Auto-generated method stub
			return knowledgeDAO.addKnowledge(knowledge);		
	}

	/*
	 * 通过Id删除学历信息
	 * @see com.job.service.KnowledgeService#delKnowledge(int)
	 */
	@Override
	public int delKnowledge(String id) {
		// TODO Auto-generated method stub		
		return knowledgeDAO.delKnowledgeById(id);		
	}
	
	/*
	 * 通过Knowledge对象删除Knowledge信息
	 * @see com.job.service.KnowledgeService#delKnowledge(com.job.model.Knowledge)
	 */
	@Override
	public int delKnowledge(Knowledge knowledge) {
		// TODO Auto-generated method stub		
		return knowledgeDAO.delKnowledge(knowledge);
		
	}

	/*
	 * 通过Knowledge对象更新学历信息
	 * @see com.job.service.KnowledgeService#updateKnowledge(int, java.lang.String)
	 */
	@Override
	public int updateKnowledge(Knowledge knowledge) {
		// TODO Auto-generated method stub	
		return knowledgeDAO.updateKnowledgeById(knowledge.getId(),knowledge.getTypename());	
	}

	/*
	 * 通过Id获取Knowledge对象
	 * @see com.job.service.KnowledgeService#getKnowledgeById(int)
	 */
	@Override
	public Knowledge getKnowledgeById(String id) {
		// TODO Auto-generated method stub
		return knowledgeDAO.getKnowledgeById(id);
	}

	/*
	 * 通过学历名获取Knowledge集合
	 * @see com.job.service.KnowledgeService#getKnowledgeByType(java.lang.String)
	 */
	@Override
	public List<Knowledge> getKnowledgesByType(String type_name) {
		// TODO Auto-generated method stub
		return knowledgeDAO.getKnowledgeByType(type_name);
	}

}
