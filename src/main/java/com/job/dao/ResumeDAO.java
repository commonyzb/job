package com.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Resume;
import com.job.model.ShopDetail;

@Mapper
public interface ResumeDAO {
	String TABLE_NAME = "resume";
	String INSERT_FILEDS = "id, username , truename , sex , hight , knowledge , brithday "
			+ ", address , naddress , nation , 	school , hobby , speciality , 	intruduce , "
			+ "	experience , 	worktime , salaryHight , salaryLow , treatment , tel , email , "
			+ "picture , createTime , typeid , hit , freeze ";
	String SELECT_FILEDS = "id ," + INSERT_FILEDS;
	
	/** 
	 * 完善个人简历信息
	 * @param resume
	 * @return
	 */
	@Insert({"insert into "+TABLE_NAME+" ( "+INSERT_FILEDS+" ) values("
			+ "#{id}, #{userName} , #{trueName} , #{sex} , #{hight} , #{knowledge} , #{brithday} , #{address} ,"
			+ " #{naddress} , #{nation} , #{school} , #{hobby} , #{speciality} , #{intruduce} ,  "
			+ " #{experience} , #{workTime} , #{salaryHight} , #{salaryLow} , #{treatment} , #{tel} , "
			+ "#{email} , #{picture} , #{createTime} , #{typeId} , #{hit} , #{freeze} )"})
	public int insertResume(Resume resume);
	
	/**
	 * 冻结简历信息
	 * @param freeze 简历状态
	 */
	@Update({"update "+TABLE_NAME+" set freeze = #{freeze} where id = #{id}"} )
	public int freezeResume(@Param("freeze") int freeze,@Param("id") String id);
	
	/**
	 * 真正删除简历信息
	 */
	@Delete({"delete from "+TABLE_NAME+" where id = #{id}"})
	public int deleteResume(String id);
	
	/**
	 * 更新简历信息
	 */

	@Update({"update "+TABLE_NAME+" set username=#{userName} , trueName=#{trueName} , sex=#{sex} ,"
			+ " hight=#{hight} , knowledge=#{knowledge} , brithday=#{brithday} , address=#{address} ,"
			+ " naddress=#{naddress} , nation=#{nation} , school=#{school} , hobby=#{hobby} , "
			+ " speciality=#{speciality} , intruduce=#{intruduce} , experience=#{experience} , "
			+ " worktime=#{workTime} , salaryHight=#{salaryHight} , salaryLow=#{salaryLow} , "
			+ " treatment=#{treatment} , tel=#{tel} , email=#{email} , picture=#{picture} , "
			+ " createTime=#{createTime} , typeId=#{typeId} , hit=#{hit} , freeze=#{freeze} "
			+ " where id=#{id}"})
	public int updateResume(Resume resume);
	
	/**
	 * 按id查看简历信息
	 */
	@Select({"select * from "+TABLE_NAME+" where id=#{id} "})
	public Resume selectResumeById(String id);
	
	/**
	 * 按用户名查看简历信息
	 */
	@Select({"select * from "+TABLE_NAME+" where username=#{userName}"})
	public Resume selectResumeByUserName(String userName);
	
	/**
	 * 查看商家详细信息表中的信息总数
	 * @return
	 */
	@Select({"select count(*) from "+TABLE_NAME})
	public int getTotal();
	
	/**
	 * 按页查询
	 * @param start  数据开始位置
	 * @param count  数据显示条数(每页显示数据的条数)
	 * @return
	 */
	@Select({"select * from " +TABLE_NAME+" limit #{start},#{count} "})
	public List<Resume> selectResumeByPage(@Param("start") int start,@Param("count") int count);
}