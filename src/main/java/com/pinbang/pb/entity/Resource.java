package com.pinbang.pb.entity;

import java.util.Date;

public class Resource {
    private Long id;

    private String rType;

    private String rCover;

    private String rTitle;

    private String rSubtitle;

    private String rPicpath;

    private String rUrl;

    private Byte rWeight;

    private Date createTime;

    private Date modifyTime;

    private Byte isDelete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType == null ? null : rType.trim();
    }

    public String getrCover() {
        return rCover;
    }

    public void setrCover(String rCover) {
        this.rCover = rCover == null ? null : rCover.trim();
    }

    public String getrTitle() {
        return rTitle;
    }

    public void setrTitle(String rTitle) {
        this.rTitle = rTitle == null ? null : rTitle.trim();
    }

    public String getrSubtitle() {
        return rSubtitle;
    }

    public void setrSubtitle(String rSubtitle) {
        this.rSubtitle = rSubtitle == null ? null : rSubtitle.trim();
    }

    public String getrPicpath() {
        return rPicpath;
    }

    public void setrPicpath(String rPicpath) {
        this.rPicpath = rPicpath == null ? null : rPicpath.trim();
    }

    public String getrUrl() {
        return rUrl;
    }

    public void setrUrl(String rUrl) {
        this.rUrl = rUrl == null ? null : rUrl.trim();
    }

    public Byte getrWeight() {
        return rWeight;
    }

    public void setrWeight(Byte rWeight) {
        this.rWeight = rWeight;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}