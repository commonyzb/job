package com.job.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.job.model.ShopDetail;

@Mapper
public interface ShopDetailDAO {
	String TABLE_NAME = "shop_detail";
	String INSERT_FILEDS = "id, userName , name , email , tel , manage , address , resume , picture , contacts ";

	/**
	 * 添加商家详细信息
	 * 
	 * @param shopDetail
	 * @return
	 */
	@Insert({ "insert into " + TABLE_NAME + "(" + INSERT_FILEDS + ") values( "
			+ "#{id},#{userName} , #{name} , #{email} , #{tel} , #{manage} , "
			+ " #{address} , #{resume} , #{picture} , #{contacts} )" })
	public int insertShopDetail(ShopDetail shopDetail);

	/**
	 * 删除商家详细信息
	 * 
	 * @param id
	 * @return
	 */
	@Delete({ "delete from " + TABLE_NAME + " where id=#{id}" })
	public int deleteShopDetail(String id);

	/**
	 * 更新商家详细信息
	 * 
	 * @param id
	 * @return
	 */
	@Update({ "update " + TABLE_NAME + " set username=#{userName} , name=#{name} , email=#{email} , tel=#{tel} ,"
			+ " manage=#{manage} , address=#{address} , resume=#{resume} , picture=#{picture} , contacts=#{contacts} "
			+ "where id=#{id}" })
	public int updateShopDetail(ShopDetail shopDetail);

	/**
	 * 通过名字查看商家详细信息
	 * 
	 * @param username
	 * @return 商家信息实体类
	 */
	@Select({ "select * from " + TABLE_NAME + " where username=#{userName}" })
	public ShopDetail selectShopDetailByUsername(String username);

	/**
	 * 通过id查看商家详细信息
	 * 
	 * @param id
	 * @return
	 */
	@Select({ "select * from " + TABLE_NAME + " where id=#{id}" })
	public ShopDetail selectShopDetailById(String id);

	/**
	 * 查看所有商家的详细信息
	 * 
	 * @return
	 */
	@Select({ "select * from " + TABLE_NAME })
	public List<ShopDetail> selectAllShopDetil();

	/**
	 * 查看商家详细信息表中的信息总数
	 * 
	 * @return
	 */
	@Select({ "select count(*) from " + TABLE_NAME })
	public int getTotal();

	/**
	 * 按页查询
	 * 
	 * @param start 数据开始位置
	 * @param count 数据显示条数(每页显示数据的条数)
	 * @return
	 */
	@Select({ "select * from " + TABLE_NAME + " limit #{start},#{count} " })
	public List<ShopDetail> selectShopDetailByPage(@Param("start") int start, @Param("count") int count);
}