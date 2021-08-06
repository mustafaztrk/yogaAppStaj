package com.example.yogaapp.DataAccess.Concretes.InMemory;

import com.example.yogaapp.DataAccess.Abstracts.IContentsDao;
import com.example.yogaapp.Entities.Concretes.Contents;

import java.util.ArrayList;
import java.util.List;

public class InMemoryContentsDao implements IContentsDao {

    private ArrayList<Contents> _contents;
    public InMemoryContentsDao() {
        _contents= new ArrayList<Contents>();
        Contents a= new Contents();
        String ad="akldjkas";

        ArrayList<String> asd=new ArrayList<>();
        asd.add("Focus");
        asd.add("Breath");
        a.setCodes(asd);

        a.setContentURL("https://focus_breath.com");
        a.setId("55555");

        _contents.add(a);
    }

    @Override
    public ArrayList<Contents> GetAll() {
        return _contents;
    }

    @Override
    public void Add(Contents entity) {
        _contents.add(entity);
    }

    @Override
    public void Update(Contents entity) {

    }

    @Override
    public void Delete(Contents entity) {

    }
}
