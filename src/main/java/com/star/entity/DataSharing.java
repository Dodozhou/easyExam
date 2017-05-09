package com.star.entity;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */


@Entity
@Table(name = "data_sharing", schema = "yikao")
public class DataSharing {
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


    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


    @Basic
    @Column(name = "data_title", nullable = false, length = 45)
    public String getDataTitle() {
        return dataTitle;
    }

    public void setDataTitle(String dataTitle) {
        this.dataTitle = dataTitle;
    }

    @Basic
    @Column(name = "data_description", nullable = false, length = 200)
    public String getDataDescription() {
        return dataDescription;
    }

    public void setDataDescription(String dataDescription) {
        this.dataDescription = dataDescription;
    }

    @Basic
    @Column(name = "data_url", nullable = false, length = 100)
    public String getDataUrl() {
        return dataUrl;
    }

    public void setDataUrl(String dataUrl) {
        this.dataUrl = dataUrl;
    }

    @Basic
    @Column(name = "download_number", nullable = false)
    public int getDownloadNumber() {
        return downloadNumber;
    }

    public void setDownloadNumber(int downloadNumber) {
        this.downloadNumber = downloadNumber;
    }

    @Basic
    @Column(name = "view_number", nullable = false)
    public int getViewNumber() {
        return viewNumber;
    }

    public void setViewNumber(int viewNumber) {
        this.viewNumber = viewNumber;
    }

    @Basic
    @Column(name = "data_praise", nullable = false)
    public int getDataPraise() {
        return dataPraise;
    }

    public void setDataPraise(int dataPraise) {
        this.dataPraise = dataPraise;
    }

    @Basic
    @Column(name = "data_category", nullable = true, length = 20)
    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {this.dataCategory = dataCategory;}

    @Basic
    @Column(name = "data_imgs", nullable = true, length = 100)
    public String getDataImgs() {
        return dataImgs;
    }

    public void setDataImgs(String dataImgs) {
        this.dataImgs = dataImgs;
    }

    @Basic
    @Column(name = "data_grade", nullable = true, length = 1)
    public int getDataGrade() {
        return dataGrade;
    }

    public void setDataGrade(int dataGrade) {
        this.dataGrade = dataGrade;
    }


    @Basic
    @Column(name = "data_college", nullable = true, length = 20)
    public String getDataCollege() {
        return dataCollege;
    }

    public void setDataCollege(String dataCollege) {

        this.dataCollege = dataCollege;
    }

    @Basic
    @Column(name = "pub_date", nullable = true, length = 20)
    public String getPubDate() {return pubDate;}

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
