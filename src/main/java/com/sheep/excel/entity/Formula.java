package com.sheep.excel.entity;

public class Formula {
    private Integer formulaid;

    private Integer ffid;

    private String formula;

    public Integer getFormulaid() {
        return formulaid;
    }

    public void setFormulaid(Integer formulaid) {
        this.formulaid = formulaid;
    }

    public Integer getFfid() {
        return ffid;
    }

    public void setFfid(Integer ffid) {
        this.ffid = ffid;
    }

    public String getFormula() {
        return formula;
    }

    public void setFormula(String formula) {
        this.formula = formula == null ? null : formula.trim();
    }
}