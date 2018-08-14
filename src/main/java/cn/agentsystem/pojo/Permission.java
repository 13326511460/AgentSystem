package cn.agentsystem.pojo;

import java.util.Date;

public class Permission {
    private Integer id;

    private Integer roleId;

    private String functionName;

    private Integer parentfunctionId;

    private String functionURL;

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

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName == null ? null : functionName.trim();
    }

    public Integer getParentfunctionId() {
        return parentfunctionId;
    }

    public void setParentfunctionId(Integer parentfunctionId) {
        this.parentfunctionId = parentfunctionId;
    }

    public String getFunctionURL() {
        return functionURL;
    }

    public void setFunctionURL(String functionURL) {
        this.functionURL = functionURL == null ? null : functionURL.trim();
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