package com.job.model;

import java.util.Date;

public class Resume {
    private Integer id;

    private String username;

    private String truename;

    private String sex;

    private Short hight;

    private String knowledge;

    private Date brithday;

    private String address;

    private String naddress;

    private String nation;

    private String school;

    private String hobby;

    private String speciality;
    
    private String intruduce;
    
    private String experience;

    private Integer worktime;

    private Integer salaryHight;

    private Integer salaryLow;

    private String treatment;

    private String tel;

    private String email;

    private String picture;

    private Date createtime;

    private Integer typeid;

    private Integer hit = 0;

    private Integer freeze = 0;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Short getHight() {
        return hight;
    }

    public void setHight(Short hight) {
        this.hight = hight;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge == null ? null : knowledge.trim();
    }

    public Date getBrithday() {
        return brithday;
    }

    public void setBrithday(Date brithday) {
        this.brithday = brithday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getNaddress() {
        return naddress;
    }

    public void setNaddress(String naddress) {
        this.naddress = naddress == null ? null : naddress.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getIntruduce() {
		return intruduce;
	}

	public void setIntruduce(String intruduce) {
		this.intruduce = intruduce == null ? null : intruduce.trim();
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience == null ? null : experience.trim();
	}

	public Integer getWorktime() {
        return worktime;
    }

    public void setWorktime(Integer worktime) {
        this.worktime = worktime;
    }

    public Integer getSalaryHight() {
        return salaryHight;
    }

    public void setSalaryHight(Integer salaryHight) {
        this.salaryHight = salaryHight;
    }

    public Integer getSalaryLow() {
        return salaryLow;
    }

    public void setSalaryLow(Integer salaryLow) {
        this.salaryLow = salaryLow;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment == null ? null : treatment.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getTypename() {
        return typeid;
    }

    public void setTypename(Integer typeid) {
        this.typeid = typeid;
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }

    public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }
}