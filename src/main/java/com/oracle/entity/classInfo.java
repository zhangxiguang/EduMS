package com.oracle.entity;

public class classInfo {
    private Integer classid;

    private String classname;

    private String teaname;

    private String depname;

    private String majname;

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
        this.classname = classname;
    }

    public String getTeaname() {
        return teaname;
    }

    public void setTeaname(String teaname) {
        this.teaname = teaname;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname;
    }

    public String getMajname() {
        return majname;
    }

    public void setMajname(String majname) {
        this.majname = majname;
    }

    public classInfo(Integer classid, String classname, String teaname, String depname, String majname) {
        this.classid = classid;
        this.classname = classname;
        this.teaname = teaname;
        this.depname = depname;
        this.majname = majname;
    }

    public classInfo() {
    }
}
