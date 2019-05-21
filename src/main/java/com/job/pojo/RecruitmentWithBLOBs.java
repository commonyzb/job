package com.job.pojo;

public class RecruitmentWithBLOBs extends Recruitment {
    private String demend;

    private String workdescribe;

    public String getDemend() {
        return demend;
    }

    public void setDemend(String demend) {
        this.demend = demend == null ? null : demend.trim();
    }

    public String getWorkdescribe() {
        return workdescribe;
    }

    public void setWorkdescribe(String workdescribe) {
        this.workdescribe = workdescribe == null ? null : workdescribe.trim();
    }
}