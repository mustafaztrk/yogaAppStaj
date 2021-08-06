package com.example.yogaapp.Entities.Concretes;

import java.util.ArrayList;

public class MoodTracking {

    private String Id;
    private String Code;
    private String Title;
    private ArrayList<String> Content;
    private String IconUrl;

    public MoodTracking() {
    }

    public MoodTracking(String id, String code, String title, ArrayList<String> content, String iconUrl) {
        Id = id;
        Code = code;
        Title = title;
        Content = content;
        IconUrl = iconUrl;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public ArrayList<String> getContent() {
        return Content;
    }

    public void setContent(ArrayList<String> content) {
        Content = content;
    }

    public String getIconUrl() {
        return IconUrl;
    }

    public void setIconUrl(String iconUrl) {
        IconUrl = iconUrl;
    }
}
