package com.oracle.entity;

public class Stumessage {
    private Integer stuid;

    private String stupass;

    private String stuname;

    private String stusex;

    private String stubirthday;

    private Integer studepartment;

    private Integer stumajor;

    private Integer stuclass;

    private String stuphone;

    private String stuaddress;

    private String stustatus;

    private String sturemark;

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public String getStupass() {
        return stupass;
    }

    public void setStupass(String stupass) {
        this.stupass = stupass == null ? null : stupass.trim();
    }

    public String getStuname() {
        return stuname;
    }

    public void setStuname(String stuname) {
        this.stuname = stuname == null ? null : stuname.trim();
    }

    public String getStusex() {
        return stusex;
    }

    public void setStusex(String stusex) {
        this.stusex = stusex == null ? null : stusex.trim();
    }

    public String getStubirthday() {
        return stubirthday;
    }

    public void setStubirthday(String stubirthday) {
        this.stubirthday = stubirthday == null ? null : stubirthday.trim();
    }

    public Integer getStudepartment() {
        return studepartment;
    }

    public void setStudepartment(Integer studepartment) {
        this.studepartment = studepartment;
    }

    public Integer getStumajor() {
        return stumajor;
    }

    public void setStumajor(Integer stumajor) {
        this.stumajor = stumajor;
    }

    public Integer getStuclass() {
        return stuclass;
    }

    public void setStuclass(Integer stuclass) {
        this.stuclass = stuclass;
    }

    public String getStuphone() {
        return stuphone;
    }

    public void setStuphone(String stuphone) {
        this.stuphone = stuphone == null ? null : stuphone.trim();
    }

    public String getStuaddress() {
        return stuaddress;
    }

    public void setStuaddress(String stuaddress) {
        this.stuaddress = stuaddress == null ? null : stuaddress.trim();
    }

    public String getStustatus() {
        return stustatus;
    }

    public void setStustatus(String stustatus) {
        this.stustatus = stustatus == null ? null : stustatus.trim();
    }

    public String getSturemark() {
        return sturemark;
    }

    public void setSturemark(String sturemark) {
        this.sturemark = sturemark == null ? null : sturemark.trim();
    }
}