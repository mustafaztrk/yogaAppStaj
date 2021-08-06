package com.example.yogaapp.DataAccess.Concretes.InMemory;

import com.example.yogaapp.DataAccess.Abstracts.IMantraDao;
import com.example.yogaapp.Entities.Concretes.Mantra;

import java.util.ArrayList;

public class InMemoryMantraDao implements IMantraDao {

   ArrayList<Mantra> _mantras;

    public InMemoryMantraDao() {
        _mantras= new ArrayList<>();
        Mantra a= new Mantra();
        a.setId("Mantra01");
        a.setWord("Olağanüstü şeyler başarabilirim.");

        _mantras.add(a);
    }



    @Override
    public ArrayList<Mantra> GetAll() {
        return _mantras;
    }

    @Override
    public void Add(Mantra entity) {
        _mantras.add(entity);
    }

    @Override
    public void Update(Mantra entity) {

    }

    @Override
    public void Delete(Mantra entity) {

    }
}
