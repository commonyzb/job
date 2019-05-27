package com.job.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Admin;
import com.job.model.Recruitment;

@Mapper
public interface RecruitmentDAO {
	
	String TABLE_NAME = "recruitment";
	String INSERT_FIELDS = "position,username,demend,salaryHight,salaryLow,experience,"
		   + "worktime,workplace,workdescribe,contacts,tel,address,time,hit,typename,freeze";
	String SELECT_FIELDS = "id " + INSERT_FIELDS;
	
	/*
	 * 插入一条招聘信息
	 */
	@Insert({"INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{position},#{username},#{demend},#{salaryHight},#{salaryLow},#{experience},#{worktime},",
			"#{workplace},#{workdescribe},#{contacts},#{tel},#{address},#{time},#{hit},#{typename},#{freeze}"})
	public int addAdmin(Recruitment recruitment);
	
	/*
	 * 根据招聘信息id获取该招聘信息的全部信息
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE id = #{id}"})
	public Recruitment getRecruitmentById(int id);
	
	/*
	 * 根据招聘信息id，修改该信息是否被删除
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET freeze = #{freeze} WHERE id = #{id}"})
	public int setSuper(@Param("freeze") int freeze, @Param("id") int id);
}