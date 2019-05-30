package com.job.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.User;

@Mapper
public interface UserDAO {
	String TABLE_NAME = " user ";
	String INSERT_FIELDS = " username, password, salt, type, freeze";
	String SELECT_FIELDS = " id, " + INSERT_FIELDS;

	/*
	 * 插入一条用户账号信息
	 */
	@Insert({ "INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{username},#{password},#{salt},#{type},#{freeze})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int addUser(User user);

	/*
	 * 根据用户id查询用户所有信息
	 */
	@Select({ "SELECT * FROM ", TABLE_NAME, " WHERE id = #{id}" })
	public User getUserByid(int id);

	/*
	 * 根据用户username查询用户所有信息
	 */
	@Select({ "SELECT * FROM ", TABLE_NAME, " WHERE username = #{username}" })
	public User getUserByusername(String username);

	/*
	 * 根据用户id更新用户密码
	 */
	@Update({ "UPDATE ", TABLE_NAME, " SET password = #{password}  where id = #{id}" })
//	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int setpasswordByid(@Param("id") int id, @Param("password") String password);

	/*
	 * 根据id更新用户状态
	 */
	@Update({ "UPDATE", TABLE_NAME, "SET freeze= #{freeze} where id= #{id}" })
	public int setfreezeByid(@Param("id") int id,@Param("freeze") int freeze);

	/*
	 * 根据id更新用户类型
	 */
	@Update({ "UPDATE", TABLE_NAME, "SET type=#{type} where id=#{id}" })
	public int settypeByid(@Param("id") int id,@Param("type") int type);

}