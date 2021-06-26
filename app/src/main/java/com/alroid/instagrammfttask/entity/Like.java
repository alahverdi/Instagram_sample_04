package com.alroid.instagrammfttask.entity;

import android.graphics.drawable.Drawable;

public class Like {
    int id;
    private Drawable imgFriend;
    private Drawable imgPost;
    String Friend_userName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getImgFriend() {
        return imgFriend;
    }

    public void setImgFriend(Drawable imgFriend) {
        this.imgFriend = imgFriend;
    }

    public Drawable getImgPost() {
        return imgPost;
    }

    public void setImgPost(Drawable imgPost) {
        this.imgPost = imgPost;
    }

    public String getFriend_userName() {
        return Friend_userName;
    }

    public void setFriend_userName(String friend_userName) {
        this.Friend_userName = friend_userName;
    }

    @Override
    public String toString() {
        return "LikeActivity{" +
                "id=" + id +
                ", imgFriend=" + imgFriend +
                ", imgPost=" + imgPost +
                ", tittle='" + Friend_userName + '\'' +
                '}';
    }
}
