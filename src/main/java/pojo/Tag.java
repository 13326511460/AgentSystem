package pojo;

import java.util.Date;

public class Tag {
    private Long id;

    private Long userid;

    private String tagname;

    private Long clientid;

    private Long state;

    private Long statusid;

    private Long usermodestatus;

    private Long servicestatus;

    private Long webserviceid;

    private Long androidserviceid;

    private Long iosserviceid;

    private Long creationby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public Long getClientid() {
        return clientid;
    }

    public void setClientid(Long clientid) {
        this.clientid = clientid;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
    }

    public Long getStatusid() {
        return statusid;
    }

    public void setStatusid(Long statusid) {
        this.statusid = statusid;
    }

    public Long getUsermodestatus() {
        return usermodestatus;
    }

    public void setUsermodestatus(Long usermodestatus) {
        this.usermodestatus = usermodestatus;
    }

    public Long getServicestatus() {
        return servicestatus;
    }

    public void setServicestatus(Long servicestatus) {
        this.servicestatus = servicestatus;
    }

    public Long getWebserviceid() {
        return webserviceid;
    }

    public void setWebserviceid(Long webserviceid) {
        this.webserviceid = webserviceid;
    }

    public Long getAndroidserviceid() {
        return androidserviceid;
    }

    public void setAndroidserviceid(Long androidserviceid) {
        this.androidserviceid = androidserviceid;
    }

    public Long getIosserviceid() {
        return iosserviceid;
    }

    public void setIosserviceid(Long iosserviceid) {
        this.iosserviceid = iosserviceid;
    }

    public Long getCreationby() {
        return creationby;
    }

    public void setCreationby(Long creationby) {
        this.creationby = creationby;
    }

    public Date getCreationdate() {
        return creationdate;
    }

    public void setCreationdate(Date creationdate) {
        this.creationdate = creationdate;
    }

    public Long getModifyby() {
        return modifyby;
    }

    public void setModifyby(Long modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}