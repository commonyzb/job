package com.job.dao;

import com.job.pojo.Supertype;
import com.job.pojo.SupertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SupertypeMapper {
    long countByExample(SupertypeExample example);

    int deleteByExample(SupertypeExample example);

    int insert(Supertype record);

    int insertSelective(Supertype record);

    List<Supertype> selectByExample(SupertypeExample example);

    int updateByExampleSelective(@Param("record") Supertype record, @Param("example") SupertypeExample example);

    int updateByExample(@Param("record") Supertype record, @Param("example") SupertypeExample example);
}