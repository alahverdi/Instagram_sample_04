package com.alroid.instagrammfttask.entity;

import android.graphics.drawable.Drawable;

public class PostProfile {
    int id;
    private Drawable img;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getImg() {
        return img;
    }

    public void setImg(Drawable img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "PostProfile{" +
                "id=" + id +
                ", img=" + img +
                '}';
    }
}
