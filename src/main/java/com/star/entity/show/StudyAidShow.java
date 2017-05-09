package com.star.entity.show;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */

public class StudyAidShow {
    public int id;             //帮贴id
    public int pubId;          //发布者id
    public int pubGrade;       //帮辅的年级
    public String academy;      //帮辅所属的学院
    public String studySubject;   //帮辅的科目
    public String pubDescription;  //帮辅信息描述
    public float shareScore;       //大神的学分绩点
    public String pubPhone;    //大神的联系电话
    public int viewNumb;
    public int commentNumb;
    public int praiseNumb;
    public String time;
    public String userPortrait;


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


    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }


    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }

    public String getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(String studySubject) {
        this.studySubject = studySubject;
    }


    public String getPubDescription() {
        return pubDescription;
    }

    public void setPubDescription(String pubDescription) {
        this.pubDescription = pubDescription;
    }


    public float getShareScore() {
        return shareScore;
    }

    public void setShareScore(float shareScore) {
        this.shareScore = shareScore;
    }


    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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
