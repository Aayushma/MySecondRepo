package com.example.user.listapplication.model;

/**
 * Created by User on 1/17/2016.
 */
public class User {
    private String name;
    private String jobtitle;
    private String image;

    public User(String name, String jobtitle, String image) {
        this.name = name;
        this.jobtitle = jobtitle;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
