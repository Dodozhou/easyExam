package com.star.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by hp on 2017/4/8.
 */
@Entity
@Table(name = "doc_seek", schema = "yikao")
public class DocSeek {
    public int id;           //悬赏记录的ID
    public int pubId;        //发布者的id
    public String seekTitle;  //悬赏标题
    public String seekNeed;   //悬赏需求
    public String needAcademy;  //悬赏所属学院
    public String needGrade;   //悬赏的年级
    public int seekTime;     //悬赏期限（如1天）
    public int seekPraise;   //悬赏报酬（如1下载卷）
    public String pubDate;   //发布时间
    public int viewNumb;   //浏览数量
    public int commentNumb;  //评论数量
    public int praiseNumb;    //点赞数量

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
    @Basic
    @Column(name = "view_numb", nullable = true)
    public int getViewNumb() {
        return viewNumb;
    }

    public void setViewNumb(int viewNumb) {
        this.viewNumb = viewNumb;
    }
    @Basic
    @Column(name = "comment_numb", nullable = true)
    public int getCommentNumb() {
        return commentNumb;
    }

    public void setCommentNumb(int commentNumb) {
        this.commentNumb = commentNumb;
    }
    @Basic
    @Column(name = "praise_numb", nullable = true)
    public int getPraiseNumb() {
        return praiseNumb;
    }

    public void setPraiseNumb(int praiseNumb) {
        this.praiseNumb = praiseNumb;
    }
}
