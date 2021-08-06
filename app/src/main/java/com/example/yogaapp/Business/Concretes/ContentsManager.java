package com.example.yogaapp.Business.Concretes;

import com.example.yogaapp.Business.Abstracts.IContentsService;
import com.example.yogaapp.DataAccess.Abstracts.IContentsDao;
import com.example.yogaapp.Entities.Abstracts.IEntity;
import com.example.yogaapp.Entities.Concretes.Contents;

import java.util.ArrayList;

public class ContentsManager implements IContentsService {
   IContentsDao _contentsDao;

    public ContentsManager() {
    }

    public ContentsManager(IContentsDao _contentsDao) {
        this._contentsDao = _contentsDao;
    }

    @Override
    public ArrayList<Contents> GetAll() { return _contentsDao.GetAll(); }

    public void Add(Contents entity){
        _contentsDao.Add( entity);
    }


}
