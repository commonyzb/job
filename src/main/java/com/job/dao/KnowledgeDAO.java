package com.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Knowledge;

@Mapper
public interface KnowledgeDAO 
{
	
	String TABLE_NAME = "knowledge";
	String INSERT_FIELD = "type_name";
	String SELECT_NAME = "id";
	
	/*
	 * 添加一条学历信息
	 */
	@Insert({"INSERT INTO",TABLE_NAME,"(",INSERT_FIELD,") VALUES (#{type_name})" })
	public int addKnowledge(Knowledge knowldge);
	
	/*
	 * 通过ID查询学历信息
	 */
	@Select({ "SELECT * FROM",TABLE_NAME,"WHERE id = #{id}" })
	public Knowledge getKnowledgeById(@Param("id") String id);
	
	@Select({"SELECT * FROM",TABLE_NAME,"WHERE type_name = #{type_name}"})
	public List<Knowledge> getKnowledgeByType(@Param("type_name") String type_name);
	
	/*
	 * 通过学历查询
	 */
	@Select({"SELECT * FROM ",TABLE_NAME," WHERE type_name = #{type_name}"})
	public List<Knowledge> getKnowledgeByTypename(@Param("type_name") String type_name);
	
	/*
	 * 通过ID更新学历信息
	 */
	@Update({ "UPDATE ",TABLE_NAME," set type_name = #{type_name} WHERE id = #{id}" })
	public int updateKnowledgeById(@Param("id") String id,@Param("type_name") String type_name); 
	
//	@Update({ "UPDATE ",TABLE_NAME," set type_name = #{type_name} WHERE id = #{id}" })
//	public int updateKnowledge(Knowledge knowledge); 
	
	/*
	 * 通过ID删除学历信息
	 */
	@Delete(value = { "DELETE FROM",TABLE_NAME," where id = #{id}" })
	public int delKnowledgeById(@Param("id") String id);
	
	/*
	 * 通过Knowledge对象删除Knowledge信息
	 */
	@Delete(value = { "DELETE FROM",TABLE_NAME," where id = #{id} and type_name = #{type_name}" })
	public int delKnowledge(Knowledge knowledge);
}