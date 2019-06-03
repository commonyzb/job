package com.job.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.job.dao.SubtypeDAO;
import com.job.model.Subtype;
import com.job.service.SubtypeService;

@Service
public class SubtypeServiceImpl implements SubtypeService{

	@Resource
	SubtypeDAO subtypedao;
	@Override
	public int addSubtype(Subtype subtype) {
		// TODO Auto-generated method stub
		return this.subtypedao.addSubtype(subtype);
	}

	@Override
	public int setSubtype(String id, String typename) {
		// TODO Auto-generated method stub
		return this.subtypedao.setSubtype(id, typename);
	}

	@Override
	public Subtype getSubtype(String id) {
		// TODO Auto-generated method stub
		return this.subtypedao.getSubtype(id);
	}

	@Override
	public List<Subtype> getAllSubtype() {
		// TODO Auto-generated method stub
		return this.subtypedao.getAll();
	}

}
