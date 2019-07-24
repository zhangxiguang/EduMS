package com.oracle.entity;

public class Teachresource {
    private Integer resid;

    private Integer couid;

    private String uptime;

    private String resname;

    private String restype;

    private Integer ressize;

    public Integer getResid() {
        return resid;
    }

    public void setResid(Integer resid) {
        this.resid = resid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public String getUptime() {
        return uptime;
    }

    public void setUptime(String uptime) {
        this.uptime = uptime == null ? null : uptime.trim();
    }

    public String getResname() {
        return resname;
    }

    public void setResname(String resname) {
        this.resname = resname == null ? null : resname.trim();
    }

    public String getRestype() {
        return restype;
    }

    public void setRestype(String restype) {
        this.restype = restype == null ? null : restype.trim();
    }

    public Integer getRessize() {
        return ressize;
    }

    public void setRessize(Integer ressize) {
        this.ressize = ressize;
    }
}