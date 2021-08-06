package com.example.yogaapp.DataAccess.Abstracts;

import com.example.yogaapp.Entities.Abstracts.IEntity;

import java.util.ArrayList;
import java.util.List;

public interface IEntityRepository<T> {

    ArrayList<T> GetAll();
    void Add(T entity);
    void Update(T entity);
    void Delete(T entity);

}
