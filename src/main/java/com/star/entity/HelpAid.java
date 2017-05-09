package com.star.entity;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */
@Entity
@Table(name = "help_aid", schema = "yikao", catalog = "")
public class HelpAid {
    private int id;            //该记录的id
    private int pubId;         //发布者的id
    private String academy;    //要帮辅科目所属的学院
    private int pubGrade;      //科目所属的年级
    private String helpSubject;  //需要帮辅的科目
    private String helpNeed;    //帮辅的具体需求
    private String pubPhone;    //联系电话

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
    @Column(name = "academy", nullable = false)
    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy;
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
    @Column(name = "help_subject", nullable = false, length = 45)
    public String getHelpSubject() {
        return helpSubject;
    }

    public void setHelpSubject(String helpSubject) {
        this.helpSubject = helpSubject;
    }

    @Basic
    @Column(name = "help_need", nullable = true, length = 200)
    public String getHelpNeed() {
        return helpNeed;
    }

    public void setHelpNeed(String helpNeed) {
        this.helpNeed = helpNeed;
    }

    @Basic
    @Column(name = "pub_phone", nullable = false)
    public String getPubPhone() {
        return pubPhone;
    }

    public void setPubPhone(String pubPhone) {
        this.pubPhone = pubPhone;
    }


}
