package com.job.model;

public class Subtype {
    private Integer id;

    private Integer supertypeid;

    private String typename;

    private Integer hit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSupertypeid() {
        return supertypeid;
    }

    public void setSupertypeid(Integer supertypeid) {
        this.supertypeid = supertypeid;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getHit() {
        return hit;
    }

    public void setHit(Integer hit) {
        this.hit = hit;
    }
}