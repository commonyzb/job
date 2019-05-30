package com.job.model;

import java.util.Date;

public class RecruitmentRecord {
    private Integer id;
    
    private Integer recruitmentid;
    
    private Integer companyid;

    private Date time;

    private Integer state = 0;
    
    private Integer freeze = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRecruitmentid() {
		return recruitmentid;
	}

	public void setRecruitmentid(Integer recruitmentid) {
		this.recruitmentid = recruitmentid;
	}

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getState() {
		return state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }
}