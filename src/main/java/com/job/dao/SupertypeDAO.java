package com.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.Subtype;
import com.job.model.Supertype;

@Mapper
public interface SupertypeDAO {
	String TABLE_NAME="supertype";//类别父表
	String INSERT_FIELDS=" typename ";
	String SELECT_FIELDS=" id, ";
	//id  父行业类别id  typename  父类行业
	
	/*
	 * 增加一个类别
	 *@param supertype
	 * @return
	 */
	@Insert({"INSERT INTO "+ TABLE_NAME+ "("+ INSERT_FIELDS+ ") VALUES ( "+
	"#{typename})"})
	public int addSupertype(Supertype supertype);
	/*
	 * 查询所有类别
	 * 
	 * @return
	 */
	@Select({"SELECT * FROM "+ TABLE_NAME})
	public List<Supertype> getAllSupertype(); 
	/*
	 * 根据id查询类别
	 * 
	 * @param id
	 * @return
	 */
	@Select({"SELECT * FROM "+ TABLE_NAME+ " WHERE id = #{id}"})
	public Subtype getSupertypeById(int id);
	
//	/*
//	 *根据id删除一个类别
//	 *
//	 * @param id
//	 * @return
//	 */
//	@Delete({"DELETE * FROM "+ TABLE_NAME+ " WHERE id = #{id}"})
//	public int deleteSubtype(int id);
	/*
	 * 根据id修改类别名
	 * 
	 * @param id
	 * @param typename
	 * @return
	 */
	@Update({"UPDATE "+ TABLE_NAME+ " SET typename=#{typename} WHERE id=#{id}"})
	public int updateTypenameById(@Param("id") int id,@Param("typename") String typename);
	
}