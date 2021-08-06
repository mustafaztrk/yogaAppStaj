package com.example.yogaapp.Entities.Concretes;

import com.example.yogaapp.Entities.Abstracts.IEntity;

public class Mantra implements IEntity {


    private String Id;
    private String Word;

    public Mantra() {
    }

    public Mantra(String id, String word) {
        Id = id;
        Word = word;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getWord() {
        return Word;
    }

    public void setWord(String word) {
        Word = word;
    }
}
