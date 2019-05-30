package com.job.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.job.model.Subtype;

public interface SubtypeService {
	/**
	 * 增加一个职务
	 * @param subtype
	 * @return
	 */
	public int addSubtype(Subtype subtype);
	/**
	 * 根据id更新一个职务
	 * @param id
	 * @param typename
	 * @return
	 */
	public int setSubtype(int id,String typename);
	/**
	 * 根据id查询职务
	 * @param id
	 * @return
	 */
	public Subtype getSubtype(int id);
	/**
	 * 查询所有职务
	 * @return
	 */
	public List<Subtype> getAllSubtype();
}
