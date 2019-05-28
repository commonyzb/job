package com.job.dao;

import java.util.ArrayList;
import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Recruitment;

@Mapper
public interface RecruitmentRecordDAO {
	
	String TABLE_NAME = " recruitment_record ";
	String INSERT_FIELDS = " recruitmentid,companyid,time,state,freeze,";
	String SELECT_FIELDS = " id," + INSERT_FIELDS;
	
	/*
	 * 插入一条招聘投放记录
	 */
	@Insert({"INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{id},#{companyid},#{time},#{state},#{freeze}"})
	public int addRecruitment(Recruitment recruitment);
	
	/*
	 * 根据招聘投放记录id获取该招聘投放记录的全部信息
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE id = #{id}"})
	public Recruitment getRecruitmentRecorById(int id);
	
	/*
	 * 根据招聘信息id获取该招聘投放记录的全部信息
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE recruitmentid = #{recruitmentid} AND freeze=0"})
	public Recruitment getRecruitmentRecorByRecid(int recruitmentid);
	
	/*
	 * 根据商家id获取某商家的全部招聘投放记录
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE companyid = #{companyid} AND freeze=0"})
	public ArrayList<Recruitment> getRecruitmentRecorListByComid(int companyid);
	
	/*
	 * 根据招聘信息id，修改招聘信息id
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET recruitmentid = #{recruitmentid} WHERE id = #{id} AND freeze=0"})
	public int setRecruitmentid(@Param("recruitmentid") int recruitmentid, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改用户账户
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET username = #{username} WHERE id = #{id} AND freeze=0"})
	public int setUsername(@Param("username") String username, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改商家账户
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET company = #{company} WHERE id = #{id} AND freeze=0"})
	public int setCompany(@Param("company") String company, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改投放时间
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET time = #{time} WHERE id = #{id} AND freeze=0"})
	public int setTime(@Param("time") Date time, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改是否显示 0为显示，1为不显示，默认为0
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET state = #{state} WHERE id = #{id} AND freeze=0"})
	public int setState(@Param("state") int state, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改是否冻结 0为没有冻结，1为冻结，默认为0
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET freeze = #{freeze} WHERE id = #{id}"})
	public int setFreeze(@Param("freeze") int freeze, @Param("id") int id);
	
}