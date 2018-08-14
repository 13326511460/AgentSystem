package cn.agentsystem.pojo;

import java.util.Date;

public class Client {
    private Integer id;

    private Integer userId;

    private Integer tagId;

    private String clientName;

    private String legalRepresentative;

    private Date registerTime;

    private String companyPages;

    private Integer clientTypeId;

    private Integer documentTypeId;

    private String IDnumber;

    private String country;

    private String province;

    private String city;

    private String region;

    private String companyTel;

    private String companyFax;

    private String companyAddress;

    private String note;

    private Integer state;

    private Integer contactId;

    private Integer loginAddressId;

    private String IOSClientdownload;

    private String IOSQRcodedownload;

    private String androidClientdownload;

    private String androidQRcodedownload;

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

    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName == null ? null : clientName.trim();
    }

    public String getLegalRepresentative() {
        return legalRepresentative;
    }

    public void setLegalRepresentative(String legalRepresentative) {
        this.legalRepresentative = legalRepresentative == null ? null : legalRepresentative.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public String getCompanyPages() {
        return companyPages;
    }

    public void setCompanyPages(String companyPages) {
        this.companyPages = companyPages == null ? null : companyPages.trim();
    }

    public Integer getClientTypeId() {
        return clientTypeId;
    }

    public void setClientTypeId(Integer clientTypeId) {
        this.clientTypeId = clientTypeId;
    }

    public Integer getDocumentTypeId() {
        return documentTypeId;
    }

    public void setDocumentTypeId(Integer documentTypeId) {
        this.documentTypeId = documentTypeId;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public void setIDnumber(String IDnumber) {
        this.IDnumber = IDnumber == null ? null : IDnumber.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel == null ? null : companyTel.trim();
    }

    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax == null ? null : companyFax.trim();
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress == null ? null : companyAddress.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public Integer getLoginAddressId() {
        return loginAddressId;
    }

    public void setLoginAddressId(Integer loginAddressId) {
        this.loginAddressId = loginAddressId;
    }

    public String getIOSClientdownload() {
        return IOSClientdownload;
    }

    public void setIOSClientdownload(String IOSClientdownload) {
        this.IOSClientdownload = IOSClientdownload == null ? null : IOSClientdownload.trim();
    }

    public String getIOSQRcodedownload() {
        return IOSQRcodedownload;
    }

    public void setIOSQRcodedownload(String IOSQRcodedownload) {
        this.IOSQRcodedownload = IOSQRcodedownload == null ? null : IOSQRcodedownload.trim();
    }

    public String getAndroidClientdownload() {
        return androidClientdownload;
    }

    public void setAndroidClientdownload(String androidClientdownload) {
        this.androidClientdownload = androidClientdownload == null ? null : androidClientdownload.trim();
    }

    public String getAndroidQRcodedownload() {
        return androidQRcodedownload;
    }

    public void setAndroidQRcodedownload(String androidQRcodedownload) {
        this.androidQRcodedownload = androidQRcodedownload == null ? null : androidQRcodedownload.trim();
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