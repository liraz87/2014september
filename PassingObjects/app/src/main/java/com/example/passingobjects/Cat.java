package com.example.passingobjects;

import java.io.Serializable;

/**
 * Created by eladlavi on 12/28/14.
 */
public class Cat implements Serializable {
    private static final long serialVersionUID = 1L;
    private int color;
    private boolean male;

    public Cat(int color, boolean gender){
        this.color = color;
        this.male = gender;

    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male){
        this.male = male;
    }
}
