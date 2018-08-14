package pojo;

import java.util.Date;

public class FinancialRecord {
    private Long id;

    private Long userid;

    private Long financialtypesid;

    private Float financialcapital;

    private String note;

    private Date detailtime;

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

    public Long getFinancialtypesid() {
        return financialtypesid;
    }

    public void setFinancialtypesid(Long financialtypesid) {
        this.financialtypesid = financialtypesid;
    }

    public Float getFinancialcapital() {
        return financialcapital;
    }

    public void setFinancialcapital(Float financialcapital) {
        this.financialcapital = financialcapital;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDetailtime() {
        return detailtime;
    }

    public void setDetailtime(Date detailtime) {
        this.detailtime = detailtime;
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