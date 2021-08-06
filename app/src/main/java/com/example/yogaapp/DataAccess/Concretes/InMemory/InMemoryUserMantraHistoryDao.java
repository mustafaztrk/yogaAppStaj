package com.example.yogaapp.DataAccess.Concretes.InMemory;

import com.example.yogaapp.DataAccess.Abstracts.IUserMantraHistoryDao;
import com.example.yogaapp.Entities.Concretes.UserMantraHistory;

import java.util.ArrayList;

public class InMemoryUserMantraHistoryDao implements IUserMantraHistoryDao {

   ArrayList<UserMantraHistory> _history;

  public InMemoryUserMantraHistoryDao() {
   _history=new ArrayList<UserMantraHistory>();
   UserMantraHistory us1=new UserMantraHistory();
   us1.setId("21321-fdsf322");
   us1.setUserId("23123d-dfds2");
   ArrayList<String> wordCode=new ArrayList<String>();
   wordCode.add("Mantra01");wordCode.add("Mantra09");
   us1.setCodes(wordCode);

   _history.add(us1);

  }
    @Override
    public ArrayList<UserMantraHistory> GetAll() {
        return _history;
    }
    @Override
    public void Add(UserMantraHistory entity) {
     _history.add(entity);
    }

    @Override
    public void Update(UserMantraHistory entity) {

    }

    @Override
    public void Delete(UserMantraHistory entity) {

    }
}
