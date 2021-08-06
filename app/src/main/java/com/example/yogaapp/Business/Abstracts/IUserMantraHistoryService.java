package com.example.yogaapp.Business.Abstracts;

import com.example.yogaapp.Entities.Concretes.UserMantraHistory;

import java.util.ArrayList;

public interface IUserMantraHistoryService {
    ArrayList<UserMantraHistory> GetAll();
    void Add(UserMantraHistory history);
}
