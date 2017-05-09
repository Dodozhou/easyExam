package com.star.entity;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */
@Entity
@Table(name = "method_sharing", schema = "yikao", catalog = "")
public class MethodSharing {
    private int id;              //分享博文的id
    private int userId;          //发布者的id
    private String academy;      //类别所属学院
    private String sharingTitle;  //博文标题
    private String sharingContent;  //博文正文
    private int sharingPraise;    //点赞次数
    private int sharingCriticism;  //踩次数
    private int readingNumber;    //浏览次数
    private String readingImgs;    //博文中图片的路径

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_id", nullable = false, length = 45)
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "academy", nullable = false, length = 45)
    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }




    @Basic
    @Column(name = "sharing_title", nullable = false, length = 45)
    public String getSharingTitle() {
        return sharingTitle;
    }

    public void setSharingTitle(String sharingTitle) {
        this.sharingTitle = sharingTitle;
    }

    @Basic
    @Column(name = "sharing_content", nullable = false, length = -1)
    public String getSharingContent() {
        return sharingContent;
    }

    public void setSharingContent(String sharingContent) {
        this.sharingContent = sharingContent;
    }

    @Basic
    @Column(name = "sharing_praise", nullable = false)
    public int getSharingPraise() {
        return sharingPraise;
    }

    public void setSharingPraise(int sharingPraise) {
        this.sharingPraise = sharingPraise;
    }

    @Basic
    @Column(name = "sharing_criticism", nullable = false)
    public int getSharingCriticism() {
        return sharingCriticism;
    }

    public void setSharingCriticism(int sharingCriticism) {
        this.sharingCriticism = sharingCriticism;
    }

    @Basic
    @Column(name = "reading_number", nullable = false)
    public int getReadingNumber() {
        return readingNumber;
    }

    public void setReadingNumber(int readingNumber) {
        this.readingNumber = readingNumber;
    }

    @Basic
    @Column(name = "reading_imgs", nullable = true, length = 100)
    public String getReadingImgs() {
        return readingImgs;
    }

    public void setReadingImgs(String readingImgs) {
        this.readingImgs = readingImgs;
    }


}
