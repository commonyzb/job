package com.job.dao;

import com.job.pojo.ShopDetail;
import com.job.pojo.ShopDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopDetailMapper {
    long countByExample(ShopDetailExample example);

    int deleteByExample(ShopDetailExample example);

    int insert(ShopDetail record);

    int insertSelective(ShopDetail record);

    List<ShopDetail> selectByExample(ShopDetailExample example);

    int updateByExampleSelective(@Param("record") ShopDetail record, @Param("example") ShopDetailExample example);

    int updateByExample(@Param("record") ShopDetail record, @Param("example") ShopDetailExample example);
}