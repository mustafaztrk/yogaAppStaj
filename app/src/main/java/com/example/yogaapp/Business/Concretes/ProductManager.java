package com.example.yogaapp.Business.Concretes;

import com.example.yogaapp.Business.Abstracts.IProductService;
import com.example.yogaapp.DataAccess.Abstracts.IProductDao;
import com.example.yogaapp.Entities.Concretes.Product;

import java.util.ArrayList;

public class ProductManager implements IProductService {
    IProductDao _productDao;

    public ProductManager(IProductDao _productDao) {
        this._productDao = _productDao;
    }

    @Override
    public ArrayList<Product> GetAll() {
        return _productDao.GetAll();
    }


}
