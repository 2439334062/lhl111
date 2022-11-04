package com.example.lhl111.bean;

import java.util.List;

public class VideoBean {

    private int id;
    private String name;
    private String img;
    private String intro;
    private List<VideoDetailList> videoDetailList;
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public String getImg() {
        return img;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
    public String getIntro() {
        return intro;
    }

    public void setVideoDetailList(List<VideoDetailList> videoDetailList) {
        this.videoDetailList = videoDetailList;
    }
    public List<VideoDetailList> getVideoDetailList() {
        return videoDetailList;
    }

}
