package com.alroid.instagrammfttask.entity;

import android.graphics.drawable.Drawable;

public class Story {
    int id;
    String userName;
    private Drawable img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Story{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", img=" + img +
                '}';
    }
}
