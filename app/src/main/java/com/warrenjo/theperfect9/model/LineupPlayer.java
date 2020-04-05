package com.warrenjo.theperfect9.model;

import android.graphics.drawable.Drawable;

public class LineupPlayer {
    private Drawable face;
    private String name;
    private String position;
    private String hand;

    public Drawable getFace() {
        return face;
    }

    public void setFace(Drawable face) {
        this.face = face;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }
}