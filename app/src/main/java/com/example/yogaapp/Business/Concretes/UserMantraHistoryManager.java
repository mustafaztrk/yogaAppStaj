package com.example.yogaapp.Business.Concretes;

import com.example.yogaapp.Business.Abstracts.IUserMantraHistoryService;
import com.example.yogaapp.DataAccess.Abstracts.IUserMantraHistoryDao;
import com.example.yogaapp.Entities.Concretes.UserMantraHistory;

import java.util.ArrayList;

public class UserMantraHistoryManager implements IUserMantraHistoryService {

    private IUserMantraHistoryDao _history;

    public UserMantraHistoryManager(IUserMantraHistoryDao _history) {
        this._history = _history;
    }


    @Override
    public ArrayList<UserMantraHistory> GetAll() {
        return _history.GetAll();
    }

    @Override
    public void Add(UserMantraHistory history) {
        _history.Add(history);
    }
}
