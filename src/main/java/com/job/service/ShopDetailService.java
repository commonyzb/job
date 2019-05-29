package com.job.service;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.job.model.ShopDetail;

public interface ShopDetailService {
	/**
	 * 添加商家详细信息
	 * @param shopDetail
	 * @return 成功返回1；失败返回0
	 */
	public int addShopDetail(ShopDetail shopDetail);

	/**
	 * 删除商家详细信息
	 * @param id
	 * @return 成功返回1；失败返回0
	 */
	public int deleteShopDetail(int id);
	
	/**
	 * 更新商家详细信息
	 * @param shopDetail
	 * @return 成功返回1；失败返回0
	 */
	public int updateShopDetail(ShopDetail shopDetail);
	
	/**
	 *	通过名字查询商家详细信息
	 * @param username 
	 * @return 返回商家详细信息实体类
	 */
	public ShopDetail getShopDetailByUsername(String username);
	
	/**
	 * 通过id查询商家详细信息
	 * @param id
	 * @return 返回商家详细信息实体类
	 */
	public ShopDetail getShopDetailById(int id);
	
	/**
	 * 查询所有商家详细信息
	 * @return 返回一个商家实体类的List
	 */
	public List<ShopDetail> getAllShopDetails();
	
	/**
	 * 查看商家详细信息表中的信息总数
	 * @return
	 */
	public int getTotal();
	
	/**
	 * 按页查询
	 * @param start  数据开始位置
	 * @param count  数据显示条数(每页显示数据的条数)
	 * @return
	 */
	public List<ShopDetail> getShopDetailByPage(int start,int count);
}
