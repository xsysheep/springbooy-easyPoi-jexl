package com.sheep.excel.entity;

public class Price {
    private Integer pid;

    private Integer uid;

    private String createTime;

    private Integer formulaid;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public Integer getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(Integer formulaid) {
        this.formulaid = formulaid;
    }
}