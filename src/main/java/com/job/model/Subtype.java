package com.job.model;

public class Subtype {
    private String id;

    private String supertypeid;

    private String typename;

    private Integer hit = 0;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSupertypeid() {
        return supertypeid;
    }

    public void setSupertypeid(String supertypeid) {
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