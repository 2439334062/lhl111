package com.example.lhl111.bean;

public class NewsBean {
    private int id;
    private int type;
    private String newsName;
    private String newsTypeName;
    private String img1;
    private String img2;
    private String img3;
    private String newsUrl;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setType(int type) {
        this.type = type;
    }
    public int getType() {
        return type;
    }

    public void setNewsName(String newsName) {
        this.newsName = newsName;
    }
    public String getNewsName() {
        return newsName;
    }

    public void setNewsTypeName(String newsTypeName) {
        this.newsTypeName = newsTypeName;
    }
    public String getNewsTypeName() {
        return newsTypeName;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }
    public String getImg1() {
        return img1;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }
    public String getImg2() {
        return img2;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }
    public String getImg3() {
        return img3;
    }

    public void setNewsUrl(String newsUrl) {
        this.newsUrl = newsUrl;
    }
    public String getNewsUrl() {
        return newsUrl;
    }
}
