package com.job.dao;

import com.job.pojo.Resume;
import com.job.pojo.ResumeExample;
import com.job.pojo.ResumeWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResumeMapper {
    long countByExample(ResumeExample example);

    int deleteByExample(ResumeExample example);

    int insert(ResumeWithBLOBs record);

    int insertSelective(ResumeWithBLOBs record);

    List<ResumeWithBLOBs> selectByExampleWithBLOBs(ResumeExample example);

    List<Resume> selectByExample(ResumeExample example);

    int updateByExampleSelective(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExampleWithBLOBs(@Param("record") ResumeWithBLOBs record, @Param("example") ResumeExample example);

    int updateByExample(@Param("record") Resume record, @Param("example") ResumeExample example);
}