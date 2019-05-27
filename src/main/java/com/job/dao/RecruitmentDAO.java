package com.job.dao;

import java.util.Date;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Recruitment;

@Mapper
public interface RecruitmentDAO {
	
	String TABLE_NAME = "recruitment";
	String INSERT_FIELDS = "position,username,demend,salaryHight,salaryLow,experience,"
		   + "worktime,workplace,workdescribe,contacts,tel,address,time,hit,typeid,freeze";
	String SELECT_FIELDS = "id " + INSERT_FIELDS;
	
	/*
	 * 插入一条招聘信息
	 */
	@Insert({"INSERT INTO ", TABLE_NAME, "(", INSERT_FIELDS, ") VALUES ( ",
			"#{userid},#{username},#{position},#{demend},#{salaryHight},#{salaryLow},#{experience},#{worktime},",
			"#{workplace},#{workdescribe},#{contacts},#{tel},#{address},#{time},#{hit},#{typeid},#{freeze}"})
	public int addRecruitment(Recruitment recruitment);
	
	/*
	 * 根据招聘信息id获取该招聘信息的全部信息
	 */
	@Select({"SELECT * FROM ", TABLE_NAME, "WHERE id = #{id}"})
	public Recruitment getRecruitmentById(int id);
	
	/*
	 * 根据招聘信息id，修改职位信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET position = #{position} WHERE id = #{id}"})
	public int setPosition(@Param("position") String position, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改商家要求信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET demend = #{demend} WHERE id = #{id}"})
	public int setDemend(@Param("demend") String demend, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改期望最高薪资信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET salaryHight = #{salaryHight} WHERE id = #{id}"})
	public int setSalaryHight(@Param("salaryHight") int salaryHight, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改期望最低薪资信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET salaryLow = #{salaryLow} WHERE id = #{id}"})
	public int setSalaryLow(@Param("salaryLow") int salaryLow, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改工作经验年限信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET experience = #{experience} WHERE id = #{id}"})
	public int setExperience(@Param("experience") int experience, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改工作时间信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET worktime = #{worktime} WHERE id = #{id}"})
	public int setWorktime(@Param("worktime") Date worktime, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改工作地点信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET workplace = #{workplace} WHERE id = #{id}"})
	public int setWorkplace(@Param("workplace") String workplace, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改工作描述信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET workdescribe = #{workdescribe} WHERE id = #{id}"})
	public int setWorkdescribe(@Param("workdescribe") String workdescribe, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改联系人姓名信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET contacts = #{contacts} WHERE id = #{id}"})
	public int setContacts(@Param("contacts") String contacts, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改联系电话信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET tel = #{tel} WHERE id = #{id}"})
	public int setTel(@Param("tel") String tel, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改商家地址信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET address = #{address} WHERE id = #{id}"})
	public int setAddress(@Param("address") String address, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改发布时间信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET time = #{time} WHERE id = #{id}"})
	public int setTime(@Param("time") Date time, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改点击量信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET hit = #{hit} WHERE id = #{id}"})
	public int setHit(@Param("hit") int hit, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改点击量信息
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET typeid = #{typeid} WHERE id = #{id}"})
	public int setTypeid(@Param("typeid") int typeid, @Param("id") int id);
	
	/*
	 * 根据招聘信息id，修改该信息是否被删除
	 */
	@Update({"UPDATE ", TABLE_NAME, "SET freeze = #{freeze} WHERE id = #{id}"})
	public int setSuper(@Param("freeze") int freeze, @Param("id") int id);
	
}