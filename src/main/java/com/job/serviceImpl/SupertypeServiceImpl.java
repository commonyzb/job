package com.job.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.job.dao.SupertypeDAO;
import com.job.model.Subtype;
import com.job.model.Supertype;
import com.job.service.SupertypeService;

@Service
public class SupertypeServiceImpl implements SupertypeService{
	@Resource
	SupertypeDAO sup;
	@Override
	public int addSupertype(Supertype supertype) {
		// TODO Auto-generated method stub
		return this.sup.addSupertype(supertype);
	}

	@Override
	public List<Supertype> getAllSupertype() {
		// TODO Auto-generated method stub
		return this.sup.getAllSupertype();
	}

	@Override
	public Subtype getSupertypeById(String id) {
		// TODO Auto-generated method stub
		return this.sup.getSupertypeById(id);
	}

//	@Override
//	public int deleteSubtype(int id) {
//		// TODO Auto-generated method stub
//		return this.sup.deleteSubtype(id);
//	}

	@Override
	public int setTypenameById(String id, String typename) {
		// TODO Auto-generated method stub
		return this.sup.updateTypenameById(id, typename);
	}

}
