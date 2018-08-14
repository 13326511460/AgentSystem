package pojo;

import java.util.Date;

public class Linkman {
    private Long id;

    private String linkmanname;

    private String linkmanphone;

    private String linkmanfax;

    private String linkmanemail;

    private String linkmanduty;

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

    public String getLinkmanname() {
        return linkmanname;
    }

    public void setLinkmanname(String linkmanname) {
        this.linkmanname = linkmanname == null ? null : linkmanname.trim();
    }

    public String getLinkmanphone() {
        return linkmanphone;
    }

    public void setLinkmanphone(String linkmanphone) {
        this.linkmanphone = linkmanphone == null ? null : linkmanphone.trim();
    }

    public String getLinkmanfax() {
        return linkmanfax;
    }

    public void setLinkmanfax(String linkmanfax) {
        this.linkmanfax = linkmanfax == null ? null : linkmanfax.trim();
    }

    public String getLinkmanemail() {
        return linkmanemail;
    }

    public void setLinkmanemail(String linkmanemail) {
        this.linkmanemail = linkmanemail == null ? null : linkmanemail.trim();
    }

    public String getLinkmanduty() {
        return linkmanduty;
    }

    public void setLinkmanduty(String linkmanduty) {
        this.linkmanduty = linkmanduty == null ? null : linkmanduty.trim();
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