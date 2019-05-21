package com.job.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Admin;

@Mapper
public interface AdminDAO {
	String TABLE_NAME = "admin";
	String INSERT_FIELDS = " admin, master, froze, delect, repassword, select, freeze ";
	String SELECT_FIELDS = "id, " + INSERT_FIELDS;
	
	/*
	 * 插入一条管理员账号信息
	 */
	@Insert({"INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{admin},#{master},#{froze},#{delect},#{repassword},#{select},#{freeze}"})
	public int addAdmin(Admin admin);
	
	/*
	 * 根据管理员账号id获取账号全部信息
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE id = #{id}"})
	public Admin getAdminById(int id);
	
	/*
	 * 根据管理员账号id，修改其是否拥有超级管理员权限
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET master = #{master} WHERE id = #{id}"})
	public int setSuper(@Param("master") int master, @Param("id") int id);
}