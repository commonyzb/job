package com.job.pojo;

public class ResumeWithBLOBs extends Resume {
    private String intruduce;

    private String experience;

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
}