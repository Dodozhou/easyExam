package com.star.entity;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */
@Entity
@Table(name = "study_aid", schema = "yikao", catalog = "")
public class StudyAid {
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
    @Column(name = "pub_grade", nullable = false)
    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }

    @Basic
    @Column(name = "academy", nullable = false)
    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }



    @Basic
    @Column(name = "study_subject", nullable = false, length = 45)
    public String getStudySubject() {
        return studySubject;
    }

    public void setStudySubject(String studySubject) {
        this.studySubject = studySubject;
    }

    @Basic
    @Column(name = "pub_description", nullable = false, length = 45)
    public String getPubDescription() {
        return pubDescription;
    }

    public void setPubDescription(String pubDescription) {
        this.pubDescription = pubDescription;
    }

    @Basic
    @Column(name = "share_score", nullable = false)
    public float getShareScore() {
        return shareScore;
    }

    public void setShareScore(float shareScore) {
        this.shareScore = shareScore;
    }

    @Basic
    @Column(name = "pub_phone", nullable = false)
    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }
    @Basic
    @Column(name = "view_numb")
    public int getViewNumb() {
        return viewNumb;
    }

    public void setViewNumb(int viewNumb) {
        this.viewNumb = viewNumb;
    }
    @Basic
    @Column(name = "comment_numb")
    public int getCommentNumb() {
        return commentNumb;
    }

    public void setCommentNumb(int commentNumb) {
        this.commentNumb = commentNumb;
    }
    @Basic
    @Column(name = "time")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    @Basic
    @Column(name = "praise_numb")
    public int getPraiseNumb() {
        return praiseNumb;
    }

    public void setPraiseNumb(int praiseNumb) {
        this.praiseNumb = praiseNumb;
    }
}
