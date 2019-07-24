package com.oracle.entity;

public class Teamessage {
    private Integer teaid;

    private Integer teadepartment;

    private String teapass;

    private String teaname;

    private String teasex;

    private String teanumber;

    private String teaphone;

    private String teaaddress;

    private String tealevel;

    private String teadegree;

    private String teaboss;

    private String tearemark;

    public Integer getTeaid() {
        return teaid;
    }

    public void setTeaid(Integer teaid) {
        this.teaid = teaid;
    }

    public Integer getTeadepartment() {
        return teadepartment;
    }

    public void setTeadepartment(Integer teadepartment) {
        this.teadepartment = teadepartment;
    }

    public String getTeapass() {
        return teapass;
    }

    public void setTeapass(String teapass) {
        this.teapass = teapass == null ? null : teapass.trim();
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname == null ? null : teaname.trim();
    }

    public String getTeasex() {
        return teasex;
    }

    public void setTeasex(String teasex) {
        this.teasex = teasex == null ? null : teasex.trim();
    }

    public String getTeanumber() {
        return teanumber;
    }

    public void setTeanumber(String teanumber) {
        this.teanumber = teanumber == null ? null : teanumber.trim();
    }

    public String getTeaphone() {
        return teaphone;
    }

    public void setTeaphone(String teaphone) {
        this.teaphone = teaphone == null ? null : teaphone.trim();
    }

    public String getTeaaddress() {
        return teaaddress;
    }

    public void setTeaaddress(String teaaddress) {
        this.teaaddress = teaaddress == null ? null : teaaddress.trim();
    }

    public String getTealevel() {
        return tealevel;
    }

    public void setTealevel(String tealevel) {
        this.tealevel = tealevel == null ? null : tealevel.trim();
    }

    public String getTeadegree() {
        return teadegree;
    }

    public void setTeadegree(String teadegree) {
        this.teadegree = teadegree == null ? null : teadegree.trim();
    }

    public String getTeaboss() {
        return teaboss;
    }

    public void setTeaboss(String teaboss) {
        this.teaboss = teaboss == null ? null : teaboss.trim();
    }

    public String getTearemark() {
        return tearemark;
    }

    public void setTearemark(String tearemark) {
        this.tearemark = tearemark == null ? null : tearemark.trim();
    }
}