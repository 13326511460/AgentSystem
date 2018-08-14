package pojo;

import java.util.Date;

public class Type {
    private Long id;

    private String typename;

    private Long typevaluesid;

    private String typevalues;

    private Long typenumerical;

    private Long actualvalue;

    private Long state;

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

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Long getTypevaluesid() {
        return typevaluesid;
    }

    public void setTypevaluesid(Long typevaluesid) {
        this.typevaluesid = typevaluesid;
    }

    public String getTypevalues() {
        return typevalues;
    }

    public void setTypevalues(String typevalues) {
        this.typevalues = typevalues == null ? null : typevalues.trim();
    }

    public Long getTypenumerical() {
        return typenumerical;
    }

    public void setTypenumerical(Long typenumerical) {
        this.typenumerical = typenumerical;
    }

    public Long getActualvalue() {
        return actualvalue;
    }

    public void setActualvalue(Long actualvalue) {
        this.actualvalue = actualvalue;
    }

    public Long getState() {
        return state;
    }

    public void setState(Long state) {
        this.state = state;
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