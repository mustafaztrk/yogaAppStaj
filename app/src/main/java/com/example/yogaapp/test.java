package com.example.yogaapp;

import com.example.yogaapp.Business.Concretes.ContentsManager;
import com.example.yogaapp.Business.Concretes.MantraManager;
import com.example.yogaapp.Business.Concretes.MoodTrackingManager;
import com.example.yogaapp.Business.Concretes.ProductManager;
import com.example.yogaapp.Business.Concretes.UserMantraHistoryManager;
import com.example.yogaapp.DataAccess.Concretes.InMemory.InMemoryContentsDao;
import com.example.yogaapp.DataAccess.Concretes.InMemory.InMemoryMantraDao;
import com.example.yogaapp.DataAccess.Concretes.InMemory.InMemoryMoodTracking;
import com.example.yogaapp.DataAccess.Concretes.InMemory.InMemoryProductDao;
import com.example.yogaapp.DataAccess.Concretes.InMemory.InMemoryUserMantraHistoryDao;
import com.example.yogaapp.Entities.Abstracts.IEntity;
import com.example.yogaapp.Entities.Concretes.Contents;
import com.example.yogaapp.Entities.Concretes.Mantra;
import com.example.yogaapp.Entities.Concretes.MoodTracking;
import com.example.yogaapp.Entities.Concretes.Product;
import com.example.yogaapp.Entities.Concretes.UserMantraHistory;

public class test {
    public static void main(String[] args) {
        System.out.println("---------------------");
        ProductManager pm = new ProductManager(new InMemoryProductDao());

        for (Product a : pm.GetAll()) {
            System.out.println(a.getCategoryId());
            System.out.println(a.getUnitsInStock());
            System.out.println(a.getProductName());

        }
        System.out.println("---------------------");

        ContentsManager cm = new ContentsManager(new InMemoryContentsDao());

        for (Contents a : cm.GetAll()) {
            System.out.println(a.getCodes());
            System.out.println(a.getContentURL());
            System.out.println(a.getId());

        }

        System.out.println("---------------------");
        Mantra mant=new Mantra();
        mant.setId("Mantra11");
        mant.setWord("Su akar yolunu bulur");
        MantraManager mantra=new MantraManager(new InMemoryMantraDao());
         mantra.Add(mant);
        for (Mantra m: mantra.GetAll()){
            System.out.println(m.getId());
            System.out.println(m.getWord());
        }
        System.out.println("---------------------");


        MoodTrackingManager mood=new MoodTrackingManager(new InMemoryMoodTracking());
        for (MoodTracking md: mood.GetAll()){
            System.out.println(md.getId());
            System.out.println(md.getCode());
            System.out.println(md.getTitle());
            for (String wrd: md.getContent()){System.out.println(wrd);}
            System.out.println(md.getIconUrl());
        }
        System.out.println("---------------------");
        UserMantraHistoryManager UserMantra=new UserMantraHistoryManager(new InMemoryUserMantraHistoryDao());
        for (UserMantraHistory history: UserMantra.GetAll()){
            System.out.println(history.getId());
            System.out.println(history.getUserId());
            for (String s: history.getCodes()){System.out.print(s+" ");}
            System.out.println();
        }
        System.out.println("---------------------");
    }
}
