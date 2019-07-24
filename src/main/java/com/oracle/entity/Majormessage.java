package com.oracle.entity;

public class Majormessage {
    private Integer majid;

    private Integer depid;

    private String majname;

    private Integer majdeanid;

    private String majintroduction;

    public Integer getMajid() {
        return majid;
    }

    public void setMajid(Integer majid) {
        this.majid = majid;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getMajname() {
        return majname;
    }

    public void setMajname(String majname) {
        this.majname = majname == null ? null : majname.trim();
    }

    public Integer getMajdeanid() {
        return majdeanid;
    }

    public void setMajdeanid(Integer majdeanid) {
        this.majdeanid = majdeanid;
    }

    public String getMajintroduction() {
        return majintroduction;
    }

    public void setMajintroduction(String majintroduction) {
        this.majintroduction = majintroduction == null ? null : majintroduction.trim();
    }
}