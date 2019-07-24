package com.oracle.entity;

public class Classmessage {
    private Integer classid;

    private String classname;

    private Integer teaid;

    private Integer depid;

    private Integer majid;

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public Integer getMajid() {
        return majid;
    }

    public void setMajid(Integer majid) {
        this.majid = majid;
    }

    public Classmessage() {
    }

    public Classmessage(Integer classid, String classname, Integer teaid, Integer depid, Integer majid) {
        this.classid = classid;
        this.classname = classname;
        this.teaid = teaid;
        this.depid = depid;
        this.majid = majid;
    }
}