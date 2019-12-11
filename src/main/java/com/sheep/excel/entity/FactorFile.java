package com.sheep.excel.entity;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class FactorFile extends FactorFileKey {
    @Excel(name="factorFileName",orderNum = "0")
    private String factorFileName;
    @Excel(name="createId",orderNum = "1")
    private String createId;
    @Excel(name="createTime",orderNum = "2")
    private String createTime;
    @Excel(name="route",orderNum = "3")
    private String route;
    @Excel(name="country",orderNum = "4")
    private String country;
    @Excel(name="region",orderNum = "5")
    private String region;
    @Excel(name="category",orderNum = "6")
    private String category;
    @Excel(name="cmr",orderNum = "7")
    private Long cmr;
    @Excel(name="duty",orderNum = "8")
    private Long duty;
    @Excel(name="freight",orderNum = "9")
    private Long freight;
    @Excel(name="brokerFee",orderNum = "10")
    private Long brokerFee;
    @Excel(name="insurance",orderNum = "11")
    private Long insurance;
    @Excel(name="localUplift",orderNum = "12")
    private Long localUplift;
    @Excel(name="distributor",orderNum = "13")
    private Long distributor;
    @Excel(name="acslBp",orderNum = "14")
    private Long acslBp;
    @Excel(name="vat",orderNum = "15")
    private Long vat;
    @Excel(name="global",orderNum = "16")
    private String global;
    @Excel(name="comment",orderNum = "17")
    private String comment;

    public FactorFile() {
    }

    public FactorFile(String factorFileName, String createId, String createTime, String route, String country, String region, String category, Long cmr, Long duty, Long freight, Long brokerFee, Long insurance, Long localUplift, Long distributor, Long acslBp, Long vat, String global, String comment) {
        this.factorFileName = factorFileName;
        this.createId = createId;
        this.createTime = createTime;
        this.route = route;
        this.country = country;
        this.region = region;
        this.category = category;
        this.cmr = cmr;
        this.duty = duty;
        this.freight = freight;
        this.brokerFee = brokerFee;
        this.insurance = insurance;
        this.localUplift = localUplift;
        this.distributor = distributor;
        this.acslBp = acslBp;
        this.vat = vat;
        this.global = global;
        this.comment = comment;
    }

    public String getFactorFileName() {
        return factorFileName;
    }

    public void setFactorFileName(String factorFileName) {
        this.factorFileName = factorFileName == null ? null : factorFileName.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route == null ? null : route.trim();
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Long getCmr() {
        return cmr;
    }

    public void setCmr(Long cmr) {
        this.cmr = cmr;
    }

    public Long getDuty() {
        return duty;
    }

    public void setDuty(Long duty) {
        this.duty = duty;
    }

    public Long getFreight() {
        return freight;
    }

    public void setFreight(Long freight) {
        this.freight = freight;
    }

    public Long getBrokerFee() {
        return brokerFee;
    }

    public void setBrokerFee(Long brokerFee) {
        this.brokerFee = brokerFee;
    }

    public Long getInsurance() {
        return insurance;
    }

    public void setInsurance(Long insurance) {
        this.insurance = insurance;
    }

    public Long getLocalUplift() {
        return localUplift;
    }

    public void setLocalUplift(Long localUplift) {
        this.localUplift = localUplift;
    }

    public Long getDistributor() {
        return distributor;
    }

    public void setDistributor(Long distributor) {
        this.distributor = distributor;
    }

    public Long getAcslBp() {
        return acslBp;
    }

    public void setAcslBp(Long acslBp) {
        this.acslBp = acslBp;
    }

    public Long getVat() {
        return vat;
    }

    public void setVat(Long vat) {
        this.vat = vat;
    }

    public String getGlobal() {
        return global;
    }

    public void setGlobal(String global) {
        this.global = global == null ? null : global.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }
}