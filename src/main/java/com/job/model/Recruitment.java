package com.job.model;

import java.util.Date;

public class Recruitment {
	
    private Integer id;

    private String position;

    private String username;
    
    private String demend;

    private Integer salaryHight;

    private Integer salaryLow;

    private Integer experience;

    private Date worktime;

    private String workplace;
    
    private String workdescribe;

    private String contacts;

    private String tel;

    private String address;

    private Date time;

    private Integer hit;

    private String typename;

    private Integer freeze;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getDemend() {
		return demend;
	}

	public void setDemend(String demend) {
		this.demend = demend == null ? null : demend.trim();
	}

	public Integer getSalaryHight() {
        return salaryHight;
    }

    public void setSalaryhight(Integer salaryHight) {
        this.salaryHight = salaryHight;
    }

    public Integer getSalaryLow() {
        return salaryLow;
    }

    public void setSalaryLow(Integer salaryLow) {
        this.salaryLow = salaryLow;
    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public Date getWorktime() {
        return worktime;
    }

    public void setWorktime(Date worktime) {
        this.worktime = worktime;
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getWorkdescribe() {
		return workdescribe;
	}

	public void setWorkdescribe(String workdescribe) {
		this.workdescribe = workdescribe == null ? null : workdescribe.trim();
	}

	public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts == null ? null : contacts.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }
}