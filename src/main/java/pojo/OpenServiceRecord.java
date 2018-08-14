package pojo;

import java.util.Date;

public class OpenServiceRecord {
    private Long id;

    private Long openserviceid;

    private Long application;

    private Date applyfortime;

    private Float price;

    private Long tosid;

    private Long perferentialtypeid;

    private Date creationby;

    private Date creationdate;

    private Long modifyby;

    private Date modifydate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOpenserviceid() {
        return openserviceid;
    }

    public void setOpenserviceid(Long openserviceid) {
        this.openserviceid = openserviceid;
    }

    public Long getApplication() {
        return application;
    }

    public void setApplication(Long application) {
        this.application = application;
    }

    public Date getApplyfortime() {
        return applyfortime;
    }

    public void setApplyfortime(Date applyfortime) {
        this.applyfortime = applyfortime;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getTosid() {
        return tosid;
    }

    public void setTosid(Long tosid) {
        this.tosid = tosid;
    }

    public Long getPerferentialtypeid() {
        return perferentialtypeid;
    }

    public void setPerferentialtypeid(Long perferentialtypeid) {
        this.perferentialtypeid = perferentialtypeid;
    }

    public Date getCreationby() {
        return creationby;
    }

    public void setCreationby(Date creationby) {
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