package cn.agentsystem.pojo;

import java.util.Date;

public class Tag {
    private Integer id;

    private Integer userId;

    private String tagName;

    private Integer clientId;

    private Integer state;

    private Integer statusId;

    private Integer usermodeStatus;

    private Integer serviceStatus;

    private Integer webServiceId;

    private Integer androidServiceId;

    private Integer IOSServiceId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getStatusId() {
        return statusId;
    }

    public void setStatusId(Integer statusId) {
        this.statusId = statusId;
    }

    public Integer getUsermodeStatus() {
        return usermodeStatus;
    }

    public void setUsermodeStatus(Integer usermodeStatus) {
        this.usermodeStatus = usermodeStatus;
    }

    public Integer getServiceStatus() {
        return serviceStatus;
    }

    public void setServiceStatus(Integer serviceStatus) {
        this.serviceStatus = serviceStatus;
    }

    public Integer getWebServiceId() {
        return webServiceId;
    }

    public void setWebServiceId(Integer webServiceId) {
        this.webServiceId = webServiceId;
    }

    public Integer getAndroidServiceId() {
        return androidServiceId;
    }

    public void setAndroidServiceId(Integer androidServiceId) {
        this.androidServiceId = androidServiceId;
    }

    public Integer getIOSServiceId() {
        return IOSServiceId;
    }

    public void setIOSServiceId(Integer IOSServiceId) {
        this.IOSServiceId = IOSServiceId;
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