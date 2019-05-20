package com.job.dao;

import com.job.pojo.Recruitment;
import com.job.pojo.RecruitmentExample;
import com.job.pojo.RecruitmentWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentMapper {
    long countByExample(RecruitmentExample example);

    int deleteByExample(RecruitmentExample example);

    int insert(RecruitmentWithBLOBs record);

    int insertSelective(RecruitmentWithBLOBs record);

    List<RecruitmentWithBLOBs> selectByExampleWithBLOBs(RecruitmentExample example);

    List<Recruitment> selectByExample(RecruitmentExample example);

    int updateByExampleSelective(@Param("record") RecruitmentWithBLOBs record, @Param("example") RecruitmentExample example);

    int updateByExampleWithBLOBs(@Param("record") RecruitmentWithBLOBs record, @Param("example") RecruitmentExample example);

    int updateByExample(@Param("record") Recruitment record, @Param("example") RecruitmentExample example);
}