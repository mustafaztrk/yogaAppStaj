package com.example.yogaapp.Entities.Concretes;

import com.example.yogaapp.Entities.Abstracts.IEntity;

import java.util.ArrayList;

public class UserMantraHistory implements IEntity{
    private String Id;
    private String UserId;
    private ArrayList<String> Codes;

    public UserMantraHistory() {
    }

    public UserMantraHistory(String id, String userId, ArrayList<String> codes) {
        Id = id;
        UserId = userId;
        Codes = codes;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public ArrayList<String> getCodes() {
        return Codes;
    }

    public void setCodes(ArrayList<String> codes) {
        Codes = codes;
    }
}
