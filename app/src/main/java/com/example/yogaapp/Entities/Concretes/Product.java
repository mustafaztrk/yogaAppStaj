package com.example.yogaapp.Entities.Concretes;

import com.example.yogaapp.Entities.Abstracts.IEntity;

public class Product implements IEntity {

    private int ProductId;
    private int CategoryId;
    private String ProductName;
    private short UnitsInStock;


    public Product() {

    }

    public Product(int productId, int categoryId, String productName, short unitsInStock) {
        ProductId = productId;
        CategoryId = categoryId;
        ProductName = productName;
        UnitsInStock = unitsInStock;
    }

    public int getProductId(String s) {
        return ProductId;
    }

    public void setProductId(int productId) {
        ProductId = productId;
    }

    public int getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(int categoryId) {
        CategoryId = categoryId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public short getUnitsInStock() {
        return UnitsInStock;
    }

    public void setUnitsInStock(short unitsInStock) {
        UnitsInStock = unitsInStock;
    }
}
