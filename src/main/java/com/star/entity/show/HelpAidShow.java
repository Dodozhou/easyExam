package com.star.entity.show;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */
@Component
public class HelpAidShow {
    public int id;            //该记录的id
    public int pubId;         //发布者的id
    public String academy;    //要帮辅科目所属的学院
    public int pubGrade;      //科目所属的年级
    public String helpSubject;  //需要帮辅的科目
    public String helpNeed;    //帮辅的具体需求
    public String pubPhone;    //联系电话
    public int viewNumb;
    public int commentNumb;
    public int praiseNumb;
    public String time;
    public String userPortrait;
    public String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


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


    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
    }



    public int getPubGrade() {
        return pubGrade;
    }

    public void setPubGrade(int pubGrade) {
        this.pubGrade = pubGrade;
    }


    public String getHelpSubject() {
        return helpSubject;
    }

    public void setHelpSubject(String helpSubject) {
        this.helpSubject = helpSubject;
    }


    public String getHelpNeed() {
        return helpNeed;
    }

    public void setHelpNeed(String helpNeed) {
        this.helpNeed = helpNeed;
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

    public int getPraiseNumb() {
        return praiseNumb;
    }

    public void setPraiseNumb(int praiseNumb) {
        this.praiseNumb = praiseNumb;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getUserPortrait() {
        return userPortrait;
    }

    public void setUserPortrait(String userPortrait) {
        this.userPortrait = userPortrait;
    }
}
