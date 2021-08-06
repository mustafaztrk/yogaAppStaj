package com.example.yogaapp.Business.Concretes;

import com.example.yogaapp.Business.Abstracts.IMoodTrackingService;
import com.example.yogaapp.DataAccess.Abstracts.IMoodTracingDao;
import com.example.yogaapp.Entities.Concretes.MoodTracking;

import java.util.ArrayList;

public class MoodTrackingManager implements IMoodTrackingService {

    IMoodTracingDao _moodTrackingDao;

    public MoodTrackingManager(IMoodTracingDao _moodTrackingDao) {
        this._moodTrackingDao = _moodTrackingDao;
    }

    @Override
    public ArrayList<MoodTracking> GetAll() {
       return  _moodTrackingDao.GetAll();
    }

    @Override
    public void Add(MoodTracking entity) {
        _moodTrackingDao.Add(entity);
    }

    @Override
    public void Update(MoodTracking entity) {

    }

    @Override
    public void Delete(MoodTracking entity) {

    }
}
