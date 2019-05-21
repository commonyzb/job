package com.job.dao;

import com.job.pojo.Subtype;
import com.job.pojo.SubtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubtypeMapper {
    long countByExample(SubtypeExample example);

    int deleteByExample(SubtypeExample example);

    int insert(Subtype record);

    int insertSelective(Subtype record);

    List<Subtype> selectByExample(SubtypeExample example);

    int updateByExampleSelective(@Param("record") Subtype record, @Param("example") SubtypeExample example);

    int updateByExample(@Param("record") Subtype record, @Param("example") SubtypeExample example);
}