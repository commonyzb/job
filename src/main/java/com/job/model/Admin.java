package com.job.model;

public class Admin {
    private Integer id;

    private String admin;

    private Integer master;

    private Integer froze;

    private Integer delect;

    private Integer repassword;

    private Integer select;

    private Integer freeze;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin == null ? null : admin.trim();
    }

    public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getFroze() {
        return froze;
    }

    public void setFroze(Integer froze) {
        this.froze = froze;
    }

    public Integer getDelect() {
        return delect;
    }

    public void setDelect(Integer delect) {
        this.delect = delect;
    }

    public Integer getRepassword() {
        return repassword;
    }

    public void setRepassword(Integer repassword) {
        this.repassword = repassword;
    }

    public Integer getSelect() {
        return select;
    }

    public void setSelect(Integer select) {
        this.select = select;
    }

    public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }
}