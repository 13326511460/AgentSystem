package cn.agentsystem.pojo;

import java.util.Date;

public class AppAddress {
    private Integer id;

    private String appAddressName;

    private String appAddressURL;

    private Integer creationBy;

    private Date creationDate;

    private Integer modifyBy;

    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppAddressName() {
        return appAddressName;
    }

    public void setAppAddressName(String appAddressName) {
        this.appAddressName = appAddressName == null ? null : appAddressName.trim();
    }

    public String getAppAddressURL() {
        return appAddressURL;
    }

    public void setAppAddressURL(String appAddressURL) {
        this.appAddressURL = appAddressURL == null ? null : appAddressURL.trim();
    }

    public Integer getCreationBy() {
        return creationBy;
    }

    public void setCreationBy(Integer creationBy) {
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