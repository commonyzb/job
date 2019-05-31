package com.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Admin;

@Mapper
public interface AdminDAO {
	String TABLE_NAME = "admin";
	String INSERT_FIELDS = "admin_name,admin_password,salt,master,froze,`delete`,repassword,`select`,freeze";
//	String SELECT_FIELDS = "id, " + INSERT_FIELDS;
//	String UPDATE_FIELDS = " froze, delete, repassword, select";
	 
	/*
	 * 增加一条管理员账号信息
	 */
	@Insert({"INSERT INTO", TABLE_NAME, "(",INSERT_FIELDS,") VALUES (#{admin_name},#{admin_password},#{salt},#{master},#{froze},#{delete},#{repassword},#{select},#{freeze})"})
	public int addAdmin(Admin admin);
	
	/*
	 * 获取所有管理员信息
	 */
	@Select({"SELECT * FROM",TABLE_NAME})
	public List<Admin> getAllAdmin();
	
	/*
	 * 通过id获取管理员账号信息
	 */
	@Select({"SELECT * FROM", TABLE_NAME, "WHERE id = #{id}"})
	public Admin getAdminById(@Param("id") String id);
	
	/*
	 * 通过管理员名字查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE admin_name = #{admin_name}"})
	public Admin getAdminByAdmin_name(@Param("admin_name") String admin_name);
	
	/*
	 * 通过管理员账号密码查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE admin_name = #{admin_name} AND admin_password = #{admin_password}"})
	public int getAdminByNameAndPassword(@Param("admin_name")String admin_name,@Param("admin_password") String admin_password);
	
	/*
	 * 通过超级管理员权限查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE master = #{master}"})
	public List<Admin> getAdminByMaster(@Param("master") int master);
	
	/*
	 * 通过冻结权限查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE froze = #{froze}"})
	public List<Admin> getAdminByFroze(@Param("froze") int froze);
	/*
	 * 通过删除权限查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE `delete` = #{delete}"})
	public List<Admin> getAdminByDel(@Param("delete") int delete);
	
	/*
	 * 通过修改密码权限查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE repassword = #{repassword}"})
	public List<Admin> getAdminByRepassword(@Param("repassword") int repassword);
	
	/*
	 * 通过查询权限 查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE `select` = #{select}"})
	public List<Admin> getAdminBySelect(@Param("select") int select);
	
	/*
	 * 通过冻结权限查询管理员信息
	 */
	@Select({"SELECT * FROM ",TABLE_NAME,"WHERE freeze = #{freeze}"})
	public List<Admin> getAdminByFreeze(@Param("freeze") int freeze);
	
	/*
	 * 根据管理员账号id，修改其是否拥有超级管理员权限
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET master = #{master} WHERE id = #{id}"})
	public int setSuper(@Param("master") int master, @Param("id") String id);
	
	/*
	 * 根据管理员Id，更改其管理员名
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET admin_name = #{admin_name} WHERE id = #{id}"})
	public int setAdmin_name(@Param("admin_name") String admin_name, @Param("id") String id);
	
	/*
	 * 根据管理员Id，更改其密码
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET admin_password = #{admin_password} WHERE id = #{id}"})
	public int setAdmin_password(@Param("admin_password") String admin_name, @Param("id") String id);
	
	/*
	 * 根据管理员Id，更改其salt值
	 */
	@Update({"UPDATE ",TABLE_NAME,"SET salt = #{salt} WHERE id = #{id}"})
	public int setSalt(@Param("salt") String salt,@Param("id") String id);
	
	/*
	 * 通过管理员ID更改其冻结权限
	 */
	@Update({"UPDATE ", TABLE_NAME, " SET froze = #{froze} WHERE id = #{id}"})
	public int setFroze(@Param("froze") int froze,@Param("id") String id);
	
	/*
	 * 通过管理员ID更改其删除权限
	 */
	@Update({"UPDATE ", TABLE_NAME, " SET `delete` = #{delete} WHERE id = #{id}"})
	public int setDelete(@Param("delete") int delete,@Param("id") String id);
	
	/*
	 * 通过管理员ID更改其修改密码权限
	 */
	@Update({"UPDATE ", TABLE_NAME, " SET repassword = #{repassword} WHERE id = #{id}"})
	public int setRepassword(@Param("repassword") int repassword,@Param("id")String id);
	
	/*
	 * 通过管理员ID更改其查询权限
	 */
	@Update({"UPDATE ", TABLE_NAME, " SET `select` = #{select} WHERE id = #{id}"})
	public int setSelect(@Param("select") int select,@Param("id") String id);
	
	/*
	 * 通过管理员Id更改其账号是否被冻结
	 */
	@Update({"UPDATE ", TABLE_NAME, " SET freeze = #{freeze} WHERE id = #{id}"})
	public int setFreeze(@Param("freeze") int freeze,@Param("id") String id);
	
	/*
	 * 通过ID删除管理员信息
	 */
	@Delete(value = { "DELETE FROM ",TABLE_NAME," WHERE id = #{id}" })
	public int delAdminById(@Param("id") String id);
		
}