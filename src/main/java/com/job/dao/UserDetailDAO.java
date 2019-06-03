package com.job.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.UserDetail;

@Mapper
public interface UserDetailDAO {
	String TABLE_NAME = " user_detail ";
	String INSERT_FIELDS = "id , username , age , sex , birthday , address , knowledgeId, email , tel , time ";
	String SELECT_FIELDS = " id, " + INSERT_FIELDS;

	/*
	 * 插入一条用户个人信息
	 */
	@Insert({ "INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{id},#{username},#{age},#{sex},#{birthday},#{address},#{knowledgeId},#{email},#{tel},#{time})" })
	@Options(useGeneratedKeys = true, keyProperty = "id")
	public int addUserDetail(UserDetail userdetail);

	/*
	 * 根据id获取用户个人信息
	 */
	@Select({ "SELECT * FROM ", TABLE_NAME, " WHERE id = #{id}" })
	public UserDetail getUserDetailByid(int id);

	/*
	 * 根据账号username获取用户个人信息
	 */
	@Select({ "SELECT * FROM ", TABLE_NAME, " WHERE username = #{username}" })
	public UserDetail getUserDetailByusername(String username);

	/*
	 * 根据id更新用户个人信息
	 */
	@Update({ "UPDATE", TABLE_NAME,
			"SET age=#{age},sex=#{sex},birthday=#{birthday},address=#{address},knowledgeId=#{knowledgeId},email=#{email},tel=#{tel},time=#{time} where id= #{id}" })
	public int setUserDetailByid(UserDetail userDetail);
	
	
	/*
	 * 账号信息是否冻结
	 */
	@Update({ "UPDATE", TABLE_NAME,
	"SET freeze=#{freeze} where id= #{id}" })
	public int setUserDetailfreezeByid(@Param("id") int id,@Param("freeze") int freeze);
	
}