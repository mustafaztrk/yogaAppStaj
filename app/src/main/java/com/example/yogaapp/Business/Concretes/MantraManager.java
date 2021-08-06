package com.example.yogaapp.Business.Concretes;

import com.example.yogaapp.Business.Abstracts.IMantraService;
import com.example.yogaapp.DataAccess.Abstracts.IMantraDao;
import com.example.yogaapp.Entities.Concretes.Contents;
import com.example.yogaapp.Entities.Concretes.Mantra;

import java.util.ArrayList;

public class MantraManager implements IMantraService {
    IMantraDao _mantra;

    public MantraManager(IMantraDao _mantra) {
        this._mantra = _mantra;
    }

    @Override
    public ArrayList<Mantra> GetAll() {
        return _mantra.GetAll();
    }

    public void Add(Mantra entity){
        _mantra.Add( entity);
    }

}
