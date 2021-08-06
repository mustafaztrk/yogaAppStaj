package com.example.yogaapp.Business.Abstracts;

import com.example.yogaapp.Entities.Concretes.Product;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<Product> GetAll();
}
