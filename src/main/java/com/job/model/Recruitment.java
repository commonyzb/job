package com.job.model;

import java.util.Date;

public class Recruitment {
	
    private String id;

    private String position;

    private String userid;
    
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

    private Integer hit = 0;
    
    private Integer typeid;

    private Integer status = 0;
    
    private Integer freeze = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
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

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }

	@Override
	public String toString() {
		return "Recruitment [id=" + id + ", position=" + position + ", userid=" + userid + ", username=" + username
				+ ", demend=" + demend + ", salaryHight=" + salaryHight + ", salaryLow=" + salaryLow + ", experience="
				+ experience + ", worktime=" + worktime + ", workplace=" + workplace + ", workdescribe=" + workdescribe
				+ ", contacts=" + contacts + ", tel=" + tel + ", address=" + address + ", time=" + time + ", hit=" + hit
				+ ", typeid=" + typeid + ", status=" + status + ", freeze=" + freeze + "]";
	}
    
    
}