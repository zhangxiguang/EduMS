package com.oracle.entity;

public class Depmessage {
    private Integer depid;

    private String depname;

    private Integer depdeanid;

    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public Integer getDepdeanid() {
        return depdeanid;
    }

    public void setDepdeanid(Integer depdeanid) {
        this.depdeanid = depdeanid;
    }
}