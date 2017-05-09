package com.star.entity;

import javax.persistence.*;

/**
 * Created by hp on 2017/4/6.
 */
@Entity
@Table(name = "user", schema = "yikao", catalog = "")
public class User {
    private int id; //用户的id，数据表自动生成
    private String nickname; //用户昵称
    private String password; //用户密码
    private String email;    //用户email
    private String studentId;  //用户的学号
    private String userImg;   //用户头像保存链接
    private String personalDesc;  //用户的个人介绍


    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nickname", nullable = false, length = 45)
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password", nullable = false, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email", nullable = false, length = 45)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "student_id", nullable = false, length = 45)
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "user_img", nullable = true, length = 100)
    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {

        this.userImg = userImg;
    }
    @Basic
    @Column(name = "personal_desc", nullable = true, length = 200)
    public String getPersonalDesc() {
        return personalDesc;
    }

    public void setPersonalDesc(String personalDesc) {
        this.personalDesc = personalDesc;
    }
}
