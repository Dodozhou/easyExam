package com.star.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by hp on 2017/4/8.
 */
@Entity
@Table(name = "doc_seek", schema = "yikao")
public class DocSeek {
    private int id;           //悬赏记录的ID
    private int pubId;        //发布者的id
    private String seekTitle;  //悬赏标题
    private String seekNeed;   //悬赏需求
    private String needAcademy;  //悬赏所属学院
    private String needGrade;   //悬赏的年级
    private int seekTime;     //悬赏期限（如1天）
    private int seekPraise;   //悬赏报酬（如1下载卷）
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
    @Column(name = "pub_id", nullable = false)
    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }

    @Basic
    @Column(name = "seek_title", nullable = false, length = 45)
    public String getSeekTitle() {
        return seekTitle;
    }

    public void setSeekTitle(String seekTitle) {
        this.seekTitle = seekTitle;
    }

    @Basic
    @Column(name = "seek_need", nullable = false, length = 200)
    public String getSeekNeed() {
        return seekNeed;
    }

    public void setSeekNeed(String seekNeed) {
        this.seekNeed = seekNeed;
    }

    @Basic
    @Column(name = "need_academy", nullable = false, length = 45)
    public String getNeedAcademy() {
        return needAcademy;
    }

    public void setNeedAcademy(String needAcademy) {
        this.needAcademy = needAcademy;
    }

    @Basic
    @Column(name = "need_grade", nullable = false, length = 45)
    public String getNeedGrade() {
        return needGrade;
    }

    public void setNeedGrade(String needGrade) {
        this.needGrade = needGrade;
    }

    @Basic
    @Column(name = "seek_time", nullable = false)
    public int getSeekTime() {
        return seekTime;
    }

    public void setSeekTime(int seekTime) {
        this.seekTime = seekTime;
    }

    @Basic
    @Column(name = "seek_praise", nullable = false)
    public int getSeekPraise() {
        return seekPraise;
    }

    public void setSeekPraise(int seekPraise) {
        this.seekPraise = seekPraise;
    }

    @Basic
    @Column(name = "pub_date", nullable = false)
    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

}
