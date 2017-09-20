package com.share1024.model;

/**
 * Created by yesheng on 2017/9/17.
 */
public class Project {

    private int id;

    private String title;


    private String  categoryName;

    private int rank;

    private int scanAmount;

    private String taobaoUrl;

    private String resourceUrl;

    private int isDeleted;

    private String pic1;

    private String pic2;

    private int contentId;

    private String vidioUrl;


    public int getContentId() {
        return contentId;
    }

    public void setContentId(int contentId) {
        this.contentId = contentId;
    }

    public String getVidioUrl() {
        return vidioUrl;
    }

    public void setVidioUrl(String vidioUrl) {
        this.vidioUrl = vidioUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getScanAmount() {
        return scanAmount;
    }

    public void setScanAmount(int scanAmount) {
        this.scanAmount = scanAmount;
    }

    public String getTaobaoUrl() {
        return taobaoUrl;
    }

    public void setTaobaoUrl(String taobaoUrl) {
        this.taobaoUrl = taobaoUrl;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }

    public String getPic1() {
        return pic1;
    }

    public void setPic1(String pic1) {
        this.pic1 = pic1;
    }

    public String getPic2() {
        return pic2;
    }

    public void setPic2(String pic2) {
        this.pic2 = pic2;
    }


}
