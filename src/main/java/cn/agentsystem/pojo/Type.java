package cn.agentsystem.pojo;

import java.util.Date;

public class Type {
    private Integer id;

    private String typeName;

    private Integer typevaluesId;

    private String typevalues;

    private Integer typenumerical;

    private Integer actualvalue;

    private Integer state;

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

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName == null ? null : typeName.trim();
    }

    public Integer getTypevaluesId() {
        return typevaluesId;
    }

    public void setTypevaluesId(Integer typevaluesId) {
        this.typevaluesId = typevaluesId;
    }

    public String getTypevalues() {
        return typevalues;
    }

    public void setTypevalues(String typevalues) {
        this.typevalues = typevalues == null ? null : typevalues.trim();
    }

    public Integer getTypenumerical() {
        return typenumerical;
    }

    public void setTypenumerical(Integer typenumerical) {
        this.typenumerical = typenumerical;
    }

    public Integer getActualvalue() {
        return actualvalue;
    }

    public void setActualvalue(Integer actualvalue) {
        this.actualvalue = actualvalue;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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