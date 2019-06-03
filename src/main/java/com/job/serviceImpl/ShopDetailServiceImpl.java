package com.job.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.job.dao.ShopDetailDAO;
import com.job.model.ShopDetail;
import com.job.service.ShopDetailService;

@Service
public class ShopDetailServiceImpl implements ShopDetailService{

	@Resource
	ShopDetailDAO shopDetailDao;
	@Override
	public int addShopDetail(ShopDetail shopDetail) {
		return this.shopDetailDao.insertShopDetail(shopDetail);
	}

	@Override
	public int deleteShopDetail(String id) {
		return this.shopDetailDao.deleteShopDetail(id);
	}

	@Override
	public int updateShopDetail(ShopDetail shopDetail) {
		return this.shopDetailDao.updateShopDetail(shopDetail);
	}

	@Override
	public ShopDetail getShopDetailByUsername(String username) {
		return this.shopDetailDao.selectShopDetailByUsername(username);
	}

	@Override
	public ShopDetail getShopDetailById(String id) {
		return this.shopDetailDao.selectShopDetailById(id);
	}

	@Override
	public List<ShopDetail> getAllShopDetails() {
		return this.shopDetailDao.selectAllShopDetil();
	}

	@Override
	public int getTotal() {
		return this.shopDetailDao.getTotal();
	}

	@Override
	public List<ShopDetail> getShopDetailByPage(int start, int count) {
		return this.shopDetailDao.selectShopDetailByPage(start, count);
	}

}
