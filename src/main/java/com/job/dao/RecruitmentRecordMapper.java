package com.job.dao;

import com.job.pojo.RecruitmentRecord;
import com.job.pojo.RecruitmentRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentRecordMapper {
    long countByExample(RecruitmentRecordExample example);

    int deleteByExample(RecruitmentRecordExample example);

    int insert(RecruitmentRecord record);

    int insertSelective(RecruitmentRecord record);

    List<RecruitmentRecord> selectByExample(RecruitmentRecordExample example);

    int updateByExampleSelective(@Param("record") RecruitmentRecord record, @Param("example") RecruitmentRecordExample example);

    int updateByExample(@Param("record") RecruitmentRecord record, @Param("example") RecruitmentRecordExample example);
}