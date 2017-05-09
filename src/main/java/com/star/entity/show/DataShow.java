package com.star.entity.show;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */


/**
 * 本类用作拼接分档分享页面中的用户信息和文档信息
 */
public class DataShow {
    private int id;            //文档的id
    private int userId;        //文档发布者id
    private String dataTitle;  //文档名称
    private String dataDescription;   //文档描述
    private String dataUrl;     //文档链接
    private int downloadNumber;  //下载次数
    private int viewNumber;     //浏览次数
    private int dataPraise;     //点赞次数
    private String dataCategory;   //文档学科
    private String dataImgs;    //文档图片链接
    private int dataGrade;      //所属年级
    private String dataCollege;    //文档所属学院
    private String pubDate;   //发布时间
    private String ownerImg;   //发布者的头像
    private String ownerName;   //发布者的昵称
    private int onwerId;     //发布者的id



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }



    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }


    public String getDataDescription() {
        return dataDescription;
    }

    public void setDataDescription(String dataDescription) {
        this.dataDescription = dataDescription;
    }


    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }


    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }


    public int getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }


    public int getDataPraise() {
        return dataPraise;
    }

    public void setDataPraise(int dataPraise) {
        this.dataPraise = dataPraise;
    }


    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {this.dataCategory = dataCategory;}



    public String getDataImgs() {
        return dataImgs;
    }

    public void setDataImgs(String dataImgs) {
        this.dataImgs = dataImgs;
    }


    public int getDataGrade() {
        return dataGrade;
    }

    public void setDataGrade(int dataGrade) {
        this.dataGrade = dataGrade;
    }



    public String getDataCollege() {
        return dataCollege;
    }

    public void setDataCollege(String dataCollege) {

        this.dataCollege = dataCollege;
    }


    public String getPubDate() {return pubDate;}

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getOwnerImg() {
        return ownerImg;
    }

    public void setOwnerImg(String ownerImg) {
        this.ownerImg = ownerImg;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOnwerId() {
        return onwerId;
    }

    public void setOnwerId(int onwerId) {
        this.onwerId = onwerId;
    }
}
