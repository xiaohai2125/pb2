package com.pinbang.pb.entity;

public class Apply {
    private Long id;

    private String aName;

    private Long aTel;

    private Integer aArea;

    private Double aBudget;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public Long getaTel() {
        return aTel;
    }

    public void setaTel(Long aTel) {
        this.aTel = aTel;
    }

    public Integer getaArea() {
        return aArea;
    }

    public void setaArea(Integer aArea) {
        this.aArea = aArea;
    }

    public Double getaBudget() {
        return aBudget;
    }

    public void setaBudget(Double aBudget) {
        this.aBudget = aBudget;
    }
}