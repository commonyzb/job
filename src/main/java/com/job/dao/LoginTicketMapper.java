package com.job.dao;

import com.job.pojo.LoginTicket;
import com.job.pojo.LoginTicketExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoginTicketMapper {
    long countByExample(LoginTicketExample example);

    int deleteByExample(LoginTicketExample example);

    int insert(LoginTicket record);

    int insertSelective(LoginTicket record);

    List<LoginTicket> selectByExample(LoginTicketExample example);

    int updateByExampleSelective(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);

    int updateByExample(@Param("record") LoginTicket record, @Param("example") LoginTicketExample example);
}