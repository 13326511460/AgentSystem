package cn.agentsystem.pojo;

import java.util.Date;

public class OpenServiceRecord {
    private Integer id;

    private Integer openServiceId;

    private Integer application;

    private Date applyForTime;

    private Float price;

    private Integer TOSId;

    private Integer perferentialTypeId;

    private Date creationBy;

    private Date creationDate;

    private Integer modifyBy;

    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOpenServiceId() {
        return openServiceId;
    }

    public void setOpenServiceId(Integer openServiceId) {
        this.openServiceId = openServiceId;
    }

    public Integer getApplication() {
        return application;
    }

    public void setApplication(Integer application) {
        this.application = application;
    }

    public Date getApplyForTime() {
        return applyForTime;
    }

    public void setApplyForTime(Date applyForTime) {
        this.applyForTime = applyForTime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getTOSId() {
        return TOSId;
    }

    public void setTOSId(Integer TOSId) {
        this.TOSId = TOSId;
    }

    public Integer getPerferentialTypeId() {
        return perferentialTypeId;
    }

    public void setPerferentialTypeId(Integer perferentialTypeId) {
        this.perferentialTypeId = perferentialTypeId;
    }

    public Date getCreationBy() {
        return creationBy;
    }

    public void setCreationBy(Date creationBy) {
        this.creationBy = creationBy;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Integer getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(Integer modifyBy) {
        this.modifyBy = modifyBy;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}