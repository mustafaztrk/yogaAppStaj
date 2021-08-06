package com.example.yogaapp.Entities.Concretes;

import com.example.yogaapp.Entities.Abstracts.IEntity;

import java.util.ArrayList;
import java.util.List;

public class Contents implements IEntity {

    private String Id;
    private ArrayList<String> Codes;
    private  String ContentURL;

    public Contents() {
    }

    public Contents(String id, ArrayList<String> codes, String contentURL) {
        Id = id;
        Codes = codes;
        ContentURL = contentURL;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ArrayList<String> getCodes() {
        return Codes;
    }

    public void setCodes(ArrayList<String> codes) {
        Codes = codes;
    }

    public String getContentURL() {
        return ContentURL;
    }

    public void setContentURL(String contentURL) {
        ContentURL = contentURL;
    }
}
