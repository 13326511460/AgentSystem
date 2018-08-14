package pojo;

import java.util.Date;

public class AppAddress {
    private Long id;

    private String appaddressname;

    private String appaddressurl;

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

    public String getAppaddressname() {
        return appaddressname;
    }

    public void setAppaddressname(String appaddressname) {
        this.appaddressname = appaddressname == null ? null : appaddressname.trim();
    }

    public String getAppaddressurl() {
        return appaddressurl;
    }

    public void setAppaddressurl(String appaddressurl) {
        this.appaddressurl = appaddressurl == null ? null : appaddressurl.trim();
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