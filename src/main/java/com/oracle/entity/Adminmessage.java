package com.oracle.entity;

public class Adminmessage {
    private Integer admid;

    private String admname;

    private String admpass;

    private String admphone;

    private Boolean admstatus;

    public Integer getAdmid() {
        return admid;
    }

    public void setAdmid(Integer admid) {
        this.admid = admid;
    }

    public String getAdmname() {
        return admname;
    }

    public void setAdmname(String admname) {
        this.admname = admname == null ? null : admname.trim();
    }

    public String getAdmpass() {
        return admpass;
    }

    public void setAdmpass(String admpass) {
        this.admpass = admpass == null ? null : admpass.trim();
    }

    public String getAdmphone() {
        return admphone;
    }

    public void setAdmphone(String admphone) {
        this.admphone = admphone == null ? null : admphone.trim();
    }

    public Boolean getAdmstatus() {
        return admstatus;
    }

    public void setAdmstatus(Boolean admstatus) {
        this.admstatus = admstatus;
    }

    @Override
    public String toString() {
        return "Adminmessage{" +
                "admid=" + admid +
                ", admname='" + admname + '\'' +
                ", admpass='" + admpass + '\'' +
                ", admphone='" + admphone + '\'' +
                ", admstatus=" + admstatus +
                '}';
    }
}