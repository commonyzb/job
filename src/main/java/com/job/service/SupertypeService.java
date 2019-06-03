package com.job.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.job.model.Subtype;
import com.job.model.Supertype;

public interface SupertypeService {
	/**
	 * 增加一个类别
	 * @param supertype
	 * @return
	 */
	public int addSupertype(Supertype supertype);
	/**
	 * 查询所有类别
	 * @return
	 */
	public List<Supertype> getAllSupertype();
	/**
	 * 根据id查询类别
	 * @param id
	 * @return
	 */
	public Subtype getSupertypeById(String id);
//	/**
//	 * 根据id删除类别
//	 * @param id
//	 * @return
//	 */
//	public int deleteSubtype(int id);
	/**
	 * 根据id修改类别
	 * @param id
	 * @param typename
	 * @return
	 */
	public int setTypenameById(@Param("id") String id,@Param("typename") String typename);

}
