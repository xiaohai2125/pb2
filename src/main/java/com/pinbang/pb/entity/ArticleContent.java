package com.pinbang.pb.entity;

import java.util.Date;

public class ArticleContent {
    private Long id;

    private Date modifTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getModifTime() {
        return modifTime;
    }

    public void setModifTime(Date modifTime) {
        this.modifTime = modifTime;
    }
}