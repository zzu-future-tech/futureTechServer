package cn.futuretech.domain;

import java.util.Date;

public class Sort {
    private Long matchid;

    private String weather;

    private String occasion;

    private Long dressid1;

    private Long dressid2;

    private Date gmtCreate;

    private Date gmtModified;

    public Long getMatchid() {
        return matchid;
    }

    public void setMatchid(Long matchid) {
        this.matchid = matchid;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion == null ? null : occasion.trim();
    }

    public Long getDressid1() {
        return dressid1;
    }

    public void setDressid1(Long dressid1) {
        this.dressid1 = dressid1;
    }

    public Long getDressid2() {
        return dressid2;
    }

    public void setDressid2(Long dressid2) {
        this.dressid2 = dressid2;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}