package com.pinbang.pb.entity;

public class ArticleContentWithBLOBs extends ArticleContent {
    private String media;

    private String content;

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media == null ? null : media.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}