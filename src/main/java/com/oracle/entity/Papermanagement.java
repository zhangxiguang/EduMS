package com.oracle.entity;

public class Papermanagement {
    private Integer papid;

    private Integer taeid;

    private String uploadtime;

    private String papnmae;

    private String papfield;

    private String uploadplace;

    public Integer getPapid() {
        return papid;
    }

    public void setPapid(Integer papid) {
        this.papid = papid;
    }

    public Integer getTaeid() {
        return taeid;
    }

    public void setTaeid(Integer taeid) {
        this.taeid = taeid;
    }

    public String getUploadtime() {
        return uploadtime;
    }

    public void setUploadtime(String uploadtime) {
        this.uploadtime = uploadtime == null ? null : uploadtime.trim();
    }

    public String getPapnmae() {
        return papnmae;
    }

    public void setPapnmae(String papnmae) {
        this.papnmae = papnmae == null ? null : papnmae.trim();
    }

    public String getPapfield() {
        return papfield;
    }

    public void setPapfield(String papfield) {
        this.papfield = papfield == null ? null : papfield.trim();
    }

    public String getUploadplace() {
        return uploadplace;
    }

    public void setUploadplace(String uploadplace) {
        this.uploadplace = uploadplace == null ? null : uploadplace.trim();
    }
}