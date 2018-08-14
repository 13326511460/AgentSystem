package cn.agentsystem.pojo;

import java.util.Date;

public class FinancialRecord {
    private Integer id;

    private Integer userId;

    private Integer financialTypesId;

    private Float financialCapital;

    private String note;

    private Date detailTime;

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

    public Integer getFinancialTypesId() {
        return financialTypesId;
    }

    public void setFinancialTypesId(Integer financialTypesId) {
        this.financialTypesId = financialTypesId;
    }

    public Float getFinancialCapital() {
        return financialCapital;
    }

    public void setFinancialCapital(Float financialCapital) {
        this.financialCapital = financialCapital;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDetailTime() {
        return detailTime;
    }

    public void setDetailTime(Date detailTime) {
        this.detailTime = detailTime;
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