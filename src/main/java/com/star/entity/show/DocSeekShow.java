package com.star.entity.show;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/8.
 */

public class DocSeekShow {
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
    public String userPortrait;  //用户头像链接


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public int getPubId() {
        return pubId;
    }

    public void setPubId(int pubId) {
        this.pubId = pubId;
    }


    public String getSeekTitle() {
        return seekTitle;
    }

    public void setSeekTitle(String seekTitle) {
        this.seekTitle = seekTitle;
    }


    public String getSeekNeed() {
        return seekNeed;
    }

    public void setSeekNeed(String seekNeed) {
        this.seekNeed = seekNeed;
    }


    public String getNeedAcademy() {
        return needAcademy;
    }

    public void setNeedAcademy(String needAcademy) {
        this.needAcademy = needAcademy;
    }


    public String getNeedGrade() {
        return needGrade;
    }

    public void setNeedGrade(String needGrade) {
        this.needGrade = needGrade;
    }


    public int getSeekTime() {
        return seekTime;
    }

    public void setSeekTime(int seekTime) {
        this.seekTime = seekTime;
    }


    public int getSeekPraise() {
        return seekPraise;
    }

    public void setSeekPraise(int seekPraise) {
        this.seekPraise = seekPraise;
    }


    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public int getViewNumb() {
        return viewNumb;
    }

    public void setViewNumb(int viewNumb) {
        this.viewNumb = viewNumb;
    }

    public int getCommentNumb() {
        return commentNumb;
    }

    public void setCommentNumb(int commentNumb) {
        this.commentNumb = commentNumb;
    }

    public int getPraiseNumb() {
        return praiseNumb;
    }

    public void setPraiseNumb(int praiseNumb) {
        this.praiseNumb = praiseNumb;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }

 }
