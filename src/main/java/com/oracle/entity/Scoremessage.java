package com.oracle.entity;

public class Scoremessage {
    private Integer scoid;

    private Integer stuid;

    private Integer couid;

    private Integer usualscore;

    private Integer endscore;

    private Integer zonghescore;

    private String scoremark;

    public Integer getScoid() {
        return scoid;
    }

    public void setScoid(Integer scoid) {
        this.scoid = scoid;
    }

    public Integer getStuid() {
        return stuid;
    }

    public void setStuid(Integer stuid) {
        this.stuid = stuid;
    }

    public Integer getCouid() {
        return couid;
    }

    public void setCouid(Integer couid) {
        this.couid = couid;
    }

    public Integer getUsualscore() {
        return usualscore;
    }

    public void setUsualscore(Integer usualscore) {
        this.usualscore = usualscore;
    }

    public Integer getEndscore() {
        return endscore;
    }

    public void setEndscore(Integer endscore) {
        this.endscore = endscore;
    }

    public Integer getZonghescore() {
        return zonghescore;
    }

    public void setZonghescore(Integer zonghescore) {
        this.zonghescore = zonghescore;
    }

    public String getScoremark() {
        return scoremark;
    }

    public void setScoremark(String scoremark) {
        this.scoremark = scoremark == null ? null : scoremark.trim();
    }
}