package com.alroid.instagrammfttask.entity;

import android.graphics.drawable.Drawable;

public class PostMain {
    int id;

    String likeNum,
            commentNum,
            hour,
            userName,
            description;

    Drawable imgUser,
            imgPost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(String likeNum) {
        this.likeNum = likeNum;
    }

    public String getCommentNum() {
        return commentNum;
    }

    public void setCommentNum(String commentNum) {
        this.commentNum = commentNum;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Drawable getImgUser() {
        return imgUser;
    }

    public void setImgUser(Drawable imgUser) {
        this.imgUser = imgUser;
    }

    public Drawable getImgPost() {
        return imgPost;
    }

    public void setImgPost(Drawable imgPost) {
        this.imgPost = imgPost;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", likeNum='" + likeNum + '\'' +
                ", commentNum='" + commentNum + '\'' +
                ", hour='" + hour + '\'' +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", imgUser=" + imgUser +
                ", imgPost=" + imgPost +
                '}';
    }
}
