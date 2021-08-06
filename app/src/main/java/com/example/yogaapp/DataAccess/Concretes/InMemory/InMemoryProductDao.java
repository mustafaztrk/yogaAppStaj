package com.example.yogaapp.DataAccess.Concretes.InMemory;

import com.example.yogaapp.DataAccess.Abstracts.IProductDao;
import com.example.yogaapp.Entities.Concretes.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductDao implements IProductDao {

     ArrayList<Product> _products;


    public InMemoryProductDao() {
       _products=new ArrayList<Product>();
       Product a= new Product();
       a.setProductId(1);
       a.setProductName("Bardak");
       a.setCategoryId(2);
       a.setUnitsInStock((short) 50);


       _products.add(a);
    }


    @Override
    public ArrayList<Product> GetAll() {
        return _products;
    }


    @Override
    public void Add(Product entity) {
        _products.add(entity);
    }

    @Override
    public void Update(Product entity) {

    }

    @Override
    public void Delete(Product entity) {

    }
}
